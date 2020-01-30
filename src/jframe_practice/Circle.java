package jframe_practice;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Ellipse2D.Float;

import javax.swing.Icon;
import javax.swing.JButton;

public class Circle extends JButton
{
	private SelectionEvent event;
	private static Icon label;

	public Circle(int height) 
	{
		super(label);
		Dimension size = getPreferredSize();
		size.width = size.height = height;
		setPreferredSize(size);
		setContentAreaFilled(false);
		event = new SelectionEvent(this,"circle");
	}
	
	protected void paintComponent(Graphics g) {
	     if (getModel().isArmed()) {
	           g.setColor(Color.lightGray);
	     } else {
	          g.setColor(getBackground());
	     }
	     g.fillOval(20, 0, getSize().height-1, getSize().height-1);
	     super.paintComponent(g);
	}
	protected void paintBorder(Graphics g) {
	     g.setColor(getForeground());
	     g.drawOval(20, 0, getSize().height-1, getSize().height-1);
	}
	Float shape;
	public boolean contains(int x, int y) {
	     if (shape == null || !shape.getBounds().equals(getBounds())) {
	          shape = new Ellipse2D.Float(0, 0, getWidth(), getHeight());
	     }
	     return shape.contains(x, y);
	}
	
}