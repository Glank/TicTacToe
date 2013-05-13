package ttt.controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ttt.view.NewGameDialog;


public class NewGameListener implements ActionListener{
	private NewGameDialog parent;
	private GameFlowController gfl;
	public NewGameListener(NewGameDialog parent, GameFlowController gfl) {
		this.parent = parent;
		this.gfl = gfl;
	}
	public void actionPerformed(ActionEvent e){
		if(e.getActionCommand().equals("OK")){
			gfl.newGame(parent.getXAI(), parent.getOAI());
		}
		parent.dispose();
	}
}
