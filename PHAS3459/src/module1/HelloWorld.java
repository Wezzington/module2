package module1;
import java.util.Date;

public class HelloWorld {

	public static void main(String[] args) {
		//System.out.println("Hello World!");
		
		System.out.println("Program starting");
		Date myDate = new Date();
		System.out.println(myDate);
		System.out.println("Program finished");
		
		int x = 100; int y = 200;
		
		//Print value of x
		// to the screen
		System.out.println(x);
		
		// Prefix the printing of the 
		// value with some descriptive
		// information:
		System.out.println("The value of x is "+x);
		
		// Note the "" for any words.
		// The + means append to the 
		// output going to the screen
		System.out.println(" x = "+x+" and y = "+y);
		
		// We can have any number of
		// things appended using a '+'
		
		

	}

}
