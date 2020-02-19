import java.awt.*;
import javax.swing.*;
/** 
 * @author Nikitha
 * @Since 1-26-2020
 * @version 1.0
 */ 
public class Frame extends JFrame
{
	private static final String FRAME_TITLE = "Team4";
	
	public Frame()
	{
	    this.setTitle(FRAME_TITLE);
	    this.setMinimumSize(new Dimension(800, 600));
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    Container content = this.getContentPane();
	    JMenuBar menubar = new JMenuBar();
	    menubar.setMinimumSize(new Dimension(60,40));
	    this.setJMenuBar(menubar);
	    JMenu menu = new JMenu("Menu");
	    menubar.add(menu);
	    JMenuItem save= new JMenuItem("Save");
	    JMenuItem load= new JMenuItem("Load");
	    menu.add(save);
	    menu.add(load);
	    content.setLayout(new BoxLayout(content, BoxLayout.X_AXIS));
	    content.add(new OptionsPanel());
	    content.add(new DrawingCanvas());
	    this.pack();
	    this.setLocationRelativeTo(null);
	    this.setVisible(true);
	}
	
	public static void main(String[] args) {
		    new Frame();
	}
}
