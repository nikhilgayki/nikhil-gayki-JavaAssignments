package logicBuliding;

public class Recursion {
	
	static int count = 0;
	
	static void recursion(){
		count ++;
		if (count<=5){
		System.out.println("I am Call recursion "+count+" time");
		recursion();	
			}	
		}

	public static void main(String[] args) {
		recursion();
	}

}
