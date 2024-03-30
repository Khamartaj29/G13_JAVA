package learningandpraticingjava;


public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[];
      arr= new int[5];
     try 
     {
      arr[0]=10;
      arr[1]=15;
      arr[2]=20;
      arr[3]=25;
      arr[4]=30;
      arr[5]=35;
      arr[6]=40;
     }
     catch(ArrayIndexOutOfBoundsException e1)
     {
    	 System.out.println("Length of the array is: "+arr.length);
    	 System.out.println("ArrayIndexOutOfBounds Exception is handled");
     }
     finally 
     { 
    	int sum=arr[0]+arr[4];
    	System.out.println("The sum of the first and last element is = "+sum);
     }
	}

	/*OUTPUT:
	 Length of the array is: 5
     ArrayIndexOutOfBounds Exception is handled
     The sum of the first and last element is = 40
	 */
}
