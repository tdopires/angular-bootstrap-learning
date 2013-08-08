package br.com.dextra.learning.rs;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

@Path("/petshop/dog")
public class PetShopRS {

	private static JsonArray dogs = new JsonArray();

	@POST
	@Produces(MediaType.APPLICATION_JSON + "; charset=UTF-8")
	public Response registerNewDog(@FormParam("name") String name) {
		JsonObject dog = new JsonObject();
		dog.addProperty("name", name);
		dogs.add(dog);
		return Response.ok().build();
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON + "; charset=UTF-8")
	public Response listDogs() {
		return Response.ok(dogs.toString()).build();
	}
}
