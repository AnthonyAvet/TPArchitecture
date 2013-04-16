package org.joyofcoding.objectcalisthenics;

import java.util.ArrayList;
import java.util.List;

public class GildedRose {
    public static void main(String[] args) {
		GildedRose gildedRose = new GildedRose();
        gildedRose.updateQuality(gildedRose.makeItems());
	}

    public List<Item> makeItems() {
        List<Item> items = new ArrayList<Item>();
		items.add(new Item("+5 Dexterity Vest", 10, 20));
		items.add(new Item("Aged Brie", 2, 0));
		items.add(new Item("Elixir of the Mongoose", 5, 7));
		items.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
		items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
		items.add(new Item("Conjured Mana Cake", 3, 6));
        return items;
    }

    public void PourChaqueUpdateQuality(Item item)
    {
    	String nomDeLitem = item.name;
    	if (!nomDeLitem.equals("Aged Brie") && !nomDeLitem.equals("Backstage passes to a TAFKAL80ETC concert"))
		{
			if (item.quality > 0) 
			{
				if (!nomDeLitem.equals("Sulfuras, Hand of Ragnaros"))
				{
					item.decrementeQuality(1);
				}
			}
		} 
		else 
		{
			if (item.quality < 50) 
			{
				item.augmenteQuality();
			}
			
			if (nomDeLitem.equals("Backstage passes to a TAFKAL80ETC concert")) 
			{
				if (item.sellIn < 11)
				{
					if (item.quality< 50)
					{
						item.augmenteQuality();
					}
				}

				if (item.sellIn < 6) 
				{
					if (item.quality < 50) 
					{
						item.augmenteQuality();
					}
				}
			}
		}

		if (!nomDeLitem.equals("Sulfuras, Hand of Ragnaros")) {
			item.decrementeSellIn(1);
		}

		if (item.sellIn < 0)
		{
			if (!nomDeLitem.equals("Aged Brie")) 
			{
				if (!nomDeLitem.equals("Backstage passes to a TAFKAL80ETC concert")) 
				{
					if (item.quality > 0) 
					{
						if (!nomDeLitem.equals("Sulfuras, Hand of Ragnaros"))
						{
							item.decrementeQuality(1);
						}
					}
				}
				if (!nomDeLitem.equals("Aged Brie")) 
				{
					int nombre = item.quality;
					item.decrementeQuality(nombre);
				}
			} 
			else 
			{
				if (item.quality < 50) 
				{
					item.augmenteQuality();
				}
			}
		}
    }
    
    public void updateQuality(List<Item> list) {
    	List<Item> items = list;
        for (int i = 0; i < items.size(); i++) {
        	PourChaqueUpdateQuality(items.get(i));
    	}
    }

}
