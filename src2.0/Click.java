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
	static int x1;
	static int x2;
	static int y1;
	static int y2;
	public  Click(int x,int y, DrawCircle circle)
	{
		if (numPoints == 0)
		{
			x1=x;
			y1=y;
			numPoints += 1;
		}
		else
		{
			x2=x;
			y2=y;
			circle.canvas.repaint();
			numPoints=0;
		}
	}

	
}