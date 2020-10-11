package Homework4a;

public class question4 {

	public static void main(String[] args) {

		int[] inputval = new int[5];
		inputval[0]   = 1;
		inputval[1]   = 2;
		inputval[2]   = 3;
		inputval[3]   = 4;
		inputval[4]   = 5;
		
		
		System.out.println("input length result"+inputval.length);
		

		for(int i=0;i<inputval.length;i++)
		{
			System.out.println(" Array : "  +"index"+i+ " : " +	inputval[i]);
		}
		
		inputval[3] = 10;
		System.out.println(" Changed value index 3 :  "+inputval[3]  );
		
		
		
	
	}

}
