package gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class EvalPanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	public JLabel eval;
	public JTextField function; 
	public JButton tracer;
	public GraphView graphview;
	
	public EvalPanel(){
		this.setBackground(Color.gray);
		this.setPreferredSize(new Dimension(0,40));
		this.setLayout(new GridLayout(1,3));
		this.add(eval = new JLabel());
		this.add(function = new JTextField());
		this.add(tracer = new JButton());
		
	}
	
	public void BListener() {
		tracer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					graphview.prepareFunction();
					
				} catch (Exception ex) {
					String msg = "Exception est " + ex;
					JOptionPane.showMessageDialog(null, msg, "Message d'Erreur", JOptionPane.ERROR_MESSAGE);
				}
			}
			
		});
	}
	
	public void afficheEval() {
		eval.setText("Entrer votre fonction f(x) : ");
	}
	
	public void afficheTracer() {
		tracer.setText("Tracer");
	}
	
	public String expression() {
		return function.getText();
	}

}
