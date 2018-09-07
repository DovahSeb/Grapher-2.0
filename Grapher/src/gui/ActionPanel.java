package gui;

import java.awt.*;
import javax.swing.*;


public class ActionPanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	public JLabel xmin, xmax, ymin, ymax;
	public JTextField xminval, xmaxval, yminval, ymaxval;
	public JButton refresh, zoomp, zoomn;
	
	public ActionPanel() {
		this.setBackground(Color.gray);
		this.setLayout(new GridLayout(8,2,0,80));
		
		this.add(xmin = new JLabel());
		this.add(xminval = new JTextField());
		
		this.add(xmax = new JLabel());
		this.add(xmaxval = new JTextField());
		
		this.add(ymin = new JLabel());
		this.add(yminval = new JTextField());
		
		this.add(ymax = new JLabel());
		this.add(ymaxval = new JTextField());
		
		this.add(zoomp = new JButton());
		this.add(zoomn = new JButton());
		
		this.add(refresh = new JButton());
	}
	
	public void affichexmin() {
		xmin.setText("xmin");
	}
	
	public void affichexminval() {
		xminval.setText("-10");
	}
	
	public void affichexmax() {
		xmax.setText("xmax");
	}
	
	public void affichexmaxval() {
		xmaxval.setText("10");
	}
	
	public void afficheymin() {
		ymin.setText("ymin");
	}
	
	public void afficheyminval() {
		yminval.setText("0");
	}
	
	public void afficheymax() {
		ymax.setText("ymax");
	}
	
	public void afficheymaxval() {
		ymaxval.setText("10");
	}
	
	public void afficheZoomp() {
		zoomp.setText("+");
	}
	
	public void afficheZoomn() {
		zoomn.setText("-");
	}
	
	public void afficherefresh() {
		refresh.setText("Refresh");
	}
	
}
