import java.util.*;

public class Main {

	// brute force approach
	public static boolean isPrime1(int num) {

		if(num <= 1) {
			return false;
		}

		for(int div = 2; div < num; div++) {
			if(num % div == 0) {
				return false;
			}
		}

		return true;
	}

	// better approach
	public static boolean isPrime2(int num) {

		if(num <= 1) {
			return false;
		}

		for(int div = 2; div <= (num / 2); div++) {
			if(num % div == 0) {
				return false;
			}
		}

		return true;
	}

	// optimized approach
	public static boolean isPrime3(int num) {

		if(num <= 1) {
			return false;
		}

		for(int div = 2; (div * div) <= num; div++) {
			if(num % div == 0) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int tests = scn.nextInt();

		while(tests-- > 0) {
			int num = scn.nextInt();
			boolean ans = isPrime3(num);
			if(ans == true) {
				System.out.println("prime");
			}
			else {
				System.out.println("not prime");
			}
		}
	}
}

/*

NOTE:
If a program is doing around 10^9 operations, 
then it approximately runs in 1 second.

10^9 Operations => 1 Second


Factors of 24

1 * 24    24 * 1
2 * 12    12 * 2
3 * 8    8 * 3
4 * 6    6 * 4

Factors of 36

1 * 36    36 * 1
2 * 18    18 * 2
3 * 12    12 * 3
4 * 9    9 * 4
    6 * 6

Suppose, we have factors of n as p and q.
If p * q = n

Case I: p and q can be equal to sqrt(n)

Case II: p < sqrt(n) and q > sqrt(n)

Case III: p > sqrt(n) and q < sqrt(n)

Both p and q cannot be greater than sqrt(n) at the same time.
One factor should be smaller than sqrt(n), 
and other factor should be larger than sqrt(n), if they are not equal.

So, if we got no factor of n smaller than sqrt(n), 
then there will also be no factor of n greater than sqrt(n).

Suppose, if there is a factor of n greater than sqrt(n), 
then it should also have its pair smaller than sqrt(n).
And if its pair doesn't exist, then that factor also doesn't exist.

So, we just have to check the factors of n till sqrt(n).
If we found any factor, then n is not a prime number.
Otherwise n is a prime number.

Time Complexity: O(sqrt(n))

Factors of 25

1 * 25
5 * 5
25 * 1

Factors of 49

1 * 49
7 * 7
49 * 1

One more optimization.
We don't have to check the division with every number till sqrt(n).
As soon as we got a divisor, we will return false, i.e. not a prime number.

*/