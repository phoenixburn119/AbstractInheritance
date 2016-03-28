package ai.model;

import java.util.ArrayList;

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
}
