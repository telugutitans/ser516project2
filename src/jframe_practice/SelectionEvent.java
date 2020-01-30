package jframe_practice;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class SelectionEvent implements ActionListener
{
	JButton button;
	private String shape;
	private SelectedShape Select;
	public SelectionEvent(JButton button, String shape)
	{
		this.button = button;
		this.button.addActionListener(this);
		this.shape = shape;
		Select = new SelectedShape();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.print(Select.selected_shape);
		Select.selected_shape = shape;
		System.out.print(Select.selected_shape);
	}
	
}