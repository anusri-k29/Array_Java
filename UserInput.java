//UserInput.java
import java.util.*;
class UserInput{
		int[] arrayInput(){
			// Accepts 5 integers from the user and returns them as an array
			int[] array = new int[5];
			Scanner scan = new Scanner(System.in);
			//prompts user for 5 numbers
			System.out.println("Enter 5 numbers");
			for(int i = 0; i< array.length; i++){
				array[i] = scan.nextInt();
			}
			scan.close();//Closing the scanner 
			return array; // Return the filled array
		}	
	}
