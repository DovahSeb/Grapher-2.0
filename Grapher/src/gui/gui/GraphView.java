package gui;

import javax.swing.JFrame;
import java.awt.*;

public class GraphView extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	//Variables
	public PositionPanel positionpanel;
	public EvalPanel evalpanel;
	public ActionPanel actionpanel;
	
	public GraphView() {
		
		setTitle("Grapher");
		setSize(800, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Position Panel
		PositionPanel positionpanel;
		this.getContentPane().add(positionpanel = new PositionPanel(), "North");
		positionpanel.afficheCoord(0, 0);
		positionpanel.afficheFunc(0);
		
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
		
		setVisible(true);
		
		
	}
}
