package roughworks;

import java.util.Scanner;

public class odd_or_even {
public static void main(String[] args) {
	int num;
	System.out.println("enter the integer:");
	Scanner cheems = new Scanner(System.in);
    num =cheems.nextInt();
	if(num % 2==0)
		System.out.println("it is even number");
	else
		System.out.println("it is odd number");
}
}
