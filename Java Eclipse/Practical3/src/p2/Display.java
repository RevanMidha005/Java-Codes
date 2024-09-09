package p2;

import java.util.*;

public class Display {
	
	public static void main() {
		Scanner scn = new Scanner(System.in);
		
		String fn, ln;
		fn = scn.next();
		ln = scn.next();
		
		NameInput obj = new NameInput();
		
		String fullName;
		
		fullName = obj.Name(fn, ln);
		
		System.out.println("Full name is: " + fullName);		
		scn.close();
		
	}
}
