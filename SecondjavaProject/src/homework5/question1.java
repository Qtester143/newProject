package homework5;

import java.util.HashMap;

public class question1 {

	public static void main(String[] args) {
		
		
		HashMap<String,Integer> R = new HashMap<String,Integer>();
		
		R.put("sam", 10);
		R.put("sam1", 20);
		R.put("sam2",30);
		R.put("sam3",40);
		
		System.out.println("person name and salary :"+ R);
		
		
		
		for (String empName:R.keySet())
		{
			System.out.println("employees name :"+empName);
			
		}
		
		for (Integer Salary :R.values())
		System.out.println("employees salary :"+ Salary);
			
			
		
		
		}
			
		
		
		

	}


