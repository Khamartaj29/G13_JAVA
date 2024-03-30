package Sure_trust;
import java.util.*;
public class Assignment1 {
         public static boolean div(int n) {
        	 return n%2==0;
         }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		 for(int i=1;i<=n;i++)
		 {
			 if(i%2==0)
			 {
				 System.out.println(i+ " The given number is divisable by 2");
			 }
			 else
			 {
				 System.out.println(i+ " The given number is not divisable by 2");
			 }
		 }
		 sc.close();
	}

}
