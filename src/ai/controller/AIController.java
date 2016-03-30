package ai.controller;

import ai.model.Fruit;
import ai.view.AIFrame;

public class AIController
{
	private Fruit Fruit;
	private AIFrame baseFrame;

	public void start()
	{
		
	}
	
	public AIController()
	{
		baseFrame = new AIFrame(this);
		
	}
}