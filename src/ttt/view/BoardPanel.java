package ttt.view;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import ttt.controller.BoardClickListener;
import ttt.controller.GameFlowController;
import ttt.model.GameState;


public class BoardPanel extends JPanel{
	private static final long serialVersionUID = -3630260607144688801L;
	public static final int SQUARE_SIZE = 100;
	private GameState state;
	public BoardPanel(GameFlowController gfl){
		state = gfl.getState();
		setPreferredSize(new Dimension(SQUARE_SIZE*3,SQUARE_SIZE*3));
		addMouseListener(new BoardClickListener(gfl));
	}
	@Override
	public void paint(Graphics g){
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, getWidth(), getHeight());
		g.setColor(Color.BLACK);
		//draw grid
		for(int c = 1; c<3; c++)
			g.drawLine(c*SQUARE_SIZE, 0, c*SQUARE_SIZE, 3*SQUARE_SIZE);
		for(int r = 1; r<3; r++)
			g.drawLine(0, r*SQUARE_SIZE, 3*SQUARE_SIZE, r*SQUARE_SIZE);
		if(g instanceof Graphics2D){
			Graphics2D g2 = (Graphics2D)g;
			g2.setStroke(new BasicStroke(6));
		}
		for(int r = 0; r<3; r++){
			for(int c = 0; c<3; c++){
				paintSquare(r,c,state.getSquare(r,c),g);
			}
		}
	}
	
	private void paintSquare(int r, int c, char v, Graphics g){
		int x = c*SQUARE_SIZE;
		int y = r*SQUARE_SIZE;
		if(v=='X')
			drawX(x,y,g);
		else if(v=='O')
			drawO(x,y,g);
		else if(v!=' ')
			throw new RuntimeException("Unknown player symbol: " + v);
	}
	
	private void drawX(int x, int y, Graphics g){
		g.drawLine(x+5, y+5, x+SQUARE_SIZE-9, y+SQUARE_SIZE-9);
		g.drawLine(x+SQUARE_SIZE-9, y+5, x+5, y+SQUARE_SIZE-9);
	}
	
	private void drawO(int x, int y, Graphics g){
		g.drawOval(x+5, y+5, SQUARE_SIZE-9, SQUARE_SIZE-9);
	}
}
