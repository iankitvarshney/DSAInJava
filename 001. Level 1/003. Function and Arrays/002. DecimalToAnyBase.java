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

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int base = scn.nextInt();

		int ans = decimalToAnyBase(num, base);
		System.out.println(ans);

	}
}

/*

Input:
57 2

Output:
111001

Input:
694 8

Output:
1266

Input:
634 8

Output:
1172

Input:
63 8

Output:
77

*/

/*

[634](10) = [1172](8)

634 / 8  q: 79  r: 2
79 / 8   q: 9   r: 7
9 / 8    q: 1   r: 1
1 / 8    q: 0   r: 1


= 2 * 10^0 + 7 * 10^1 + 1 * 10^2 + 1 * 10^3
= 1172


Why we did this ?
Why we divided the number by the new base value ?

[634](10) = [1172](8)

6 * 10^2 + 3 * 10^1 + 4 * 10^0 = 1 * 8^3 + 1 * 8^2 + 7 * 8^1 + 2 * 8^0

In 634, the groups are in pairs of 10
In 1172, the groups are in pairs of 8

Now, how division of 8 helped us.

634 / 8  q: 79  r: 2    634 = 8 * 79 + 2
79 / 8   q: 9   r: 7    79 = 8 * 9 + 7
9 / 8    q: 1   r: 1    9 = 8 * 1 + 1
1 / 8    q: 0   r: 1

Now, here we grouped 634 into 79 pairs of 8 and 2 is remaining.
We grouped 79 into 9 groups of 8 and 7 is remaining.
We grouped 9 into 1 group of 8 and  1 is remaining.

We have 9 = 8^1 * 1 + 1

We substitute this 9 value into 79's equation

79 = 8^2 * 1 + 8^1 * 1 + 7 (spare : 7)

634 = 8^3 * 1 + 8^2 * 1 + 8^1 * 7 + 2

Now, we are dividing by 8 so that we can get the groups of powers of 8.
Now, to print them in reverse order, we multiplied them by 10.

*/