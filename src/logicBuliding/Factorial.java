package logicBuliding;

public class Factorial {
	
	public static void factorial(int n){
		int fact=1, c;
		
		for(c=1; c<=n; c++){
			fact = fact*c;
			System.out.println("Factorial of "+n+" is = "+ fact);
		}
	}

	public static void main(String[] args) {
		Factorial.factorial(5);
	}

}
