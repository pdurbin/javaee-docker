package com.greptilian;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("message")
public class MessageResource {

    @GET
    public String message() {
        return "It works!\n";
    }
}
