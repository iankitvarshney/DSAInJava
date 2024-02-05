import java.util.*;

public class Main {

	public static void printReverse(int num) {

		while(num > 0) {
			int digit = num % 10;
			num /= 10;
			System.out.println(digit);
		}

	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int number = scn.nextInt();

		printReverse(number);
	}
}

/*

Input:
1234

Output:
4
3
2
1

*/