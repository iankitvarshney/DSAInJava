import java.util.*;

public class Main {

	// optimized approach
	public static void primeFactorization(int num) {

		for(int div = 2; (div * div) <= num; div++) {
			while(num % div == 0) {
				System.out.println(div);
				num /= div;
			}
		}

		if(num != 1) {
			System.out.println(num);
		}

	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();

		primeFactorization(num);
	}
}

/*

If p * q = n, 
then at the same time, p and q both cannot be greater than sqrt(n).
If there is no divisor smaller than or equal to sqrt(n) for n, 
then there will be no divisor of n beyond sqrt(n).
So, we just have to check divisors till sqrt(n).

For Example:
Input = 46

For 46, we will run loop till 6 (sqrt(46) = 6.78)
Division of 46 by 2 will give us 23.
Now, we will run loop till 4 (sqrt(23) = 4.79)

23 will not divide by 3.
23 will not divide by 4.

Then after 4, there will be no divisor of 23.

At the end, if we have num > 1, 
we print it because this is the only last prime factor.

*/