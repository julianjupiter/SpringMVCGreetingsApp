package com.julianjupiter.springmvcgreetings;

import com.julianjupiter.springmvcgreetings.server.Server;

public class SpringMVCGreetingsApplication {
    public static void main(String[] args) {
        Server.newServer().run(args);
    }
}
