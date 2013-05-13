package ttt.view;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;

import ttt.controller.AI;
import ttt.controller.GameFlowController;
import ttt.controller.NewGameListener;


public class NewGameDialog extends JDialog{
	private static final long serialVersionUID = -5068662067390820157L;
	private NewGameListener listener;
	private PlayerSelectPanel playerX;
	private PlayerSelectPanel playerO;
	public NewGameDialog(GameFlowController gfl){
		listener = new NewGameListener(this, gfl);
		playerX = new PlayerSelectPanel('X');
		playerO = new PlayerSelectPanel('O');
		add(playerX, BorderLayout.WEST);
		add(playerO, BorderLayout.EAST);
		JPanel buttons = getButtons();
		add(buttons, BorderLayout.SOUTH);
		
		pack();
		setModal(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null); //center
	}
	private JPanel getButtons(){
		JPanel panel = new JPanel(new FlowLayout());
		JButton ok = new JButton("OK");
		ok.addActionListener(listener);
		JButton cancel = new JButton("Cancel");
		cancel.addActionListener(listener);
		panel.add(ok);
		panel.add(cancel);
		return panel;
	}
	public AI getXAI(){
		return playerX.getAI();
	}
	public AI getOAI(){
		return playerO.getAI();
	}
}
