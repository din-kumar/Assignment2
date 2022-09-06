import java.util.Scanner;

public class WordCounter {

	public static int wordCount(String str) {									// Method to count the number of strings in a line.
		
		int count =0;
		for(int i =0;i<str.length();i++) {										// Checking each character of string
			if(str.charAt(i)== ' ' && str.charAt(i+1) !=' ') {					
				count++;														// counting number of words in string
			}
		}	
		return count+1;															// return no of words
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);									// Scanner Class to take user input
		
		System.out.println("Enter a String : ");
		String str = sc.nextLine();												// User Input
		
		int count = wordCount(str);												// Calling the method wordCount
		System.out.println(count);												// Print output
		sc.close();
	}

}