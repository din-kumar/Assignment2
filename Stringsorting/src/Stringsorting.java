public class Stringsorting {
public static void main(String[] args) {
		
		String[] str = {"This", "is", "a", "easiest", "example"};

		 for (int i=1 ;i<str.length; i++)								// checking each element of the loop
		    {
		        String temp = str[i];
		 
		        // Insert str[j] at its correct position
		        int j = i - 1;
		        while (j >= 0 && temp.length() < str[j].length())		// applying insertion sort on length of elements
		        {
		            str[j+1] = str[j];
		            j--;
		        }
		        str[j+1] = temp;
		    }
		 
		 for(int i=0;i<str.length;i++) {								// printing the sorted String array
			 System.out.println(str[i]);
		 }
		
	}

}
