package inClasspolymorphism;

public class Hounds extends Dog {

	
public void sniff()
{
	System.out.println("sniff");
	
	}

public void bark()
{
	
	System.out.print("bowl");
	}


public static void main(String[] args) {
		Dog dog = new  Hounds();
		dog.bark();
}
}

