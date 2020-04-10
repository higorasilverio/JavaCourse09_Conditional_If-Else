package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("*** Verifying if the two numbers given are multiples ***");
		System.out.print("Enter the first number: ");
		int A = scanner.nextInt();
		System.out.print("Enter the second number: ");
		int B = scanner.nextInt();
		if (A % B == 0 || B % A == 0) System.out.println("The numbers are multiples!");
		else System.out.println("The numbers aren't multiples!");
		
		scanner.close();
		
	}

}
