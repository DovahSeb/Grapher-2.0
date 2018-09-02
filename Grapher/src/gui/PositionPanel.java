package gui;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class PositionPanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	public JTextField xcoord, ycoord;
	
	public PositionPanel() {
		this.setBackground(Color.gray);
		this.setPreferredSize(new Dimension(0,30));
		this.setLayout(new GridLayout(1,1,80,0));
		this.add(xcoord = new JTextField());
		this.add(ycoord = new JTextField());
		
		this.addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseMoved(MouseEvent me) {
				int x = me.getX();
				int y = me.getY();
				xcoord.setText("x = " + x);
				ycoord.setText("y = " + y);
				
			}
		});

	}
	
	
}
