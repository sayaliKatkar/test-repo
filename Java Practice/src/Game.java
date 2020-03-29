import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0 ; i<4 ; i++)
		{
		System.out.println("enter no");
		int userInput = scan.nextInt();
		
		int compInput = 5 - userInput ;
		
		System.out.println("comp input :"+compInput);
		
		int remaining = 21 -(userInput + compInput) ;
		System.out.println("remaining "+remaining);
		
		}
		

	}

}
