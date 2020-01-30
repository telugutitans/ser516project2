package jframe_practice;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Ellipse2D.Float;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.*;

public class Triangle extends JButton
{
	SelectionEvent event;
	private static Icon label;

	public Triangle(int height) 
	{
		super(label);
		Dimension size = getPreferredSize();
		size.width = size.height = height;
		setPreferredSize(size);
		setContentAreaFilled(false);
		event = new SelectionEvent(this,"triangle");
	}
	
	protected void paintComponent(Graphics g) {
	     if (getModel().isArmed()) {
	          g.setColor(Color.lightGray);
	     } else {
	          g.setColor(getBackground());
	     }
	     int xPoints[] = {getSize().width/2, 20, getSize().width-20};
	     int yPoints[] = {10, getSize().height-11, getSize().height-11};
	     g.fillPolygon(xPoints, yPoints, xPoints.length);
	     super.paintComponent(g);
	}
	protected void paintBorder(Graphics g) {
	     g.setColor(getForeground());
	     int xPoints[] = {getSize().width/2, 20, getSize().width-20};
	     int yPoints[] = {10, getSize().height-11, getSize().height-11};
	     g.drawPolygon(xPoints, yPoints, xPoints.length);
	}
	Polygon polygon;
	public boolean contains(int x, int y) {
	     if (polygon == null || !polygon.getBounds().equals(getBounds())) {
	          int xPoints[] = {getSize().width/2, 0, getSize().width};
	          int yPoints[] = {0, getSize().height-1, getSize().height-1};
	          polygon = new Polygon(xPoints,yPoints, xPoints.length);
	     }
	     return polygon.contains(x, y);
	}
}