package logicBuliding;

public class DigitAddition {
	
	static int sum=0;
	
	static void addition(int num){
		
		while (num>0){
		sum = sum + num%10;
		num = num/10;
		}
		System.out.println(sum);
	}
	
	
	public static void main(String[] args) {
		
		addition(1256);

	}

}
