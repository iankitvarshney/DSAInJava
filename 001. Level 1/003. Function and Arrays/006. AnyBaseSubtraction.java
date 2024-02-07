import java.util.*;

public class Main {

	public static int anyBaseSubtraction(int base, int num1, int num2) {

		int answer = 0;
		int carry = 0;
		int multiplier = 1;

		while(num2 > 0) {
			int firstDigit = num1 % 10;
			int secondDigit = num2 % 10;

			if(carry < 0) {
				secondDigit += carry;
			}

			if(secondDigit < firstDigit) {
				carry = -1;
				secondDigit += base;
			}
			else {
				carry = 0;
			}

			int difference = secondDigit - firstDigit;

			answer += (difference * multiplier);
			multiplier *= 10;

			num1 /= 10;
			num2 /= 10;
		}

		return answer;
	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int base = scn.nextInt();
		int num1 = scn.nextInt();
		int num2 = scn.nextInt();

		int ans = anyBaseSubtraction(base, num1, num2);
		System.out.println(ans);

	}
}

/*

Input:
8 236 1212

Output:
754

Input:
8 256 1212

Output:
734

Input:
7 21 202

Output:
151

Input:
8 236 1202

Output:
744

*/