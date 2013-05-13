package test.model;

import ttt.model.GameState;
import ttt.model.Move;
import ttt.model.Player;

public class GameDriver {
	public static void main(String[] args){
		GameState state = new GameState();
		Player winner = null;
		while((winner=state.getWinner())==null && !state.isTie()){
			Move move = state.getRandomMove();
			state.doMove(move);
			System.out.println(state+"\n");
		}
		if(winner==null)
			System.out.println("Tie.");
		else
			System.out.println(winner.getSymbol()+" Wins!");
	}
}
