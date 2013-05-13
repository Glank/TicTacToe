package ttt.model;

public class Player{
	private int wins;
	private char symbol;
	public  Player(char symbol){
		this.symbol = symbol;
		wins = 0;
	}
	public int getWins(){
		return wins;
	}
	public void addWin(){
		wins++;
	}
	public char getSymbol(){
		return symbol;
	}
}
