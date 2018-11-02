package logicBuliding;

public class SwappingWithoutThird {
	
	public static void swapping(int a, int b){
		System.out.println("Nos before swapping :"+a+" "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Nos After swapping :"+a+" "+b);
	}

	public static void main(String[] args) {
		
		SwappingWithoutThird.swapping(34, 78);
	}

}
