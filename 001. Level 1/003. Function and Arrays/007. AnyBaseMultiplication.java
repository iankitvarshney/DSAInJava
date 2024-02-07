import java.util.*;

public class Main {

	public static int anyBaseAddition(int base, int num1, int num2) {

		int answer = 0;
		int carry = 0;
		int multiplier = 1;

		while(num1 > 0 || num2 > 0 || carry > 0) {
			int sum = (num1 % 10) + (num2 % 10) + carry;
			int remainder = sum % base;

			carry = sum / base;
			answer += (remainder * multiplier);
			multiplier *= 10;

			num1 /= 10;
			num2 /= 10;
		}

		return answer;

	}

	public static int anyBaseDigitMultiplication(int base, int num, int digit) {

		int answer = 0;
		int carry = 0;
		int multiplier = 1;

		while(num > 0 || carry > 0) {
			int numDigit = num % 10;
			int multiplication = (numDigit * digit) + carry;
			int remainder = multiplication % base;

			answer += (remainder * multiplier);
			carry = multiplication / base;
			multiplier *= 10;
			num /= 10;
		}

		return answer;

	}

	public static int anyBaseMultiplication(int base, int num1, int num2) {

		int answer = 0;
		int multiplier = 1;

		while(num2 > 0) {
			int digit = num2 % 10;
			int value = anyBaseDigitMultiplication(base, num1, digit);

			answer = anyBaseAddition(base, answer, value * multiplier);
			multiplier *= 10;
			num2 /= 10;
		}

		return answer;

	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int base = scn.nextInt();
		int num1 = scn.nextInt();
		int num2 = scn.nextInt();

		int ans = anyBaseMultiplication(base, num1, num2);
		System.out.println(ans);

	}
}

/*

Input:
8 234 76

Output:
22710

Input:
8 2156 4

Output:
10670

*/