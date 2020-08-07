package br.com.jogo.velha.api;

import static io.restassured.RestAssured.given;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
class AboutResourceTest {

	@Test
	void testHelloEndpoint() {
		given().when().get("/about").then().statusCode(200);
	}

}