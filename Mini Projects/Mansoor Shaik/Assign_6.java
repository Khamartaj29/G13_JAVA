package com.practice;

public class Assign_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[5];
		try
		{
			arr[0]=5;
			arr[1]=10;
			arr[2]=15;
			arr[3]=20;
			arr[4]=25;
			arr[5]=25;
		}
		catch(ArrayIndexOutOfBoundsException e1)
		{
			System.out.println("Size of the array is "+arr.length);
			System.out.println("ArrayIndexOutOfBoundsException exception is handled");
		}
		finally
		{
			int sum = arr[0]+arr[4];
			System.out.println("Sum of the array is "+sum);
		}

	}
	
	/*Output
	 Size of the array is 5
	 ArrayIndexOutOfBoundsException exception is handled
	 Sum of the array is 30
	 */

}
