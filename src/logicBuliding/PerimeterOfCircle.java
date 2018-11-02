package logicBuliding;

public class PerimeterOfCircle {
	
	static final double PIE = 3.17;
	static double PerimeterofCircle;
	
	public static double perimeterOfCircle(double Radius){
		PerimeterofCircle= 2*PIE*Radius;
		return PerimeterofCircle;	
	}

	public static void main(String[] args) {
			
	System.out.println(PerimeterOfCircle.perimeterOfCircle(5));	
	}
}
