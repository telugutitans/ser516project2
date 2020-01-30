package jframe_practice;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class DrawingCanvas extends JPanel implements MouseListener
{
	SelectedShape shape;
	public DrawingCanvas()
	{
		addMouseListener(this);
		shape = new SelectedShape();
		DrawShape shaped = new DrawShape("triangle",50,400);
		shaped.setBounds(50, 400, 100, 100);
		shaped.setBackground(new Color(120,90,40));
		this.add((JLabel)shaped);
		this.setLayout(null);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.print("clicked");
		DrawShape shaped = new DrawShape(shape.selected_shape,e.getX()-50,e.getY());
		//shaped.setBounds(e.getX()-50, e.getY(), 100, 100);
		this.add((JLabel)shaped); 
		this.repaint();
	}

	public void mouseEntered(MouseEvent arg0) {}
	public void mouseExited(MouseEvent arg0) {}
	public void mousePressed(MouseEvent arg0) {}
	public void mouseReleased(MouseEvent arg0) {}

}