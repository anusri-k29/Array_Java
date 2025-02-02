# Array and ArrayList Operations

## Overview
This project contains Java classes that perform various operations on arrays and ArrayLists. The operations include splitting even and odd numbers from an array, finding the smallest difference between two neighboring numbers, and converting between arrays and ArrayLists.

## Files

### 1. **UserInput.java**
- **Purpose:** This class handles user input by accepting 5 integers from the user and storing them in an array.
- **Key Method:** `arrayInput()`
  - Prompts the user to enter 5 numbers and returns them as an array of integers.

### 2. **ArrayFunctions.java**
- **Purpose:** This class contains methods for performing various array operations, including splitting even and odd numbers, finding the smallest difference between neighboring numbers, and converting arrays to ArrayLists and vice versa.
  
#### Key Methods:
- `display(ArrayList<Integer> array)`
  - Displays the elements of the given ArrayList.
  
- `evenOdd(int[] array)`
  - Splits the given array into two ArrayLists: one for even numbers and one for odd numbers, and then displays them.
  
- `difference(int[] array)`
  - Finds the smallest difference between two neighboring numbers in the array and prints the index of the first number involved in the smallest difference.

- `arrayToArrayList(int[] array)`
  - Converts an array to an ArrayList and returns it.

- `arrayListToArray(ArrayList<Integer> arrayList)`
  - Converts an ArrayList back to an array and returns it.

### 3. **Main.java**
- **Purpose:** This class contains the `main()` method, which integrates all the functionality by creating objects of `UserInput` and `ArrayFunctions` and calling the appropriate methods.
  
### Usage
1. The program prompts the user to enter 5 integers.
2. It then:
   - Splits the integers into even and odd numbers.
   - Finds the index of the number with the smallest difference from any other number in the array.
   - Converts arrays to ArrayLists and vice versa.
