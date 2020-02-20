package Calc;
import java.applet.*;
import java.awt.*;
import java.lang.Math;

public class Interest extends Applet
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	double principal,rate,time,SI,CI;
	public void init()
	{
	principal=1000;
	rate=5;
	time=3;
	SI=(principal*rate*time)/100;
	CI = principal*Math.pow((1+rate/100),time);
	}
	public void paint(Graphics g)
	{
		String S1="princial = "+principal;
		String S2="rate = "+rate;
		String S3="time = "+time;
		String S4="Simple Interest = "+SI;
		String S5="Compound Interest = "+CI;
		g.drawString(S1, 40, 100);
		g.drawString(S2, 40, 120);
		g.drawString(S3, 40, 140);
		g.drawString(S4, 40, 160);
		g.drawString(S5, 40, 180);
	}
	/* 
	<applet code="Interest.class" width="300" height="300"> 
	</applet> 
	*/ 
}
