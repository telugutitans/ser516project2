import java.awt.Graphics;
import java.awt.Point;

public class Click
{
	private static int numPoints = 0;
	static int x1;
	static int x2;
	static int y1;
	static int y2;
	public  Click(int x,int y, DrawShape shape)
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
			Point p1 = new Point(x1,y1);
			Point p2 = new Point(x2,y2);
			Point[] points = {p1,p2};
			shape.canvas.lineArray.add(points);
			shape.canvas.repaint();
			shape.connections[0] = x1;
			numPoints=0;
		}
	}

	/*public void paint(Graphics g)
	{
		//super.paint(g);
		System.out.print("line drwan");
		g.drawLine(Click.x1, Click.y1, Click.x2, Click.y2);
	}*/
}