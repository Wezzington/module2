package module1;

public class AlgorithmControl {
	public AlgorithmControl() { }

	public void loop(int i, int maxi) {
		for ( i = 0 ; i <= maxi ; i++) {

			System.out.println(" i = "+i);
			// execute code ...

		}}

	public void decrement(float startx, float xstop) {
		boolean whilestop = true;
		while (whilestop) {

			startx--;
			if (startx <= xstop) whilestop = false;
			System.out.println(" x = "+startx);

		}}

	public void increment(double startx2, double xstop2) {
		boolean whilestop = true;
		while (whilestop) {

			startx2= startx2+0.2;
			if (startx2 >= xstop2) whilestop = false;
			System.out.println(" x = "+startx2);

		}}

	public int timer(double time, double loopcount) {
		boolean whilestop = true;
		double counter = 0;
		int bigcounter = 0;
		double timeNow = System.currentTimeMillis();
		double timereq = timeNow + time;
		while (whilestop) {
			double currenttime = System.currentTimeMillis();
			if (currenttime>=timereq) whilestop = false;
			counter++;
			//System.out.println(counter);
			if(counter>=loopcount) {
				counter = 0; 
				bigcounter++;
				System.out.println(bigcounter);
			}

			//System.out.println(timereq);
			//if (currenttime>=timereq) whilestop = true;
			//System.out.println("done");

		}
		return bigcounter;
	}

	public static void main (String args[]){
		AlgorithmControl ac = new AlgorithmControl();

		double time = 8000;
		double loopcount = 1000; 
		//in milliseconds
		int totalloops = ac.timer(time, loopcount);
		
		time = 8000;
		loopcount = 40000; 
		int totalloops2 = ac.timer(time, loopcount);
		System.out.println("The first loopcounter of 1000 gives "+totalloops+" loops and the second loopcounter of 40000 gives "+totalloops2);
		//completes the 
		
		int i = 1;
		int maxi = 10;
		ac.loop(i, maxi);

		float startx = 5;
		float xstop = -12;
		ac.decrement(startx, xstop);

		double startx2 = 2.2;
		double xstop2 = 8.8;
		ac.increment(startx2, xstop2);
		//ignore the decimal places, future add code to limit the significant figures shown

	}
}
