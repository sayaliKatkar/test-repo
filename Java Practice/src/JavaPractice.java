import java.util.Arrays;
import java.util.Scanner;

public class JavaPractice {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		//System.out.println("enter number");
		
		int a[] = {1,2,3,4};
		
		int b[] = null ;
		
		int index = 2;
		int newvalue = 5;
		
		for (int i =0 ; i<a.length ; i++)
		{
			b[i]=a[i];
		}
		System.out.println(Arrays.toString(b));
		
	}

}
