package module1;

import java.util.Date;

public class MainProgram {
	public static void main (String args[]){

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
		// things appended using a '+'.

		// VALUE SIZES

		int ix = 1234567890;
		int iy = 10*ix;
		System.out.println(" ix = "+ix+" and iy = "+iy);

		// 'iy' reads incorrectly as it falls outside
		// the bounds of the int MIN,MAX

		long ixl = 1234567890;
		long iyl = 10*ixl;
		System.out.println(" ixl = "+ixl+" and iyl = "+iyl);

		// As the 'long' integer data type has larger Min/Max,
		// it can perform the calculation correctly.

		// TYPE CONVERSIONS AND CASTS

		// 'widening' conversion increases range of possible
		// values, e.g from 'int' to 'long' or 'float'
		// 'narrowing' conversion reduces possible range of values

		// Widening is done automatically when compiling,
		// but can lose precision in some conversions

		ix = 123456789;
		iy = 123456788;
		System.out.println(" ix-iy = " +(ix-iy));

		// Widening conversions
		float fx = ix;
		float fy = iy;
		System.out.println(" fx-fy = " +(fx-fy));

		double dx = ix;
		double dy = iy;
		System.out.println(" dx-dy = " +(dx-dy));

		// Narrowing has to be done
		// explicitly ('cast' operation)
		// of form: type x = (type) y;

		short sx = 1000;
		// size = 16 bits
		// in memory: x = 0000001111101000
		byte by = 0;
		// size = 8 bits
		// in memory: y = 00000000
		//by = sx;
		// ILLEGAL: COMPILE ERROR (try it and see)
		by = (byte) sx;
		// in memory: y = 11101000 (= -24!)
		System.out.println(" by = " +by);
		// so it chops the top 8 bits off






	}}