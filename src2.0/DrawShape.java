import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JLabel;
/**
 * This class implements the drawing of shapes drag and drop within canvas.
 * @author Ashwath Reddy Koppala
 * @created on 1-29-2020
 * @version 1.0
 *
 */
public class DrawShape extends JLabel 
{
	DrawingCanvas canvas;
	String shape;
	public int [] connections = new int[2];
	 public DrawShape(DrawingCanvas c, String name)
	 {
		 shape = name;
		 canvas = c;
	 }
}