//ArrayFunctions.java
import java.util.*;
class ArrayFunctions{
	    void display(ArrayList<Integer> array){
			System.out.println("Array is: "+array);	
	}
	
		void evenOdd(int[] array){
			
			ArrayList <Integer> even = new ArrayList<Integer>(); 
			ArrayList <Integer> odd = new ArrayList<Integer>();
			
			for(int i = 0; i<array.length; i++){
				if(array[i] % 2 == 0){
					even.add(array[i]);
				}
				else{
					odd.add(array[i]);
				}
			}
			display(even);
			display(odd);
			
		}
	// Finds the smallest difference between two numbers and returns the first index
		void difference(int [] array) {
			ArrayList <Integer> diff = new ArrayList<Integer>();
			int min = 9999;
			int firstIndex = -1;
			// Compare all pairs of numbers to find the minimum difference
			for(int i = 0; i < array.length; i++){
				for(int j = i+1; j < array.length ; j++) {
					int difference = array[i] - array[j];
					if(difference < min){
						min = difference;
						firstIndex = i;
					}
				}
			}
			System.out.println("index is: " + firstIndex);
		}
		
		// Convert Array to ArrayList
	    ArrayList<Integer> arrayToArrayList(int[] array) {
	        ArrayList<Integer> arrayList = new ArrayList<Integer>();
	        // Add each array element to the ArrayList
			for (int num : array) {
	            arrayList.add(num);
	        }
	        return arrayList;
	   	 }
	
	    // Convert ArrayList to Array
	    int[] arrayListToArray(ArrayList<Integer> arrayList) {
	        	int[] array = new int[arrayList.size()];
	        	// Copy each ArrayList element into the array
				for (int i = 0; i < arrayList.size(); i++) {
	           		 array[i] = arrayList.get(i);
	        	}
	        return array;
	    }
	}

