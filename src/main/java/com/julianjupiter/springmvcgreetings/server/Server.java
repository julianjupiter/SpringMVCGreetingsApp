package com.julianjupiter.springmvcgreetings.server;

public interface Server {
	void run(String[] args);

	static Server newServer() {
		return new TomcatServer();
	}
}
