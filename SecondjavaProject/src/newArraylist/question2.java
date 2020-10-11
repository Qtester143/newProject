package newArraylist;

import java.util.ArrayList;

public class question2 {

	public static void main(String[] args) {
		
		
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);	//index0
		numbers.add(2);	//index1
		numbers.add(3);	//index2
		numbers.add(4);	//index3
		numbers.add(5);	//index4
		numbers.add(6);	//index5
		
		for(int i=0; i<numbers.size();i++)
		{
			System.out.println (numbers.get(i));
		}
		
		
		

	}

}
