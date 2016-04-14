package ai.model;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Banana extends Fruit
{

	public Banana()
	{
		this.setAverageWeight(0.35);
		this.setFruitNutrients(getBananaNutrients());
		this.setTasty(true);
	}

	private ArrayList<String> getBananaNutrients()
	{
		ArrayList<String> nutrients = new ArrayList<String>();
		
		nutrients.add("Sugars: 27.5g");
		nutrients.add("Potassium 806mg");
		nutrients.add("Dietary Fiber: 5.9g");
		
		return nutrients;
	}
	
	@Override
	public String story()
	{
		String story = "A banana is banana.";
		return story;
	}

	@Override
	public double chanceOfDeath()
	{
		return 0.88888;
	}

	@Override
	public void memes()
	{
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "B-A-N-A-N-A");
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
