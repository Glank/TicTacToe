package ttt.controller;

import java.util.LinkedList;

import ttt.model.GameState;
import ttt.model.Move;
import ttt.model.Player;

public class AI{
	private int depth;
	private char me;
	public AI(int movesToLookAhead, char symbol){
		depth = movesToLookAhead;
		me = symbol;
	}
	
	private int getHeuristicValue(GameState state){
		Player winner = state.getWinner();
		int val;
		if(winner==null)
			val = 0;
		else if(winner.getSymbol()==me)
			val = 1;
		else
			val = -1;
		//System.out.println(val);
		//System.out.println(state);
		return val;
	}
	
	private int getValue(GameState node, int depth, boolean min){
		LinkedList<Move> moves = node.getMoves();
		if(moves.size()==0 || node.getWinner()!=null || depth<=0){
			return getHeuristicValue(node);
		}
		int alpha = min?1:-1;
		for(Move move:moves){
			node.doMove(move);
			if(min)
				alpha = Math.min(alpha, getValue(node, depth-1, false));
			else
				alpha = Math.max(alpha, getValue(node, depth-1, true));
			node.undoMove(move);
		}
		return alpha;
	}
	
	public Move getMove(GameState state){
		if(depth==0)
			return state.getRandomMove();
		LinkedList<Move> moves = state.getMoves();
		int bestScore = -1;
		int bestSmartScore = -1;
		Move bestMove = null;
		Move bestSmartMove = null;
		int d = depth;
		while(d>0 && bestScore<=0)
		{
			for(Move move:moves){
				state.doMove(move);
				int score = getValue(state, depth, true);
				//System.out.println(me+": " + score);
				//System.out.println(state+"\n");
				state.undoMove(move);
				if(bestMove==null || score>bestScore || 
						(score==bestScore && Math.random()<.5)){
					bestMove = move;
					bestScore = score;
				}
			}
			if(d==depth){
				bestSmartMove = bestMove;
				bestSmartScore = bestScore;
			}
			d--;
		}
		state.doMove(bestMove);
		int realScore = getValue(state, depth, true);
		state.undoMove(bestMove);
		if(realScore<bestSmartScore)
			return bestSmartMove;
		return bestMove;
	}
}
