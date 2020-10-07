package calculator;

import java.util.Scanner;

public class basicOperations {

	public static void main(String[] args) {
int var =4;
Scanner S = new Scanner(System.in);
var = S.nextInt();
int num1 = 1;
int num2 = 2;
switch (var) {
case 1 :
	int result = num1*num2;
	System.out.print("multiplication result--"+result);
	break;
case 2 :
	int result1 = num1+num2;
	System.out.print("practicing result--"+ result1);
	break;
case 3 :
	int result2 = num1-num2;
	System.out.print("practicing result--"+ result2);
	break;
	
case 4 :
	int result3 = num1/num2;
	System.out.print("practicing result--"+ result3);
	break;
	default:
		System.out.println("invalid variable");
	
	
	
}

	}

}
