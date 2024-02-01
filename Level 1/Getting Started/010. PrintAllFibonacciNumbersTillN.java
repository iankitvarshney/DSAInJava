import java.util.*;

public class Main {

	public static void printNFibonacciNumbers(int n) {

		if(n <= 0) {
			return;
		}

		int secondLastNumber = -1;
		int lastNumber = 1;

		for(int i = 0; i < n; i++) {
			int currentNumber = lastNumber + secondLastNumber;

			System.out.println(currentNumber);

			secondLastNumber = lastNumber;
			lastNumber = currentNumber;
		}

	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		printNFibonacciNumbers(n);
	}
}

/*

Input:
10

Output:
0
1
1
2
3
5
8
13
21
34

*/