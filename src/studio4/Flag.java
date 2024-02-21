package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.clear();
		StdDraw.setPenColor(180, 0, 250);
		StdDraw.filledRectangle(0.5, 0.6, 1, 0.05);
		StdDraw.setPenColor(150,250,150);
		StdDraw.filledRectangle(.5,.4,1,.05);
		StdDraw.setPenColor(0,0,250);
		StdDraw.filledRectangle(.1, .9, .24, .24);
		StdDraw.setPenColor(250,0,0);
		StdDraw.filledRectangle(.9, .1, .24, .24);
		StdDraw.setPenColor(200,100,200);
		StdDraw.filledCircle(.5, .5, .2);
		StdDraw.setPenColor(200,50,150);
		StdDraw.filledCircle(.5, .5, .125);
		StdDraw.setPenColor(200,100,200);
		StdDraw.filledCircle(.5, .5, .05);
	}
}