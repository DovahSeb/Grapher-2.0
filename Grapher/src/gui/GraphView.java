package gui;

import javax.swing.JFrame;
import java.awt.*;

public class GraphView extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	//Variables
	public PositionPanel positionpanel;
	public EvalPanel evalpanel;
	public ActionPanel actionpanel;
	public Grille grille;
	
	
	public GraphView() {
			
		setTitle("Grapher");
		setSize(new Dimension(800, 800));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		//Position Panel
		//PositionPanel positionpanel;
		this.getContentPane().add(positionpanel = new PositionPanel(), "North");

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
		actionpanel.affciherefresh();
		
		//Grille
		//Grille grille;
		this.getContentPane().add(grille = new Grille(positionpanel), "Center");
		
	}
}
