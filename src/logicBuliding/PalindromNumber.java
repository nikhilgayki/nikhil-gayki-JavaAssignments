package logicBuliding;

public class PalindromNumber {

	public static void palindromCheck(int n){
		
		int temp, sum = 0,r;
		
		temp=n;
		
		while(n>0){
			r=n%10;
			sum = (sum*10)+r;
			n=n/10;
		}
		
		if(temp==sum){
			System.out.println("Palindrom Number");
		}else{
			System.out.println("Not a Palindrom Number");
		}
		
	}
	
	public static void main(String[] args) {
		palindromCheck(454);
	}

}
