package ttt.view;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import ttt.controller.AI;


public class PlayerSelectPanel extends JPanel{
	private static final long serialVersionUID = 3099400132492315767L;
	private JRadioButton human;
	private JRadioButton easy;
	private JRadioButton medium;
	private JRadioButton hard;
	private char c;
	public  PlayerSelectPanel(char c){
		this.c = c;
		human = new JRadioButton("Human");
		easy = new JRadioButton("Easy AI");
		medium = new JRadioButton("Medium AI");
		hard = new JRadioButton("Hard AI");
		ButtonGroup group = new ButtonGroup();
		group.add(human);
		group.add(easy);
		group.add(medium);
		group.add(hard);
		human.setSelected(true);
		
		setLayout(new GridLayout(5,1));
		add(new JLabel("Player "+c));
		add(human);
		add(easy);
		add(medium);
		add(hard);
	}
	public AI getAI(){
		if(human.isSelected())
			return null;
		else if(easy.isSelected())
			return new AI(1, c);
		else if(medium.isSelected())
			return new AI(3, c);
		else if(hard.isSelected())
			return new AI(5, c);
		else
			throw new RuntimeException("Error selecting AI");
	}
}
