package jframe_practice;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.Icon;
import javax.swing.JButton;

public class Square extends JButton
{
	SelectionEvent event;
	private static Icon label;

	public Square() 
	{
		super(label);
		Dimension size = getPreferredSize();
		size.width = size.height = 100;
		setPreferredSize(size);
		setContentAreaFilled(false);
		event = new SelectionEvent(this,"square");
	}
	
	protected void paintComponent(Graphics g) 
	{
	     if (getModel().isArmed()) {
	          g.setColor(Color.lightGray);
	     } else {
	          g.setColor(getBackground());
	     }
	     g.fillRect(50, 10, getHeight()-30, getHeight()-30);
	     super.paintComponent(g);
	}
	
	protected void paintBorder(Graphics g) 
	{
	     g.setColor(getForeground());
	     g.drawRect(50, 10, getHeight()-30, getHeight()-30);
	}
}