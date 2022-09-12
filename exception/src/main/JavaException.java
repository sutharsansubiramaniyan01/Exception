package main;

public class JavaException {
//		int a=50/0;								//ArithmeticException 	
//		String s="abc";  
//		int i=Integer.parseInt(s);				//NumberFormatException 
		public static void main(String[] args) {
//			int var1[]=new int[5];  
//			var1[10]=50; 						//ArrayIndexOutOfBoundsException
//			String s=null;  
//			System.out.println(s.length());		//NullPointerException
			try  
	        {  
	        int var2= 1/0;    
	        }  
	            //handling the exception  
	        catch(ArithmeticException e)  
	        {  
	            System.out.println("Can't divided by 0");  
	        }  
//			 try  
//		        {  
//		        int data=50/0; 						  
//		  
//		        }  
//		           
//		        catch(ArrayIndexOutOfBoundsException e)  	// try to throw different exception but it will give arithmetic exception.
//		        {  
//		            System.out.println(e);  
//		        }  
//		        System.out.println(" end");  
		    }  
	    }  

