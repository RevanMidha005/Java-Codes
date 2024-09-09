package P1;

import java.util.*;

public class sumavg {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		double []arr = new double[5];
		
		for (int i = 0; i < 5; i++) {
			arr[i] = scn.nextInt();
		}
		
		sumavrg obj = new sumavrg();
		
		double s,avg;
		
		s = obj.sum(arr);
		avg = obj.avg(s);
		
		System.out.println("Sum of Numbers: "+s);
		System.out.println("Average of Numbers: "+avg);
		
		scn.close();
	}
}
