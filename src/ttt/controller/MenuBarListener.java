package ttt.controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ttt.view.TicTacToeFrame;


public class MenuBarListener implements ActionListener{
	private TicTacToeFrame parent;
	public MenuBarListener(TicTacToeFrame parent){
		this.parent = parent;
	}
	public void actionPerformed(ActionEvent e){
		String command = e.getActionCommand();
		if(command.equals("New Game"))
			parent.openNewGameDialog();
		else if(command.equals("Help"))
			parent.openHelpDialog();
		else if(command.equals("About"))
			parent.openAboutDialog();
		else
			throw new RuntimeException("Unknown Action Command: " + command);
	}
}
