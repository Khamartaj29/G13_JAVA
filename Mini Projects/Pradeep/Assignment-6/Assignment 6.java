class Main {

  public static void main(String[] args) {
    try {
      int a = 15;
      int b = 5;

      System.out.println("Value of  a = " + a);
      System.out.println("Value of  b = " + b);

      int c = a / b;
      System.out.println("a / b = " + c);
    } 
    catch (Exception e) {
      System.out.println("Exception Thrown: " + e);
    } 
    finally {
      System.out.println("Finally block executed!");
    }
  }
}


/*OUTPUT:
Value of a=15
value ob b=15a/b=3
Finally Block executed!*/