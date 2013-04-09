package TP1;

import java.util.ArrayList;

public class CaisseEnregistreuse {
	
	public double CalculTotal(ArrayList<Article> liste,double reduc)
	{
		double tot=0.0;
		for(Article l : liste)
		{
			tot = tot + l.getPrix();
		}
		return tot-reduc;
	}
	
	public ArrayList<Article> splitLaChaine(String rep)
	{
		ArrayList<Article> lArt = new ArrayList<Article>();
		String[] decoupe = rep.split(",");
		for(int i=0;i<decoupe.length;i++)
		{
			if(decoupe[i].equals("pomme"))
			{
				lArt.add(new Article("pomme",1));
				Main.comptPomme++;
			}
			if(decoupe[i].equals("apple"))
			{
				lArt.add(new Article("pomme",1));
				Main.comptApple++;
			}
			if(decoupe[i].equals("mele"))
			{
				lArt.add(new Article("pomme",1));
				Main.comptMele++;
			}
			if(decoupe[i].equals("cerise"))
			{
				lArt.add(new Article("cerise",0.75));
				Main.comptCerise++;
			}
			if(decoupe[i].equals("banane"))
			{
				lArt.add(new Article("banane",1.5));
				Main.comptBanane++;
			}
		}
		return lArt;
	}

}
