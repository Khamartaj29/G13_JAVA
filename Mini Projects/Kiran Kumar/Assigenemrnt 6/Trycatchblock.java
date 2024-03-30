package Sure;

public class Trycatchblock {



    public static void main (String args[]) {
        //try block 
        try
        {
            int data = 125 / 5;
            System.out.println ("Result:" + data);
        } 
        //catch block
        catch (NullPointerException e) {
            
            System.out.println (e);
        } 
        //finally block
        finally {
           
            System.out.println ("No Exception::finally block executed");
        } 
        System.out.println ("rest of the code...");
    } 
}