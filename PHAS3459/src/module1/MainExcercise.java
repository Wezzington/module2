package module1;

public class MainExcercise {
	public static void main (String args[]){

		double doubVar = 10.0;
		System.out.println("doubVar "+doubVar);
		float floatVar = 10;
		System.out.println("floatVar "+floatVar);
		int intVar = 10;
		System.out.println("intVar "+intVar);
		long longVar = 10;
		System.out.println("longVar "+longVar);
		byte byteVar = 10;
		System.out.println("byteVar "+byteVar);

		System.out.println("Multiplied Out "+doubVar*floatVar*intVar*longVar*byteVar);
		
		boolean boolVar= true;
		float floatcombo = 'c'+10;
		// float floatcombo2 = boolVar+'c';
		float floatcombo3 = floatVar + intVar;
		
		System.out.println("Char with a number "+floatcombo);
		// Recognises the char to its value in ASCII and adds it as a number
		
		// System.out.println("Boolean with a Char "+floatcombo2);
		// Can't mix Boolean with the + operator, as Boolean is either true or false
		
		System.out.println("Float with an int "+floatcombo3);
		// Adds the two types such that final type is a float
		
		
		
		//int j;
		//System.out.println(" floatVar2 with c "+j+intVar);
		//Can't run if variable is not initialised
		
		double dx = 4.99;
		int ix;
		ix = (int) dx;
		System.out.println("New int value "+ix);
		// Loses some precision, as range of int is much less than that of double.




	}}
