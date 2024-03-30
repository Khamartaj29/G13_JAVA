public class ArrayExceptionHandling 
{
    public static void main(String[] args) 
    {
        int[] numbers = {1, 2, 3, 4, 5};

        try 
        {
            // Trying to access an element beyond the array's bounds
            int index = 10;
            System.out.println("Accessing element at index " + index + ": " + numbers[index]);
        } 
        catch (ArrayIndexOutOfBoundsException e) 
        {
            // Catching the ArrayIndexOutOfBoundsException
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } 
        finally 
        {
            // Finally block to execute regardless of exception occurrence
            System.out.println("Finally block executed");
        }
    }
}

/*
OUTPUT:

ArrayIndexOutOfBoundsException caught: Index 10 out of bounds for length 5
Finally block executed

*/

