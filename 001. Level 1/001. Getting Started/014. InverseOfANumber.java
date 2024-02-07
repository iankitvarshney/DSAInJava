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

/*

p d  p d
1 3  1 4
2 5  2 5
3 4  3 1
4 1  4 3
5 2  5 2

81456273  -->  82456137

8 1 4 5 6 2 7 3     -->    8 2 4 5 6 1 3 7
8 7 6 5 4 3 2 1     -->    8 7 6 5 4 3 2 1

2 1 4 3    -->    2 1 4 3
4 3 2 1    -->    4 3 2 1

*/