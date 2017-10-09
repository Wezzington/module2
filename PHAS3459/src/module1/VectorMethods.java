package module1;

public class VectorMethods {
	public VectorMethods() { }

	public double dotProduct(double x1, double y1, double z1, double x2, double y2, double z2) {
		double dp;
		dp = x1*x2 + y1*y2 + z1*z2 ;
		return dp;
	}

	public double magnitude(double x1, double y1, double z1) {
		double mag;
		mag = Math.sqrt(x1*x1 + y1*y1 + z1*z1) ;
		return mag;  
	}

	public double angle(double x1, double y1, double z1, double x2, double y2, double z2) {
		double angle;
		angle = Math.acos(dotProduct(x1, y1, z1, x2, y2, z2)/(magnitude(x1, y1, z1)*magnitude(x2,y2,z2)))*180/Math.PI;
		return angle; 
	}


	public static void main (String args[]){
		VectorMethods vm = new VectorMethods();


		double x1 = 2.0;
		double y1 = 3.0;
		double z1 = 4.0;
		double x2 = 1.0;
		double y2 = 3.0;
		double z2 = 2.0;

		double answer1 = vm.angle(x1, y1, z1, x2, y2, z2);
		System.out.println("Angle between (2,3,4) and (1,3,2) = "+answer1);

		x2=0;
		y2=0;
		z2=0;

		double answer2 = vm.angle(x1, y1, z1, x2, y2, z2);
		System.out.println("Angle between (2,3,4) and (0,0,0) = "+answer2);
		// Magnitude of Vector (0,0,0) is 0, so dividing over 0 gives the error








	}}
