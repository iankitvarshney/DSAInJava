import java.util.*;

public class Main {

	// brute force approach
	public static int gcd1(int num1, int num2) {

		int smallerNumber = Math.min(num1, num2);

		for(int div = smallerNumber; div > 1; div--) {
			if(num1 % div == 0 && num2 % div == 0) {
				return div;
			}
		}

		return 1;
	}

	// optimized approach
	public static int gcd2(int num1, int num2) {

		while(num1 % num2 != 0) {
			int remainder = num1 % num2;
			num1 = num2;
			num2 = remainder;
		}

		return num2;
	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int num1 = scn.nextInt();
		int num2 = scn.nextInt();

		int gcd = gcd2(num1, num2);
		int lcm = (num1 * num2) / gcd;

		System.out.println(gcd);
		System.out.println(lcm);
	}
}

/*

In Mathematics there is a division method.

In this, we try to divide the bigger number by smaller number.
Then the remainder which we get becomes the divisor, 
and the divisor from the previous step becomes the dividend.
In this way we keep on dividing till we get 0 as remainder.
The divisor which gives us remainder 0 will be the gcd.

In the first step, if we divided smaller number by bigger number, 
then the numbers will get swapped in the second iteration.
So, not to worry about bigger and smaller numbers.


There is a formula.
gcd * lcm = num1 * num2

*/