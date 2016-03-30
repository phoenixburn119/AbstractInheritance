package ai.view;

import javax.swing.JFrame;

import ai.controller.AIController;
import ai.view.AIPanel;

public class AIFrame extends JFrame
{
	private AIController baseController;
	private AIPanel basePanel;
	
	public AIFrame(AIController baseController)
	{
		this.baseController = baseController;
		basePanel = new AIPanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setResizable(false);
		this.setTitle("RPS-RPG");
		this.setSize(600,420);
		this.setVisible(true);
	}
	
	public AIController getBaseController()
	{
		return baseController;
	}
}