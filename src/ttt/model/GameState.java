package ttt.model;

import java.util.LinkedList;


public class GameState{
	private Player[] players = new Player[2];
	private char[][] squares = new char[3][3];
	private int playerTurn;
	public GameState(){
		players[0] = new Player('X');
		players[1] = new Player('O');
		resetBoard();
	}
	public void resetBoard(){
		for(int r = 0; r < squares.length; r++){
			for(int c = 0; c < squares[r].length; c++){
				squares[r][c] = ' ';
			}
		}
		playerTurn = 0;
	}
	public void doMove(Move move){
		squares[move.row][move.col] = getPlayerTurn().getSymbol();
		incrementPlayerTurn();
	}
	public void undoMove(Move move){
		squares[move.row][move.col] = ' ';
		decrementPlayerTurn();
	}
	public LinkedList<Move> getMoves(){
		LinkedList<Move> moves = new LinkedList<Move>();
		for(int r = 0; r < squares.length; r++){
			for(int c = 0; c < squares[r].length; c++){
				if(squares[r][c] == ' '){
					moves.add(new Move(r,c));
				}
			}
		}
		return moves;
	}
	public Move getRandomMove(){
		LinkedList<Move> moves = getMoves();
		return moves.get((int)(Math.random()*moves.size()));
	}
	public void setSquare(int r, int c, char s){
		squares[r][c] = s;
	}
	public char getSquare(int r, int c){
		return squares[r][c];
	}
	public Player getPlayer(int i){
		return players[i];
	}
	public Player getPlayer(char c){
		for(Player p:players)
			if(p.getSymbol()==c)
				return p;
		return null;
	}
	public Player getPlayerTurn(){
		return players[playerTurn];
	}
	public void incrementPlayerTurn(){
		playerTurn++;
		if(playerTurn>=players.length)
			playerTurn = 0;
	}
	public void decrementPlayerTurn(){
		playerTurn--;
		if(playerTurn<0)
			playerTurn = players.length-1;
	}
	public boolean isTie(){
		for(int r = 0; r < squares.length; r++){
			for(int c = 0; c < squares[r].length; c++){
				if(squares[r][c] == ' ')
					return false;
			}
		}
		return getWinner()==null;
	}
	public Player getWinner(){
		int maxLength = 0;
		char maxS = ' ';
		for(int r = 0; r < squares.length; r++){
			for(int c = 0; c < squares[r].length; c++){
				for(int dr = -1; dr <= 1; dr++){
					for(int dc = -1; dc <= 1; dc++){
						if(dr!=0 || dc!=0){
							int length = getLength(r,c,dr,dc);
							if(length>maxLength){
								maxLength = length;
								maxS = squares[r][c];
							}
						}
					}
				}
			}
		}
		if(maxS == ' ' || maxLength<3)
			return  null;
		return getPlayer(maxS);
	}
	private int getLength(int r, int c, int dr, int dc){
		int length = 0;
		char s = squares[r][c];
		if(s==' ')
			return 0;
		while(r>=0 && r<squares.length && c>=0 && c<squares[r].length && squares[r][c]==s){
			length++;
			r+=dr;
			c+=dc;
		}
		return length;
	}
	@Override
	public String toString(){
		StringBuilder builder = new StringBuilder();
		for(int r = 0; r < squares.length; r++){
			if(r!=0){
				builder.append(System.lineSeparator());
				for(int i = 0; i < squares[r].length*2-1; i++)
					builder.append('-');
				builder.append(System.lineSeparator());
			}
			for(int c = 0; c < squares[r].length; c++){
				if(c!=0)
					builder.append('|');
				builder.append(squares[r][c]);
			}
		}
		return builder.toString();
	}
}
