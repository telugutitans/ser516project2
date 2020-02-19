package jframe_practice;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.Icon;
import javax.swing.JButton;
public class OptionsPanel extends JPanel
{
	public OptionsPanel()
	{
		Dimension size = new Dimension(-200,600);
		setPreferredSize(size);
		Border blackline = BorderFactory.createLineBorder(Color.black);
		setBorder(blackline);	
		setLayout(new GridLayout(3,1));
}
	public void paint(Graphics g)
	{
		g.drawLine(0, 100, 50,150);
	}
}