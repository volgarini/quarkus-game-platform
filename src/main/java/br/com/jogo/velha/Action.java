package br.com.jogo.velha;


public class Action {
	private int turn;
	private String position;
	
	public Action(int turn, String position) {
		this.turn = turn;
		this.position = position;
	}
	
	public Action() {
	}

	public int getTurn() {
		return turn;
	}

	public void setTurn(int turn) {
		this.turn = turn;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "Action [turn=" + turn + ", position=" + position + "]";
	}
	
	
}
