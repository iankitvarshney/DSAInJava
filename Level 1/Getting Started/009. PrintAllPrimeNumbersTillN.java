import java.util.*;

public class Main {

	public static boolean isPrime(int num) {

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

	public static void primeNumbersInARange(int low, int high) {

		for(int num = low; num <= high; num++) {
			boolean ans = isPrime(num);
			if(ans == true) {
				System.out.println(num);
			}
		}
	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int low = scn.nextInt();
		int high = scn.nextInt();

		primeNumbersInARange(low, high);
	}
}

/*

Input:
6
24

Output:
7
11
13
17
19
23

*/