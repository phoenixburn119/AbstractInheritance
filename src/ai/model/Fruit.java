package ai.model;

import java.util.ArrayList;

public abstract class Fruit
{
	private double averageWeight;
	private ArrayList<String> fruitNutrients;
	private boolean isTasty;
	
	
	
	
	public double getAverageWeight()
	{
		return averageWeight;
	}
	public void setAverageWeight(double averageWeight)
	{
		this.averageWeight = averageWeight;
	}
	public ArrayList<String> getFruitNutrients()
	{
		return fruitNutrients;
	}
	public void setFruitNutrients(ArrayList<String> names)
	{
		this.fruitNutrients = names;
	}
	public boolean isTasty()
	{
		return isTasty;
	}
	public void setTasty(boolean isTasty)
	{
		this.isTasty = isTasty;
	}
	
}
