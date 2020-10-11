package newArraylist;

import java.util.ArrayList;

public class question3 {

	
				
	public static void main(String[] args) {
		
		 question3 result = new  question3();
		 
				 boolean numb =result.makes10(9,10);
		System.out.print("practicing result :"+numb );
		
	}
	public boolean makes10(int a, int b)       // makes10(9, 10)
	{
	 if(a ==10 || b==10  ||  (a+b)==10)
	{
	return true;
	}
	else
	{
		return false;	
	}
		
		
	}
}
		
	




