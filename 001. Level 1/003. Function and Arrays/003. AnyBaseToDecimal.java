import java.util.*;

public class Main {

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

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int base = scn.nextInt();

		int ans = anyBaseToDecimal(num, base);
		System.out.println(ans);

	}
}

/*

Input:
1172 8

Output:
634

*/

/*

[1172](8) = [634](10)

1 * 8^3 + 1 * 8^2 + 7 * 8^1 + 2 * 8^0 = 6 * 10^2 + 3 * 10^1 + 4 * 10^0

Now we are dividing 1172 by 10, 
so that we can separate 1, 1, 7, and 2 from each other.

Now, 2 is spare, so we multiply it with 8^0.
The number has 7 pairs of 8^1, so we multiplied 7 with 8^1.
The number has 1 pair of 8^2, so we multiplier 1 with 8^2.
And so on.

*/