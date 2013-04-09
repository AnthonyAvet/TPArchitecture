package Tp1Correction;

import static org.junit.Assert.*;

import org.junit.Test;

public class ScannerTest
{
	@Test
	public void pommeCoute1()
	{
		Scanner s = new Scanner();
		assertEquals(s.add("Pommes"),1,0);
	}
	
	@Test
	public void ceriseCoute075()
	{
		Scanner s = new Scanner();
		assertEquals(s.add("Cerises"),0.75,0);
	}
	
	@Test
	public void bananeCoute15()
	{
		Scanner s = new Scanner();
		assertEquals(s.add("Bananes"),1.5,0);
	}
	

}
