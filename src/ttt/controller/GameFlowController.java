package ttt.controller;
import ttt.model.GameState;
import ttt.model.Move;
import ttt.model.Player;
import ttt.view.TicTacToeFrame;


public class GameFlowController{
	private GameState state;
	private AI playerX;
	private AI playerO;
	private TicTacToeFrame view;
	public GameFlowController(){
		state = new GameState();
	}
	
	public void setView(TicTacToeFrame view){
		this.view = view;
	}
	
	public void newGame(AI playerX, AI playerO){
		this.playerX = playerX;
		this.playerO = playerO;
		state.resetBoard();
		attemptAIMove();
		view.update();
	}
	public GameState getState(){
		return state;
	}
	public boolean tryPlayMove(int r, int c, boolean human){
		if(r<0 || c<0 || r>=3 || c>=3)
			return false;
		if(state.getSquare(r, c)!=' ')
			return false;
		if(human && state.getPlayerTurn().getSymbol()=='X' && playerX!=null)
			return false;
		if(human && state.getPlayerTurn().getSymbol()=='O' && playerO!=null)
			return false;
		Move move = new Move(r,c);
		state.doMove(move);
		view.update();
		if(state.getWinner()!=null || state.isTie())
			gameOver();
		else
			attemptAIMove();
		//System.out.println(state);
		return true;
	}
	private void attemptAIMove() {
		if(state.getPlayerTurn().getSymbol()=='X' && playerX!=null){
			Move move = playerX.getMove(state);
			tryPlayMove(move.row, move.col, false);
		}
		else if(state.getPlayerTurn().getSymbol()=='O' && playerO!=null){
			Move move = playerO.getMove(state);
			tryPlayMove(move.row, move.col, false);
		}
	}

	private void gameOver(){
		Player winner = state.getWinner();
		view.announceEnd(winner);
		if(view.askPlayAgain())
			newGame(playerX, playerO);
	}
}
