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
public class DrawCircle extends JLabel implements MouseListener,MouseMotionListener
{
	private int currentX;
	private int currentY;
	private int relativeX;
	private int relativeY;
	private int HEIGHT= 100;
	private int WIDTH = 100;
	
	public DrawCircle(int posX, int posY)
	{
		currentX = posX;
		currentY = posY;
		Dimension size = new Dimension(HEIGHT,WIDTH);
		this.setPreferredSize(size);
		this.setBounds(currentX, currentY, 100, 100);
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	
	public void paint(Graphics g)
	{
		g.setColor(Color.BLUE);
		g.fillOval(0, 0, 100, 100);
		g.setColor(Color.BLACK);
		g.fillOval(HEIGHT/2-5, WIDTH/2-5, 10, 10);
	}

	@Override
	public void mousePressed(MouseEvent e) 
	{
		relativeX = currentX - e.getX();
		relativeY = currentY - e.getY();
	}

	@Override
	public void mouseReleased(MouseEvent e) 
	{
		int x1 = e.getX();
		int y1 = e.getY();
		setLocation(x1+relativeX,y1+relativeY);
		currentX = x1+relativeX;
		currentY = y1+relativeY;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}

	@Override
	public void mouseDragged(MouseEvent e) {}

	@Override
	public void mouseMoved(MouseEvent e) {}
}