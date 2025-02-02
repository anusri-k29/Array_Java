//Main.java
class Main{
	public static void main(String args[]){
		UserInput ui = new UserInput();
		ArrayFunctions functions = new ArrayFunctions();
		int[] array = ui.arrayInput();
		functions.evenOdd(array);
		functions.difference(array);
	}
}