package logicBuliding;

public class SwapVariables {
	
	public static void swapVariables(int a,int b){
		System.out.println("Nos before swapping :"+a+" "+b);
		
		int c = a;
		a=b;
		b=c;
		
		System.out.println("Nos After swapping :"+a+" "+b);
	}

	public static void main(String[] args) {
		SwapVariables.swapVariables(10, 30);
	}

}
