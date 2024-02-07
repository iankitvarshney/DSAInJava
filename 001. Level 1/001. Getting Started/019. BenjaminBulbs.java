import java.util.*;

public class Main {

	public static void benjaminBulbs(int n) {

		for(int num = 1; (num * num) <= n; num++) {
			System.out.println(num * num);
		}

	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		benjaminBulbs(n);

	}
}

/*

It's a puzzle problem.

First of all, we dry run it for n = 20.
We will get the answer as: 1, 4, 9, 16.

Solution:

We just have to print the perfect squares till n.

For 10 -> Output : 1 4 9
For 20 -> Output : 1 4 9 16


Why will perfect square bulbs remain on ?

Actually, all the thing depends on how many factors a number has.

If a bulb number has even number of factors, 
it will involve in even number of cycles and remain off at the end.

If a bulb number has odd number of factors, 
it will involve in odd number of cycles and remain on at the end.

And all perfect square numbers have odd number of factors.

*/