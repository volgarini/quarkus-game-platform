package br.com.jogo.velha.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.jogo.velha.Action;

class GameServiceTest {
	private GameService gameService;

	@BeforeEach
	void beforeTests() {
		gameService = new GameService();
	}

	@Test
	void shouldReturnZero() {
		gameService.move(new Action(1, "casa1"));

		int vic = gameService.move(new Action(1, "casa2"));

		assertEquals(0, vic);
	}

	@Test
	void shouldReturnOne() {
		gameService.move(new Action(1, "casa1"));
		
		gameService.move(new Action(1, "casa2"));

		int vic = gameService.move(new Action(1, "casa3"));

		assertEquals(1, vic);
	}
	
	@Test
	void shouldReturnTwo() {
		gameService.move(new Action(2, "casa1"));
		
		gameService.move(new Action(2, "casa2"));

		int vic = gameService.move(new Action(2, "casa3"));

		assertEquals(2, vic);
	}
}
