import java.awt.*;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
/** 
 * @author Nikitha
 * @Since 1-26-2020
 * @version 1.0
 */ 
public class Frame extends JFrame
{
	private static final String FRAME_TITLE = "Team4";
	JFrame frame = new JFrame("Swing Tester");
	private JTextField filename = new JTextField(), dir = new JTextField();
	public Frame()
	{
		
	    this.setTitle(FRAME_TITLE);
	    this.setMinimumSize(new Dimension(800, 600));
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    Container content = this.getContentPane();
	    JMenuBar menubar = new JMenuBar();
	    menubar.setMinimumSize(new Dimension(60,40));
	    final JLabel label = new JLabel();
	    this.setJMenuBar(menubar);
	    JMenu menu = new JMenu("Menu");
	    menubar.add(menu);
	    JMenuItem save= new JMenuItem("Save");
	    JMenuItem load= new JMenuItem("Load");
	    load.addActionListener(new OpenL());
	    save.addActionListener(new SaveL());
	    menu.add(save);
	    menu.add(load);
	    
	    content.setLayout(new BoxLayout(content, BoxLayout.X_AXIS));
	    content.add(new OptionsPanel());
	    content.add(new DrawingCanvas());
	    this.pack();
	    this.setLocationRelativeTo(null);
	    this.setVisible(true);
	}
	 class OpenL implements ActionListener {
		    public void actionPerformed(ActionEvent e) {
		      JFileChooser fc = new JFileChooser();
		      // Demonstrate "Open" dialog:
		      int rVal = fc.showOpenDialog(frame);
		      if (rVal == JFileChooser.APPROVE_OPTION) {
		        System.out.println(fc.getSelectedFile().getName());
		        System.out.println(fc.getCurrentDirectory().toString());
		        
		      }
		      if (rVal == JFileChooser.CANCEL_OPTION) {
		        filename.setText("You pressed cancel");
		        dir.setText("");
		      }
		    }
		  }

		  class SaveL implements ActionListener {
		    public void actionPerformed(ActionEvent e) {
		      JFileChooser fc = new JFileChooser();
		      // Demonstrate "Save" dialog:
		      int rVal = fc.showSaveDialog(frame);
		      if (rVal == JFileChooser.APPROVE_OPTION) {
		        filename.setText(fc.getSelectedFile().getName());
		        dir.setText(fc.getCurrentDirectory().toString());
		      }
		      if (rVal == JFileChooser.CANCEL_OPTION) {
		        filename.setText("You pressed cancel");
		        dir.setText("");
		      }
		    }
		  }

	public static void main(String[] args) {
		    new Frame();
	}
}
