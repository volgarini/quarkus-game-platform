package br.com.jogo.velha.api;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;

@Path("/about")
public class AboutResource {
	@Inject
	Template about;

	@GET
	@Produces(MediaType.TEXT_HTML)
	public TemplateInstance about() {
		return about.data("tittle", "Quarkus Game Platform")//
				.data("dev", "Dev > Lucas Volgarini")//
				.data("list", "List of games:")//
				.data("tic", "Tic-Tac-Toe")//
				.data("since", "Since 2020");
	}
}