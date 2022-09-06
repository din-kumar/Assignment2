import java.util.Scanner;

public class MiddleCharOfString {

	public static String middleElement(String s) { 							// method to check the middle substring
		
		int len = s.length();												// calculating the length of string
		int index = len/2;													
		if(len%2==0) {														// checking no. of characters in the string is odd or even
			return s.substring(index-1,index+1);
		}
		return String.valueOf(index);		
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);								// Scanner class for user input
		System.out.println("Enter a String");					
		String str = sc.nextLine();											// User Input
		String middle = middleElement(str); 								// calling string method
		
		System.out.println("Middle character : " + middle);
		sc.close();

	}

}