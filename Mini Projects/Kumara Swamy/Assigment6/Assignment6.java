package suretrust;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubpublic class TryCatchFinallyExample {
	        System.out.println("Starting of the program");

	        int[] numbers = {1, 2, 3, 4, 5};

	        try {
	            System.out.println(numbers[10]); // This will throw an ArrayIndexOutOfBoundsException
	        } catch (ArrayIndexOutOfBoundsException e) {
	           System.out.println("An ArrayIndexOutOfBoundsException occurred: " + e.getMessage());
	        } finally {
	            System.out.println("End of the try-catch-finally block");
	        }

	        System.out.println("End of the program");
	    }
	

	}

//output
//Starting of the program
//An ArrayIndexOutOfBoundsException occurred: Index 10 out of bounds for length 5
//End of the try-catch-finally block
//End of the program

