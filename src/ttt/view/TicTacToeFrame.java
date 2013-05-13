package ttt.view;
import java.awt.BorderLayout;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import ttt.controller.GameFlowController;
import ttt.controller.MenuBarListener;
import ttt.model.Player;


public class TicTacToeFrame extends JFrame{
	private static final long serialVersionUID = 4069490083055245227L;
	public static final String HELP_FILE = "html"+File.separator+"help.html";
	public static final String ABOUT_FILE = "html"+File.separator+"about.html";
	private BoardPanel board;
	private MenuBarListener mbListener;
	private HTMLDisplayDialog helpDialog;
	private HTMLDisplayDialog aboutDialog;
	private NewGameDialog newGameDialog;
	public TicTacToeFrame(GameFlowController gfl){
		board = new BoardPanel(gfl);
		helpDialog = new HTMLDisplayDialog(new File(HELP_FILE), "Help");
		aboutDialog = new HTMLDisplayDialog(new File(ABOUT_FILE), "About");
		newGameDialog = new NewGameDialog(gfl);
		mbListener = new MenuBarListener(this);
		
		initMenuBar();
		
		add(board, BorderLayout.CENTER);
		
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Tic Tac Toe");
		setLocationRelativeTo(null); //center
		setResizable(false);
	}
	private void initMenuBar(){
		JMenuBar menu = new JMenuBar();
		JMenu file = new JMenu("File");
		menu.add(file);
		JMenu helpMenu = new JMenu("Help");
		menu.add(helpMenu);
		
		JMenuItem newGame = new JMenuItem("New Game");
		newGame.addActionListener(mbListener);
		file.add(newGame);
		
		JMenuItem help = new JMenuItem("Help");
		help.addActionListener(mbListener);
		helpMenu.add(help);
		
		JMenuItem about= new JMenuItem("About");
		about.addActionListener(mbListener);
		helpMenu.add(about);
		
		setJMenuBar(menu);
	}
	public BoardPanel getBoard(){
		return board;
	}
	public void update(){
		repaint();
	}
	public void openNewGameDialog(){
		newGameDialog.setVisible(true);
	}
	public void openHelpDialog(){
		helpDialog.setVisible(true);
	}
	public void openAboutDialog(){
		aboutDialog.setVisible(true);
	}
	public void announceEnd(Player p){
		if(p!=null)
			JOptionPane.showMessageDialog(this, "Player "+p.getSymbol()+" Wins!");
		else
			JOptionPane.showMessageDialog(this, "Tie.");
	}
	public boolean askPlayAgain() {
		int result = JOptionPane.showConfirmDialog(this, "Play again?");
		return result==JOptionPane.YES_OPTION;
	}
}
