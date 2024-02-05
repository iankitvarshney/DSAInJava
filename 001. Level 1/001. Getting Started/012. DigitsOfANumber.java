import java.util.*;

public class Main {

	public static int countDigits(int num) {

		int count = 0;

		while(num > 0) {
			count++;
			num /= 10;
		}

		return count;
	}

	public static void printDigits(int num) {

		int digits = countDigits(num);
		int divisor = (int)Math.pow(10, digits - 1);

		while(divisor != 0) {
			int digit = num / divisor;
			int remainder = num % divisor;

			System.out.println(digit);

			num = remainder;
			divisor /= 10;
		}
	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int number = scn.nextInt();

		printDigits(number);
	}
}

/*

Input:
123400

Output:
1
2
3
4
0
0

*/