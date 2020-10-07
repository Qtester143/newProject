package calculator;

import java.util.Scanner;

public class evenOddnum {

	public static void main(String[] args) {
	//Get a number from user and write java code to return number is
	//	even or not

	
		Scanner E = new Scanner(System.in);
		int even = E.nextInt();
		
		int varA = 21;
		int varB = 11;

		switch (even) {
		case 1 :
			int result = varA-varB;
			System.out.print("odd result--"+result);
			break;
		case 2 :
			int result1 = varA+varB;
			System.out.print("even resultt--"+ result1);
			break;
		
			
		}

			}
	}


