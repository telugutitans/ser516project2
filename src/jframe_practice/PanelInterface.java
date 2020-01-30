package jframe_practice;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.border.Border;

public abstract class PanelInterface extends JPanel
{
	public PanelInterface()
	{
		setPreferredSize(new Dimension(-200,600));
		Border blackline = BorderFactory.createLineBorder(Color.black);
		setBorder(blackline);
		setLayout(new GridLayout(3,1));
		add(new Circle(100));
		add(new Triangle(100));
		add(new Square(100));
	}
}