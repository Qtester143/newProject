package homework5a;

import java.util.ArrayList;
public class question1 {

	public static void main(String[] args) {
	
		int a=1;
		int b = 2;
		int c = 3; 
		
		question1 cat = new question1();
		
		int numb = cat.large3(1,2,3);
		 System.out.println("largest number :"+numb);
	}

	public int large3(int a, int b, int c) {
		
		if ( a>b || a<b || c>a)
		return c;
											//error got before putting second return value
		return 0;
		
											/*public int large3(int a, int b, int c) {
			
											if ( a>b || a<b || c>a)
											return c;*/
											// i don't understand why java requires another return value
		
	
	
		
		
		
		
	}	
		
	}


	