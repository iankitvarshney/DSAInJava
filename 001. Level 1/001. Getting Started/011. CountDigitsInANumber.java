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

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int number = scn.nextInt();

		int digits = countDigits(number);
		System.out.println(digits);
	}
}

/*

Input:
100232

Output:
6

*/