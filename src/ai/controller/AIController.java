package ai.controller;

import java.util.ArrayList;

import ai.model.Apple;
import ai.model.Banana;
import ai.model.Death;
import ai.model.Fruit;
import ai.model.Orange;
import ai.view.AIFrame;

public class AIController
{
	private AIFrame baseFrame;
	private ArrayList<Death> deathThings;
	
	public AIController()
	{
		//Build all model components
		this.deathThings = new ArrayList<Death>();
		baseFrame = new AIFrame(this);
		makeDeathList();
	}
	
	public String showChanceDeath()
	{
		String deathChance = "";
		for(Death currentDeath : deathThings)
		{
			deathChance.concat("This is a " + currentDeath.toString() + " and has a silliness level of " + currentDeath.chanceOfDeath() + "\n");
		}
		return deathChance;
	}
	
	private void makeDeathList()
	{
		deathThings.add(new Apple());
		deathThings.add(new Banana());
		deathThings.add(new Orange());
	}
	
	public void start()
	{
		
	}
	
	private void swap(int firstLocation, int secondLocation)
	{
		Death temp = deathThings.get(firstLocation);
		deathThings.set(firstLocation, deathThings.get(secondLocation));
		deathThings.set(secondLocation, temp);
	}
	
	public void insertionSort()
	{
		for(int outerLoop = 1; outerLoop < deathThings.size(); outerLoop++)
		{
			int innerLoop = outerLoop;
			while(innerLoop > 0 && (deathThings.get(innerLoop-1).compareTo(deathThings.get(innerLoop))) > 0)
			{
				swap(innerLoop, innerLoop-1);
				innerLoop--;
			}
		}
	}
	
	public void quicksort(int low, int high)
	{
		if(low < high)
		{
			int midPoint = partition(low, high);
			quicksort(low, midPoint-1);
			quicksort(midPoint+1, high);
		}
	}
	
	private int partition(int low, int high)
	{
		int position = low;
		Death pivot = deathThings.get(high);
		
		for(int spot = low; spot < high-1; spot++)
		{
			if(deathThings.get(spot).compareTo(pivot) <= 0)
			{
				swap(position, spot);
				position++;
			}
		}
		swap(position, high);
		
		return position;
	}
}
