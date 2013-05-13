package ttt.controller;

import ttt.view.TicTacToeFrame;

public class Main{
	public static void main(String[] args){
		GameFlowController controler = new GameFlowController();
		TicTacToeFrame view = new TicTacToeFrame(controler);
		controler.setView(view);
		view.setVisible(true);
	}
}
