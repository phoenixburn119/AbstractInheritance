package ai.view;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import ai.controller.AIController;

public class AIPanel extends JPanel
{
	private AIController baseController;
	private SpringLayout baseLayout;
	private JButton button;
	private JTextField sortField;
	
	public AIPanel(AIController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		button = new JButton("Sort");
		baseLayout.putConstraint(SpringLayout.SOUTH, button, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, button, -10, SpringLayout.EAST, this);
		sortField = new JTextField();
		baseLayout.putConstraint(SpringLayout.NORTH, sortField, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, sortField, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, sortField, -6, SpringLayout.NORTH, button);
		baseLayout.putConstraint(SpringLayout.EAST, sortField, 0, SpringLayout.EAST, button);
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(button);
		this.add(sortField);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		button.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
			}
		});
	}
}
