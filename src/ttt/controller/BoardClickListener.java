package ttt.controller;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import ttt.view.BoardPanel;

public class BoardClickListener implements MouseListener{
	private GameFlowController gfl;
	public  BoardClickListener(GameFlowController gfl){
		this.gfl = gfl;
	}
	@Override
	public void mouseClicked(MouseEvent e) {}
	@Override
	public void mousePressed(MouseEvent e) {}
	@Override
	public void mouseReleased(MouseEvent e) {
		if(gfl.getState().getWinner()==null){
			int r = e.getY()/BoardPanel.SQUARE_SIZE;
			int c = e.getX()/BoardPanel.SQUARE_SIZE;
			gfl.tryPlayMove(r, c, true);
		}
	}
	@Override
	public void mouseEntered(MouseEvent e) {}
	@Override
	public void mouseExited(MouseEvent e) {}
}
