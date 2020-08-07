package br.com.jogo.velha.service;

import java.util.HashMap;

import javax.enterprise.context.ApplicationScoped;

import br.com.jogo.velha.Action;

@ApplicationScoped
public class GameService {
	private final String CASA1 = "casa1";
	private final String CASA2 = "casa2";
	private final String CASA3 = "casa3";
	private final String CASA4 = "casa4";
	private final String CASA5 = "casa5";
	private final String CASA6 = "casa6";
	private final String CASA7 = "casa7";
	private final String CASA8 = "casa8";
	private final String CASA9 = "casa9";

	private HashMap<String, Integer> game;

	public GameService() {
		game = new HashMap<>();
	}

	private boolean contain(String key1, String key2, String key3) {
		return game.containsKey(key1) && game.containsKey(key2) && game.containsKey(key3);
	}

	private boolean sameItens(String key1, String key2, String key3) {
		return game.get(key1).equals(game.get(key2)) && game.get(key2).equals(game.get(key3));
	}

	public Integer move(Action action) {
		game.put(action.getPosition(), action.getTurn());

		Integer victory = checkResult();

		if (victory > 0) {
			game = new HashMap<>();
		}
		
		return victory;
	}

	public Integer checkResult() {
		if (contain(CASA1, CASA2, CASA3) && sameItens(CASA1, CASA2, CASA3)) {
			return game.get(CASA1);
		} else if (contain(CASA4, CASA5, CASA6) && sameItens(CASA4, CASA5, CASA6)) {
			return game.get(CASA4);
		} else if (contain(CASA7, CASA8, CASA9) && sameItens(CASA7, CASA8, CASA9)) {
			return game.get(CASA7);
		} else if (contain(CASA1, CASA5, CASA9) && sameItens(CASA1, CASA5, CASA9)) {
			return game.get(CASA1);
		} else if (contain(CASA3, CASA5, CASA7) && sameItens(CASA3, CASA5, CASA7)) {
			return game.get(CASA3);
		} else if (contain(CASA1, CASA4, CASA7) && sameItens(CASA1, CASA4, CASA7)) {
			return game.get(CASA1);
		} else if (contain(CASA2, CASA5, CASA8) && sameItens(CASA2, CASA5, CASA8)) {
			return game.get(CASA2);
		} else if (contain(CASA3, CASA6, CASA9) && sameItens(CASA3, CASA6, CASA9)) {
			return game.get(CASA9);
		}

		return 0;
	}

}
