package ai.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import ai.controller.AIController;

public class AIPanel extends JPanel
{
	private AIController baseController;
	private SpringLayout baseLayout;
	private JButton test;
	
	
	public AIPanel(AIController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		test = new JButton("Test");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(test);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		test.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
			}
		});
	}
}
