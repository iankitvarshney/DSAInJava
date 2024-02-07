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

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int base = scn.nextInt();
		int num1 = scn.nextInt();
		int num2 = scn.nextInt();

		int ans = anyBaseAddition(base, num1, num2);
		System.out.println(ans);

	}
}

/*

Input:
8 346 777

Output:
1345

Input:
5 234 343

Output:
1132

Input:
8 767 421

Output:
1410

Input:
8 236 754

Output:
1212

Input:
8 1236 754

Output:
2212

Input:
8 1236 54

Output:
1312

*/

/*

[346](8) + [777](8)

  3 4 6
+ 7 7 7

6 + 7  = 13
There is no number 13 in octal.
13 = 8^1 + 5, carry = 1 and answer = 5

1 + 4 +7 = 12
12 = 8^1 + 4, carry = 1 and answer = 4

1 + 3 + 7  = 11
11 = 8^1 + 3, carry 1 and answer 3


Addition = 1345

*/