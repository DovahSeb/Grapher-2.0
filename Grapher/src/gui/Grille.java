package gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Grille extends JPanel{
	
	private static final long serialVersionUID = 1L;
	public PositionPanel pp;
	
	public Grille(PositionPanel pp) {
		this.setBackground(Color.white);
		this.addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseMoved(MouseEvent me) {
				int x = me.getX();
				int y = me.getY();
				pp.xcoord.setText("x = " + x);
				pp.ycoord.setText("y = " + y);
				
			}
		});
	}
	

}
