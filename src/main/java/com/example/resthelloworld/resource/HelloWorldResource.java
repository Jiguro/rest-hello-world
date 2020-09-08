package com.example.resthelloworld.resource;

import org.springframework.stereotype.Component;

import javax.inject.Singleton;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Map;

@Component
@Singleton
@Path("/")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class HelloWorldResource {

    @GET
    @Path("/hello-world")
    public Map<String, String> greeting() {
        return Map.of("Hello", "World!");
    }

}
