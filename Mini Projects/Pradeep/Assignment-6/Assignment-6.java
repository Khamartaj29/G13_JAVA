class Main {
    public static void main (String args[]) {
        try
        {
            System.out.println ("Try Block");
            int pra = 125 / 5;
            System.out.println ("Result=" + pra);
        } 
        
        catch (NullPointerException e) {
            System.out.println ("Catch Block");
            System.out.println (e);
        } 
        
        finally {
            System.out.println ("Finally Block");
            System.out.println ("No Exception in finally block executed");
        } 
        System.out.println ("Remaining code......");
    } 
}

/*OUTPUT:

Result=25
Finally blockNo Exception in finally block ececuted
Remaining code..........*/
