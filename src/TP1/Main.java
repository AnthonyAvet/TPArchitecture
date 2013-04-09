package TP1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	static int comptCerise = 0;
	static int comptBanane = 0;
	static int comptApple = 0;
	static int comptPomme = 0;
	static int comptMele = 0;
	
	public static double calculReduc()
	{
		double reduc =0.0;
		if(comptBanane==2)
			reduc = reduc + 1.5;
		if(comptCerise ==2)
			reduc = reduc + 0.20;
		if(comptMele == 2)
			reduc = reduc + 0.5;
		if(comptApple == 3)
			reduc = reduc + 1;
		if(comptPomme+comptApple+comptMele == 4)
			reduc = reduc + 1;
		if(comptApple+comptMele+comptCerise+comptBanane+comptPomme == 5)
			reduc = reduc + 2;
		return reduc;
	}

	public static void main(String[] args) 
	{
		ArrayList<Article> panierArticle =  new ArrayList<Article>();
		CaisseEnregistreuse c = new CaisseEnregistreuse();
		Article pomme = new Article("Pomme",1);
		Article banane = new Article("Banane",1.5);
		Article cerise = new Article("Cerise",0.75);
		int continuer = 1;
		double reduc=0;
		double total=0.0;
		while(continuer != 0)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Veuillez saisir un article :");
			String rep = sc.nextLine();
			reduc = 0.0;
			if(rep.contains(","))
				panierArticle = c.splitLaChaine(rep);
			else
			{
				switch (rep) 
				{ 
					case "pomme": panierArticle.add(pomme);
									comptPomme++;
									; break; 
					case "apple": panierArticle.add(pomme);
									comptApple++;
									; break; 
					case "mele": panierArticle.add(pomme);
									comptMele++;
									; break; 
					case "banane": panierArticle.add(banane);
									comptBanane ++;
									; break; 
					case "cerise": panierArticle.add(cerise);
									comptCerise ++;
										; break; 
					case "stop": continuer = 0;
								 reduc=0.0;
									; break; 
					default: 
							System.out.println("Entree inconnue");; 
				}
			}
			
			reduc = calculReduc();
			
			total = c.CalculTotal(panierArticle,reduc);
			reduc = 0.0;
			System.out.println("Total: "+total+"€");
		}
	}

}
