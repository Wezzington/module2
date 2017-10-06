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
		      angle = Math.acos(dotProduct(x1, y1, z1, x2, y2, z2)/(magnitude(x1, y1, z1)*magnitude(x2,y2,z2))) ;
		      return angle; 
	      }
	
	
	public static void main (String args[]){
		VectorMethods vm = new VectorMethods();
		

	
	}}
