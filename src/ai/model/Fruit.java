package ai.model;

import java.util.ArrayList;

public abstract class Fruit implements Death, Comparable<Object>
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
	
	public String toString()
	{
		String fruitDescription = "This is a Fruit object of Type " + this.getClass().getName() + 
				" and has a average weight of " + getAverageWeight();
		
		return fruitDescription;
	}
	
	/**
	 * if this object is before or less than the compared object return a negative number. (generally -1)
	 * if this object is after/greater than the compared object return positive. (generally 1)
	 */
	public int compareTo(Object compared)
	{
		int comparedValue = Integer.MIN_VALUE;
		
		if(compared instanceof Death)
		{
			if(this.chanceOfDeath() < ((Death) compared).chanceOfDeath())
			{
				comparedValue = -1;
			}
			else if(this.chanceOfDeath() < ((Death) compared).chanceOfDeath())
			{
				comparedValue = 1;
			}
			else
			{
				comparedValue = 0;
			}
		}
		
		return comparedValue;
	}
}
