package jframe_practice;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Float;

import javax.swing.Icon;
import javax.swing.JButton;

public class Square extends JButton
{
	SelectionEvent event;
	private static Icon label;

	public Square(int side) {
		super(label);
		Dimension size = getPreferredSize();
		size.width = size.height = side;
		setPreferredSize(size);
		setContentAreaFilled(false);
		event = new SelectionEvent(this,"square");
	}
	
	protected void paintComponent(Graphics g) {
	     if (getModel().isArmed()) {
	          g.setColor(Color.lightGray);
	     } else {
	          g.setColor(getBackground());
	     }
	     g.fillRect(30, 10, getHeight()-30, getHeight()-30);
	     super.paintComponent(g);
	}
	protected void paintBorder(Graphics g) {
	     g.setColor(getForeground());
	     g.drawRect(30, 10, getHeight()-30, getHeight()-30);
	}
	Float shape;
	public boolean contains(int x, int y) {
	     if (shape == null || !shape.getBounds().equals(getBounds())) {
	          shape = new Rectangle2D.Float(0, 0, getWidth()-1, getHeight()-1);
	     }
	     return shape.contains(x, y);
	}
	
}