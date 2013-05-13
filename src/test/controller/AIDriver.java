package test.controller;

import ttt.controller.AI;
import ttt.model.GameState;
import ttt.model.Move;
import ttt.model.Player;

public class AIDriver {
	
	public static void main(String[] args){
		for(int i = 0; i < 100; i++){
			System.out.println(i);
			if(!test())
				return;
		}
		System.out.println("All tests complete.");
	}
	
	public static boolean test(){
		GameState state = new GameState();
		Player winner = null;
		AI playerX = new AI(5,'X');
		AI playerO = new AI(3,'O');
		while((winner=state.getWinner())==null && !state.isTie()){
			Move move = null;
			if(state.getPlayerTurn().getSymbol()=='X')
				move = playerX.getMove(state);
			else
				move = playerO.getMove(state);
			state.doMove(move);
			System.out.println(state+"\n");
		}
		return winner==null;
	}
}
