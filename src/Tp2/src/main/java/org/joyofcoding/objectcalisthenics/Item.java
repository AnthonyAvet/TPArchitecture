package org.joyofcoding.objectcalisthenics;

public class Item {
	public String name;
	public int sellIn;
	public int quality;

	public Item(String name, int sellIn, int quality) {
		this.name = name;
		this.quality = quality;
		this.sellIn = sellIn;
	}

	
	public void augmenteQuality()
	{
		this.quality ++;
	}
	
	public void decrementeQuality(int nombre)
	{
		int temporaire = this.quality - nombre;
		this.quality = temporaire;
	}
	
	public void augmenteSellIn()
	{
		this.sellIn ++;
	}
	
	public void decrementeSellIn(int nombre)
	{
		int temporaire = this.sellIn - nombre;
		this.sellIn = temporaire;
	}
	
	public String getName() {
		return name;
	}

	public int getSellIn() {
		return sellIn;
	}

	public int getQuality() {
		return quality;
	}
}
