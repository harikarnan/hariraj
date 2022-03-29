package roughworks;

public class twonumberswaping {
public static void main(String[] args) {
	float number1=23.9f, number2=45.5f;
			System.out.println("before swap the number");
	System.out.println("the number1 is=" +number1);
	System.out.println("the number2 is=" +number2);
	
	float temprory=number1;
	number1=number2;
	number2=temprory;
	
	System.out.println("after swap the number");
	System.out.println("the number1 is=" +number1);
	System.out.println("the number2 is=" +number2);
	
}
}
