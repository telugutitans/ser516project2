import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Map;
import java.util.HashMap;
import javax.swing.JLabel;
import javax.swing.JPanel;
/** 
 * @author Snehith karna
 * @since 1-28-2020
 * @version 1.0
 */ 
public class DrawingCanvas extends JPanel implements MouseListener
{
	private SelectedShape shape;
	private Map<Point,String> hashmap;
	public DrawingCanvas()
	{
		hashmap=new HashMap();
		shape = new SelectedShape();
		this.setLayout(null);
		addMouseListener(this);
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		System.out.print("line drwan");
		g.drawLine(Click.x1, Click.y1, Click.x2, Click.y2);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(shape.name.equals("circle"))
		{
			DrawCircle figure = new DrawCircle(e.getX()-50,e.getY(),this);
			this.add((JLabel)figure); 
			this.repaint();
		}
		
		else if(shape.name.equals("square"))
		{
			DrawSquare figure = new DrawSquare(e.getX()-50,e.getY());
			this.add((JLabel)figure); 
			this.repaint();
		}
		
		else if(shape.name.equals("triangle"))
		{
			DrawTriangle figure = new DrawTriangle(e.getX()-50,e.getY());
			this.add((JLabel)figure); 
			this.repaint();
		}
		this.hashmap.put(new Point(e.getX()-50,e.getY()), SelectedShape.name);
	}

	public void mouseEntered(MouseEvent arg0) {}
	public void mouseExited(MouseEvent arg0) {}
	public void mousePressed(MouseEvent arg0) {}
	public void mouseReleased(MouseEvent arg0) {}
}
