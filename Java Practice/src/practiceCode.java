import java.util.Scanner;

public class practiceCode {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter number");
		int num = scan.nextInt();
		double sum = 0;
		
		String value = String.valueOf(num);
		int length = value.length();
		
		  for (int i=length;i>0;i--)
		  {
			  double mod = num%10;
			  num = num/10;
			  
			 
			  
				  sum = sum + mod*(Math.pow(10, (i-1)));
			  
		  }
		  System.out.println(sum);
		 
	}

}
