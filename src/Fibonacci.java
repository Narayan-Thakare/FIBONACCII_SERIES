import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Scanner s = new Scanner(System.in);
		
		int a = 0;
	 	int b = 1,c;
		
	 	System.out.println("enter the no. want to do in that range ");
	 	
	 	int range  =s.nextInt();
	 	
	 	for (int i = 1 ;i <=range ;i++){
	 		
	 		
	 		c =a+b;
	 		a=b; // WE ARE SWIPE THE NO. HERE 
	 		b=c;
	 		System.out.println(c);
	 		
	 		
	 	}
		
		
		
	}

}
