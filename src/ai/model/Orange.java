package ai.model;

import java.util.ArrayList;

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
}
