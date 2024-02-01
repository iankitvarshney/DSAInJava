import java.util.*;

public class Main {

	public static void main(String[] args) {

		int x = 15;
		int y = 10;

		int sum = x + y;
		int product = x * y;

		System.out.println("Sum of " + x + " and " + y + " is " + sum);
		System.out.println("Product of " + x + " and " + y + " is " + product);

		int v1 = x / y;
		int v2 = y / x;
		int v3 = x % y;

		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);

		/*
		In Java, division operator (/) returns the quotient value.
		And modulus operator (%) returns the remainder value.
		*/

		/*
		Expression: x * y / x + y
		Correct Answer: 15 * 10 / 15 + 10 = 6
		*/

		int expression1 = x * y / x + y;
		System.out.println(expression1);

		/*
		In Programming, there is no BODMAS rule.
		* , / and % have same priority.
		+ and - also have same priority.
		But * , / and % have more priority than + and - 
		*/

		/*
		=> 15 * 10 / 15 + 10
		=> 150 / 15 + 10
		=> 10 + 10
		=> 20
		*/

		int expression2 = (x * y) / (x + y);
		System.out.println(expression2);
		
	}
}

/*
Output:

Sum of 15 and 10 is 25
Product of 15 and 10 is 150
1
0
5
20
6

*/