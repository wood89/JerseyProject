package io.khasang.jersey.service;

import org.springframework.stereotype.Controller;

import javax.ws.rs.*;

@Controller
@Path("hello/{name}")
public class HelloService {
    @GET
    @Produces("text/plain")
    public String sayHello(@PathParam("name") String name){
        StringBuilder stringBuilder = new StringBuilder("Hello, ");
        stringBuilder.append(name).append("!");
        return stringBuilder.toString();
    }

  /*   @POST
    @Produces("text/plain")
    public String createWord(String word){
        StringBuilder stringBuilder = new StringBuilder("Hello, ");
        stringBuilder.append(word).append("!");
        return stringBuilder.toString();
    }

   @PUT
    @Produces("text/plain")
    public String updateWord(String name){
        StringBuilder stringBuilder = new StringBuilder("Hello, ");
        stringBuilder.append(name).append("!");
        return stringBuilder.toString();
    }*/

    @DELETE
    @Produces("text/plain")
    public String deleteWord(@PathParam("name") String name){
        StringBuilder stringBuilder = new StringBuilder("Hello, ");
        stringBuilder.append(name).append("!");
        return stringBuilder.toString();
    }
}