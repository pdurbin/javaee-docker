package com.greptilian;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("message")
public class MessageResource {

    @GET
    public String message() {
        return "It works!\n";
    }
}
