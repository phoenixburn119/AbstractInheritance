package ai.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SpringLayout;

import ai.controller.AIController;

public class AIPanel extends JPanel
{
	private AIController baseController;
	private SpringLayout baseLayout;
	private JButton button;
	private JTextArea sortField;
	private JScrollPane textPane;
	
	public AIPanel(AIController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		button = new JButton("Sort");
		sortField = new JTextArea();

		
		setupPanel();
		//setupPane();
		setupLayout();
		setupListeners();
	}
	
	private void setupPane()
	{
		sortField.setEnabled(false);
		sortField.setEditable(false);
		textPane = new JScrollPane(sortField);
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(button);
		this.add(sortField);
		sortField.setText(baseController.showChanceDeath());
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, sortField, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, sortField, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, sortField, -6, SpringLayout.NORTH, button);
		baseLayout.putConstraint(SpringLayout.EAST, sortField, 0, SpringLayout.EAST, button);
		baseLayout.putConstraint(SpringLayout.SOUTH, button, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, button, -10, SpringLayout.EAST, this);		
	}
	
	private void setupListeners()
	{
		button.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				baseController.insertionSort();
				
				sortField.setText(baseController.showChanceDeath());
			}
		});
	}
}
