package br.com.jogo.velha.api;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import br.com.jogo.velha.Action;
import br.com.jogo.velha.service.GameService;
import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;

@Path("/game")
public class GameResource {

	@Inject
	Template game;
	
	@Inject
	private GameService gameService;

	@GET 
	@Produces(MediaType.TEXT_HTML)
	public TemplateInstance game() {
		return game.instance();
	}
	
	@POST
	public Response action (Action action) {
		return Response.ok(gameService.move(action)).status(Status.OK).build();
	}
}

