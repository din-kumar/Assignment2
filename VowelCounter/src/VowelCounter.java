import java.util.Scanner;

public class VowelCounter {

	public static int vowelCount(String str) {						 	// Method to count the number of vowels
		str =str.toLowerCase();											// converting string to lower case to minimize the conditons
		int count=0;						
		for(int i=0; i<str.length();i++) {								// Checking each character of string
			
			switch(str.charAt(i)) {										//if any character is a vowel the count increase by 1
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':count++;
			}
		}
		
		return count;													// return no of vowels
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);							// Scanner class to take user input
		
		System.out.println("Enter a String : ");
		String str = sc.nextLine();										// User Input
		
		int count = vowelCount(str);									// Calling vowelCount method
		System.out.println(count);										// Print the no. of vowels
		sc.close();
	}

}