package com.julianjupiter.springmvcgreetings.server;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.WebResourceRoot;
import org.apache.catalina.startup.Tomcat;
import org.apache.catalina.webresources.StandardRoot;

import java.io.File;
import java.lang.System.Logger;

class TomcatServer implements Server {

	private static final Logger LOGGER = System.getLogger(TomcatServer.class.getName());

	private static final String DEFAULT_HOST = "localhost";
	private static final int DEFAULT_PORT = 8080;
	private static final String DEFAULT_CONTEXT_PATH = "/";
	private static final String DOC_BASE = ".";
	private static final String ADDITION_WEB_INF_CLASSES = "src/main/";
	private static final String WEB_APP_MOUNT = "/WEB-INF/classes";
	private static final String INTERNAL_PATH = "/";

	@Override
	public void run(String[] args) {
		int port = this.port(args);
		Tomcat tomcat = this.tomcat(port);

		try {
			tomcat.start();
		} catch (LifecycleException exception) {
			LOGGER.log(Logger.Level.ERROR, exception.getMessage());
			LOGGER.log(Logger.Level.ERROR, "Exit...");
			System.exit(1);
		}

		LOGGER.log(Logger.Level.INFO, "Application started with URL {}.", DEFAULT_HOST + ":" + port + DEFAULT_CONTEXT_PATH);
		LOGGER.log(Logger.Level.INFO,"Hit Ctrl+D or Ctrl+C to stop it...");
		tomcat.getServer().await();
	}

	private int port(String[] args) {
		if (args.length > 0) {
			String port = args[0];
			try {
				return Integer.valueOf(port);
			} catch (NumberFormatException exception) {
				LOGGER.log(Logger.Level.ERROR, "Invalid port number argument {}", port, exception);
			}
		}

		return DEFAULT_PORT;
	}

	private Tomcat tomcat(int port) {
		Tomcat tomcat = new Tomcat();
		tomcat.setHostname(DEFAULT_HOST);
		tomcat.getHost().setAppBase(DOC_BASE);
		tomcat.setPort(port);
		tomcat.getConnector();
		this.context(tomcat);

		return tomcat;
	}

	private Context context(Tomcat tomcat) {
		Context context = tomcat.addWebapp("", DOC_BASE);
		File classes = new File(ADDITION_WEB_INF_CLASSES);
		String base = classes.getAbsolutePath();
		WebResourceRoot resources = new StandardRoot(context);
//		resources.addPreResources(new DirResourceSet(resources, WEB_APP_MOUNT, base, INTERNAL_PATH));
		context.setResources(resources);

		return context;
	}
}
