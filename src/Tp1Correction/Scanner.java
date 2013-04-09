package Tp1Correction;

public class Scanner
{
	public double add(String string)
	{
		if(string.equals("Pommes"))
			return 1;
		else
		{
			if(string.equals("Cerises"))
				return 0.75;
			else
				return 1.5;
		}
	}

}
