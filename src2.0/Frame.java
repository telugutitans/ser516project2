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
	
	public Frame()
	{
		JFrame frame = new JFrame("Swing Tester");
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
	    menu.add(save);
	    menu.add(load);
	    save.addActionListener(new ActionListener() {
	         @Override
	         public void actionPerformed(ActionEvent e) {
	            JFileChooser fileChooser = new JFileChooser();
	            int option = fileChooser.showSaveDialog(frame);
	            if(option == JFileChooser.APPROVE_OPTION){
	               File file = fileChooser.getSelectedFile();
	               label.setText("File Saved as: " + file.getName());
	            }else{
	               label.setText("Save command canceled");
	            }
	         }
	      });
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
