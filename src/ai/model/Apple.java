package ai.model;

import java.util.ArrayList;

public class Apple extends Fruit
{
	public Apple()
	{
		this.setAverageWeight(0.33);
		this.setFruitNutrients(getFruitNutrients());
		this.setTasty(true);
	}
	
	private ArrayList<String> getFruitNutrients()
	{
		ArrayList<String> nutrients = new ArrayList<String>();
		
		nutrients.add("");
		nutrients.add("");
		nutrients.add("");
		
		return nutrients;
	}
}

