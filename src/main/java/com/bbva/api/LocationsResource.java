package com.bbva.api;

import com.bbva.api.beans.Location;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

/**
 * A JAX-RS interface.  An implementation of this interface must be provided.
 */
@Path("/locations")
public interface LocationsResource {
  @GET
  @Produces("application/json")
  List<Location> generatedMethod1();

  @Path("/{id}")
  @GET
  @Produces("application/json")
  Location generatedMethod2(@PathParam("id") Integer id);

  @Path("/bbva/{id}")
  @POST
  @Produces("application/json")
  String generatedMethod3(@PathParam("id") Integer id, @QueryParam("filtering") Integer filtering);
}
