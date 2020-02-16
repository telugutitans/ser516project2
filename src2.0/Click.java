import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JLabel;
 
public class Click
{
	private static int numPoints = 0;
	private static int x1,x2,y1,y2;
	public  Click(int x,int y)
	{
		if (numPoints == 0)
		{
			x1=x;
			y1=y;
		}
		else
		{
			x2=x;
			y2=y;
			numPoints=0;
		}
	}
	private void paintLine(Graphics g)
	{
		g.drawLine(x1, y1, x2, y2);
	}
	   
	
	
	
	
	
	
}