package inClassassignment;

import java.util.HashMap;

public class question1 {

	public static void main(String[] args) {
		
		HashMap<String,String> H = new HashMap<String,String>();
		H.put("aaa", "shoesdept");
		H.put("bbb","ladiesdept");
		H.put("ccc", "homesdept");
		H.put("ddd", "mendept");
		
		System.out.println("Name :" + H);
		
		for (String dept:H.values())
		{
			System.out.println("name :"+dept);
		}
		
		
	}

}
