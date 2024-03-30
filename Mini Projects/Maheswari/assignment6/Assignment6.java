package suretrust;

public class Assignment6 {
	public static void main(String[]args) {
	int i=0;
	try {
	int j=30/i;//ARTHEMATIC EXCEPTION OCCURS HERE
	
	System.out.print(j);
	}
	catch(Exception e) {
		System.out.print("In the above sentance it has error");
	}
	finally {
		System.out.print("\nThe problem was solved");
	}
	

}
}
OUTPUT:

In the above sentance it has error
The problem was solved