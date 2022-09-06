import java.util.ArrayList;

public class TwinPrmeNumbers {

	public static void twinPrimes(int len) {
		ArrayList<Integer> primes = new ArrayList<Integer>();							// creating an object of ArrayList class
		for(int i =2; i < 100 ;i++) {													// checking the prime no. from 1 to 100
			int count =0;
			for(int j=2 ;j < i/2 ;j++ ) {
				if(i%j == 0)															// if number is composite then the loop breaks
				{	count++;
					break;
				}
			}
			if(count == 0) {															// adding prime number to the ArrayList object primes
				primes.add(i);
			}
		}
		for(int i =0; i<primes.size()-1;i++) {											// Checking all the Prime numbers
			if(primes.get(i) + 2 == primes.get(i+1)) {									// Checking the twin prime numbers
				System.out.print("("+primes.get(i)+","+primes.get(i+1)+") ");			// print the twin prime numbers
			}
		}
	}
	public static void main(String[] args) {
		
		int limit = 100;
		
		twinPrimes(limit);																// calling twin prime number function

	}

}