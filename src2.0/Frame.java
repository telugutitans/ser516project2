import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;


/**
 * @author Nikitha
 * @Since 1-26-2020
 * @version 1.0
 */
public class Frame extends JFrame {
	private static final String FRAME_TITLE = "Team4";
	JFrame frame = new JFrame();
	private DrawingCanvas canvas;
	private OptionsPanel options;

	public Frame() {
		this.setTitle(FRAME_TITLE);
		this.setMinimumSize(new Dimension(800, 600));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container content = this.getContentPane();
		options = new OptionsPanel();
		content.add(options);
		canvas = new DrawingCanvas();
		content.add(canvas);
		content.setLayout(new BoxLayout(content, BoxLayout.X_AXIS));
		JMenuBar menubar = new JMenuBar();
		menubar.setMinimumSize(new Dimension(60, 40));
		final JLabel label = new JLabel();
		this.setJMenuBar(menubar);
		JMenu menu = new JMenu("Menu");
		menubar.add(menu);
		JMenuItem save = new JMenuItem("Save");
		JMenuItem load = new JMenuItem("Load");
		load.addActionListener(new LoadManager(canvas));
		save.addActionListener(new SaveManager(canvas));
		menu.add(save);
		menu.add(load);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}



	public static void main(String[] args) {
		new Frame();
	}
}
