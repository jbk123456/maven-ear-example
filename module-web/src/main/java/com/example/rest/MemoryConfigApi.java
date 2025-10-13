package com.example.rest;

import javax.annotation.security.RolesAllowed;
import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.openapi.annotations.parameters.Parameter;


@Path("/microprofile-ext/memoryconfigsource")
public class MemoryConfigApi {
 
  
    
    @GET
    @RolesAllowed({ "master" })
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAll(@Parameter(name = "configsource", description = "Only look at a certain config source", required = false, allowEmptyValue = true, example = "MemoryConfigSource")
                                @QueryParam("configsource") String configsource){
       
            return allToJson();
        
    }
    

  

    private Response allToJson() {
        JsonArrayBuilder arrayBuilder = Json.createArrayBuilder();
       
        return Response.ok(arrayBuilder.build()).build();
    }
    
    
}