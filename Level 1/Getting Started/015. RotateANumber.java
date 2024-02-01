import java.util.*;

public class Main {

	public static int countDigits(int num) {

		int count = 0;

		while(num > 0) {
			count++;
			num /= 10;
		}

		return count;
	}

	public static int rotateNumber(int num, int k) {

		int digits = countDigits(num);

		k = k % digits;

		if(k < 0) {
			k = k + digits;
		}

		int divisor = 1;
		int multiplier = 1;

		for(int i = 1; i <= digits; i++) {
			if(i <= k) {
				divisor *= 10;
			}
			else {
				multiplier *= 10;
			}
		}

		int quotient = num / divisor;
		int remainder = num % divisor;

		int rotatedNumber = (remainder * multiplier) + quotient;

		return rotatedNumber;
	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int k = scn.nextInt();

		int ans = rotateNumber(n, k);
		System.out.println(ans);

	}
}

/*

num: 12345

k = -4 => 51234
k = -3 => 45123
k = -2 => 34512
k = -1 => 23451
k = 1 ==> 51234
k = 2 ==> 45123
k = 3 ==> 34512
k = 4 ==> 23451
k = 5 ==> 12345
k = 6 ==> 51234

*/