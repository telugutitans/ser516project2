package jframe_practice;

import java.awt.*;
import javax.swing.*;

public class Frame extends JFrame
{
	private static final String FRAME_TITLE = "Team4";
	

	public Frame()
	{
	    this.setTitle(FRAME_TITLE);
	    this.setMinimumSize(new Dimension(800, 600));
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    Container content = this.getContentPane();
	    content.setLayout(new BoxLayout(content, BoxLayout.X_AXIS));
	    content.add(new OptionsPanel());
	    this.pack();
	    this.setLocationRelativeTo(null);
	    this.setVisible(true);
	}
	
	public static void main(String[] args) {
		    new Frame();
	}
}