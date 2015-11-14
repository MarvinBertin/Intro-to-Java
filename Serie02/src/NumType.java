import java.util.Scanner;

public class NumType {
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Enter a Number: ");
		int num = scanner.nextInt();
		
		String sign = "";
		String pair = "";
		
		if (num > 0) {
			sign = "positive";
		} else if (num < 0) {
			sign = "negative";
		} else {
			sign = "zero";
		}
		if (num % 2 == 0) {
			pair = "even";
		} else {
			pair = "odd";
		}
		
		System.out.println("This number is "
							+ sign
							+ " and "
							+ pair);
 	}

}
