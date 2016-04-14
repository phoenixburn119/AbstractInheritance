package ai.model;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Apple extends Fruit
{
	public Apple()
	{
		this.setAverageWeight(0.33);
		this.setFruitNutrients(getAppleNutrients());
		this.setTasty(true);
	}
	
	private ArrayList<String> getAppleNutrients()
	{
		ArrayList<String> nutrients = new ArrayList<String>();
		
		nutrients.add("Sugars: 25g");
		nutrients.add("Potassium 260mg");
		nutrients.add("Dietary Fiber 5g");
		
		return nutrients;
	}

	@Override
	public String story()
	{
		String story = "An apple is round.";
		return story;
	}

	@Override
	public double chanceOfDeath()
	{
		return 0.15334;
	}

	@Override
	public void memes()
	{
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "My apples bring all the boys.");
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

