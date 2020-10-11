package homework5;

import java.util.HashMap;

public class question2 {

	public static void main(String[] args) {
		HashMap<String,String> S = new HashMap<String,String>();
		
		S.put("red", "david");
		S.put("yellow", "david1");
		S.put("green", "david2");
		S.put("purple", "david3");
		S.put("brown", "david4");
		
		System.out.println("books, authors name :"+ S);
		
		
		for (String Aname:S.keySet())
		{
		System.out.println("name :"+ Aname);	
		}

		
		for (String Bname:S.values())
		{
		System.out.println("name1 :"+Bname);
		}
	}

}
