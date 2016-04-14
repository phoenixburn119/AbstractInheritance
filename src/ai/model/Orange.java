package ai.model;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Orange extends Fruit
{
	
	public Orange()
	{
		this.setAverageWeight(0.28);
		this.setFruitNutrients(getOrangeNutrients());
		this.setTasty(false);
	}

	private ArrayList<String> getOrangeNutrients()
	{
		ArrayList<String> nutrients = new ArrayList<String>();
		
		nutrients.add("Sugars: 16.8g");
		nutrients.add("Potassium 326mg");
		nutrients.add("Dietary Fiber: 4.3g");
		
		return nutrients;
	}
	
	@Override
	public String story()
	{
		String story = "An orange is round.";
		return story;
	}

	@Override
	public double chanceOfDeath()
	{
		return 0.44548;
	}

	@Override
	public void memes()
	{
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Oranges are orange.");
	}

	@Override
	public void spamTime(int spams)
	{
		// TODO Auto-generated method stub
		for(int spot = 0; spot < spams; spot++)
		{
			JOptionPane.showMessageDialog(null, "Don't spam scrub.");
		}
	}

	@Override
	public void punch(int times)
	{
		// TODO Auto-generated method stub
		for(int spot = 0; spot < times; spot++)
		{
			JOptionPane.showMessageDialog(null, "punch");
		}
	}
}
