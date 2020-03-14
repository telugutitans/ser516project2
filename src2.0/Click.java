import java.awt.Graphics;
import java.awt.Point;

public class Click {
	private static int numPoints = 0;
	private static Point p1;
	private static Point p2;

	public Click(int x, int y, DrawShape shape) {
		if (numPoints == 0) {
			numPoints += 1;
			p1 = new Point(x, y);
			Point relative = new Point(x - shape.positionX, y - shape.positionY);
			Point[] shapePoints = { p1, relative };
			shape.connections.add(shapePoints);
		} else {
			p2 = new Point(x, y);
			Point[] points = { p1, p2 };
			Point relative = new Point(x - shape.positionX, y - shape.positionY);
			Point[] shapePoints = { p2, relative };
			shape.connections.add(shapePoints);
			shape.canvas.lineArray.add(points);
			shape.canvas.repaint();
			numPoints = 0;
		}
	}

}