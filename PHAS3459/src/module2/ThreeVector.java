package module2;

public class ThreeVector {
	double x;
	double y;
	double z;
	public double magnitude() {
		double mag;
		mag = Math.sqrt(x*x + y*y + z*z) ;
		return mag;  
	}

	public ThreeVector unitVector() {
		ThreeVector uv = new ThreeVector(1.0, 2.0, 3.0);
		uv = new ThreeVector(this.x/magnitude(), this.y/magnitude(), this.z/magnitude());
		return uv;  
	}
	
	public ThreeVector() {};
	public ThreeVector(double a, double b, double c) {x=a; y=b; z=c;}
	
	public static void main (String args[]){
	
	ThreeVector v1 = new 
	}
}
