package TP1;

public class Article
{
	private String intitule;
	private double prix;
	
	public Article(String intitule,double d)
	{
		this.setIntitule(intitule);
		this.setPrix(d);
	}
	
	public String toString()
	{
		return " Intitule: "+this.getIntitule()+", Prix: "+this.getPrix()+" €";
	}
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
}
