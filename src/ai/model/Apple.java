package ai.model;

import java.util.ArrayList;

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
}

