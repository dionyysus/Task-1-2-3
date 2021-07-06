package Entity;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the your ID");
		String identity = sc.nextLine();
		
		SumNumbers sumNumbers = new SumNumbers(identity);
	
		System.out.println("Sum of ID: " +sumNumbers.ConvertToInt(identity));
		
		
		// 2. Method
		
		int sum = 0;
		
		for(int i = 0; i< 11; i++) {
			System.out.println("Please enter the your characters of ID "+i);
			int id = sc.nextInt();
			sum += id;
		}
		
		System.out.println("Sum of ID: " +sum);
		

	}

}
