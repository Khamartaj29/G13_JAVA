package assignment;

public class assignment {

	public static void main(String[] args) {
		
			  
			     
			     try{  
			            System.out.println("start");
			            int num=67/0;  
			            System.out.println(num);  
			      }  
			      
			      catch(ArithmeticException e){
			          System.out.println("end");
			         System.out.println("ArithmeticException::Number divided by zero");
			      }  
			      
			      finally{
			          System.out.println("finally");
			      }  
			      System.out.println("Reset ");  
			   }   
			

	}
////*output:
//	start
//	end
//	ArithmeticException::Number divided by zero
//	finally
//	Reset //*

	


