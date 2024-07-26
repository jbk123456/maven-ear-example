package com.example.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.example.service.IExampleService;


@Path("/members")
@RequestScoped
public class MemberResourceRESTService {

   @EJB
   IExampleService exampleService;

   @GET
   public String listAllMembers() {
      return "ejb call: " + exampleService.whoAmI(null);
   }
}
