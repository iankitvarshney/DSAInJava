import java.util.*;

public class Main {

	public static int numberInverse(int num) {

		int inverse = 0;
		int index = 1;

		while(num > 0) {
			int value = num % 10;
			int multiplier = (int)Math.pow(10, value - 1);

			inverse += (index * multiplier);
			index++;
			num /= 10;
		}

		return inverse;
	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();

		int ans = numberInverse(num);
		System.out.println(ans);
	}
}

/*

Input:
426135

Output:
416253

Input:
2134

Output:
1243

Input:
24153

Output:
24153

Input:
81456273

Output:
82456137

Input:
2143

Output:
2143

*/