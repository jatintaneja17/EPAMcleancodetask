package CostCalc;
import java.applet.*;
import java.awt.*;

public class ConstructionCost extends Applet
{
	int materialstandard,areaofhouse,fullyautomatedhome,constructioncost;
	public void init()
	{
		materialstandard=1;
		areaofhouse=300;
		fullyautomatedhome=2;
		switch(fullyautomatedhome)
		{
		case 1:
		{
			constructioncost=2500*areaofhouse;
			break;
		}
		case 2:
		{
			switch(materialstandard)
			{
			case 1:
			{
				constructioncost=1200*areaofhouse;
				break;
			}
			case 2:
			{
				constructioncost=1500*areaofhouse;
				break;
			}
			case 3:
			{
				constructioncost=1800*areaofhouse;
				break;
			}
			}
			break;
		}
		}
	}
	public void paint(Graphics g)
	{
		String S1="Material Standard = "+materialstandard;
		String S2="Area of House = "+areaofhouse;
		String S3="Fully Automated Home = "+fullyautomatedhome;
		String S4="Cost Of Construction = "+constructioncost;
		g.drawString(S1, 40, 100);
		g.drawString(S2, 40, 120);
		g.drawString(S3, 40, 140);
		g.drawString(S4, 40, 160);
	}
}
