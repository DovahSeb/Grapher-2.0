package gui;

import javax.swing.JFrame;

import eval.Parser;

import java.awt.*;

public class GraphView extends JFrame{
	
	
	
	private static final long serialVersionUID = 1L;

	//private static final LayoutManager JPanel = null;
	
	//Variables
	public PositionPanel positionpanel;
	public EvalPanel evalpanel;
	public ActionPanel actionpanel;
	public Grille grille;
	//public Function function;
	
	
	public GraphView() {
		
		super();
		
		//Eval Panel
		EvalPanel evalpanel;
		this.getContentPane().add(evalpanel = new EvalPanel(), "South");
		evalpanel.afficheEval();
		//evalpanel.afficheText();
		evalpanel.afficheTracer();
		
		//Action Panel
		ActionPanel actionpanel;
		this.getContentPane().add(actionpanel = new ActionPanel(), "West");
		actionpanel.affichexmin();
		actionpanel.affichexmax();
		actionpanel.afficheymin();
		actionpanel.afficheymax();
		actionpanel.afficheZoomp();
		actionpanel.afficheZoomn();
		actionpanel.afficherefresh();
		
		//Grille
		//Grille grille;
		this.getContentPane().add(grille = new Grille(), "Center" );
		
		setTitle("Grapher");
		setPreferredSize(new Dimension(800, 800));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      	pack();
		setVisible(true);
	}
	
	void prepareFunction() throws Exception {
		try {
            //Parser parser = new Parser(EvalPanel.expression());
            //fonction = parser.parsing();
            grille.repaint();
        } catch (Exception e) {
            throw e;
        }
	}
}
