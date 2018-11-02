package logicBuliding;

public class ArmstrongNumber {
	
	public static void checkArmstrong(int n){
		
		int c=0,a,temp;  
	    temp=n; 
	    
	    while(n>0)  
	    {  
	    a=n%10;  
	    n=n/10;  
	    c=c+(a*a*a);  
	    }  
	    if(temp==c) {
	    System.out.println("Armstrong number");   
	    }else {
	        System.out.println("Not Armstrong number"); 
	    }
	   }  
	

	public static void main(String[] args) {
		
		checkArmstrong(153);
	

	}

}
