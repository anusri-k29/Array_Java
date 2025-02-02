//Main.java
//Anusri Kadam
//23070126016
//SY AIML A1

class Main {
    public static void main(String args[]) {
        UserInput ui = new UserInput();
        ArrayFunctions functions = new ArrayFunctions();

        int[] array = ui.arrayInput();

        functions.evenOdd(array);
        functions.difference(array);

        // Convert array to ArrayList and display
        System.out.println("\nConverting Array to ArrayList:");
        System.out.println(functions.arrayToArrayList(array));

        // Convert ArrayList back to array and display
        System.out.println("\nConverting ArrayList to Array:");
        int[] newArray = functions.arrayListToArray(functions.arrayToArrayList(array));
        for (int num : newArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

