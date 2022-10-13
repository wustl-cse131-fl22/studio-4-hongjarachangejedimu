package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	private static void mommy() {
		   StdDraw.clear();
		   StdDraw.setPenColor(Color.green);
		   StdDraw.filledRectangle(3, 3, 8, 8);
		   StdDraw.setPenColor(Color.red);
		   StdDraw.filledRectangle(19, 3, 8, 8);
		}

		public static void flag() {
		   StdDraw.setXscale(0, 22);
		   StdDraw.setYscale(0, 16);
		   mommy();
	}
	public static void main(String[] args) {
		flag ();
		double ballX = 0.0;
		
		StdDraw.setPenColor(Color.yellow);
		StdDraw.setPenRadius(0.05);
		
		while (true) {
			
			ballX = ballX + 0.08;
			if(ballX > 22) {
				ballX = 0;
			}
		
			StdDraw.point(ballX, 13);
			
			StdDraw.show(10);
		}
	
}
}
