package com.example.rest;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.Map;

@ApplicationScoped
@Path("/members")
public class MemberResource {
    
    private Map<Long, Member> members = new HashMap<>();
    
    public MemberResource() {
        // Initialize with sample data
        members.put(1L, new Member(1L, "John Doe", "john.doe@example.com", "555-1234"));
        members.put(2L, new Member(2L, "Jane Smith", "jane.smith@example.com", "555-5678"));
        members.put(3L, new Member(3L, "Bob Johnson", "bob.johnson@example.com", "555-9012"));
    }
    
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getMember(@PathParam("id") Long id) {
        Member member = members.get(id);
        if (member == null) {
            return Response.status(Response.Status.NOT_FOUND)
                    .entity("{\"error\":\"Member not found\"}")
                    .build();
        }
        return Response.ok(member).build();
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllMembers() {
        return Response.ok(members.values()).build();
    }
}
