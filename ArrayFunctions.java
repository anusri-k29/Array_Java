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
			display(even);//no object required since the method is there in the same class/file
			display(odd);
			
		}
	
		void difference(int [] array) {
			ArrayList <Integer> diff = new ArrayList<Integer>();
			int min = 9999;
			for(int i = 0; i < array.length; i++){
				for(int j = i+1; i < array.length ; i++) {
					int difference = array[i] - array[j];
					if(difference < min){
						min = difference;
						firstIndex = i;
					}
				}
			}
		}
		System.out.println("index is: " + firstIndex);
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
			display(even);//no object required since the method is there in the same class/file
			display(odd);
			
		}
	
		void difference(int [] array) {
			ArrayList <Integer> diff = new ArrayList<Integer>();
			int min = 9999;
			for(int i = 0; i < array.length; i++){
				for(int j = i+1; i < array.length ; i++) {
					int difference = array[i] - array[j];
					if(difference < min){
						min = difference;
						firstIndex = i;
					}
				}
			}
		}
		System.out.println("index is: " + firstIndex);
	// Convert Array to ArrayList
	    	ArrayList<Integer> arrayToArrayList(int[] array) {
	          ArrayList<Integer> arrayList = new ArrayList<Integer>();
	          for (int num : array) {
	            arrayList.add(num);
	             }
	            return arrayList;
	   	}
	
	    // Convert ArrayList to Array
	    	int[] arrayListToArray(ArrayList<Integer> arrayList) {
	        	int[] array = new int[arrayList.size()];
	        	for (int i = 0; i < arrayList.size(); i++) {
	           		 array[i] = arrayList.get(i);
	        	}
	        return array;
	    }
	}
}
