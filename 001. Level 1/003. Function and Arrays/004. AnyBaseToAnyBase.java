import java.util.*;

public class Main {

	public static int decimalToAnyBase(int num, int base) {

		int answer = 0;
		int multiplier = 1;

		while(num > 0) {
			int remainder = num % base;
			num /= base;

			answer += (remainder * multiplier);
			multiplier *= 10;
		}

		return answer;

	}

	public static int anyBaseToDecimal(int num, int base) {

		int answer = 0;
		int multiplier = 1;

		while(num > 0) {
			int remainder = num % 10;
			num /= 10;

			answer += (remainder * multiplier);
			multiplier *= base;
		}

		return answer;

	}

	public static int anyBaseToAnyBase(int num, int base1, int base2) {

		int decimalNumber = anyBaseToDecimal(num, base1);
		int baseNumber = decimalToAnyBase(decimalNumber, base2);

		return baseNumber;

	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int base1 = scn.nextInt();
		int base2 = scn.nextInt();

		int ans = anyBaseToAnyBase(num, base1, base2);
		System.out.println(ans);

	}
}

/*

Input:
172 8 2

Output:
1111010

*/

/*

We will first convert the given number to decimal number.
Then we convert the decimal number to new base number.

Don't try to convert directly from current base number to new base number.
It will give wrong answer.
Try to find out why is it giving wrong answer.

*/