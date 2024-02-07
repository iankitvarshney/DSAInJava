import java.util.*;

public class Main {

	public static int getDigitFrequency(int num, int digit) {

		int frequency = 0;

		while(num > 0) {
			int currDigit = num % 10;
			num /= 10;

			if(currDigit == digit) {
				frequency++;
			}
		}

		return frequency;
    
	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int digit = scn.nextInt();

		int frequency = getDigitFrequency(num, digit);
		System.out.println(frequency);

	}
}

/*

Input:
95439692 9

Output:
3

Input:
95439692 1

Output:
0

*/