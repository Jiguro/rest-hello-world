package com.example.resthelloworld.config;

import com.example.resthelloworld.resource.HelloWorldResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import javax.ws.rs.ApplicationPath;

@Configuration
@ApplicationPath("api")
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(HelloWorldResource.class);
    }
}
