import java.util.*;

public class Main {

	public static void main(String[] args) {

		// program 1

		int x = 12;

		if(x % 2 == 0) {
			System.out.println(x + " is Even");
		}
		else {
			System.out.println(x + " is Odd");
		}


		// program 2

		int n1 = 20;
		int n2 = 30;

		if(n1 == n2) {
			System.out.println(n1 + " is equal to " + n2);
		}
		else {
			if(n1 > n2) {
				System.out.println(n1 + " is greater than " + n2);
			}
			else {
				System.out.println(n1 + " is smaller than " + n2);
			}
		}


		// program 3

		int m1 = 20;
		int m2 = 10;

		if(m1 == m2) {
			System.out.println(m1 + " is equal to " + m2);
		}
		else if(m1 > m2) {
			System.out.println(m1 + " is greater than " + m2);
		}
		else {
			System.out.println(m1 + " is smaller than " + m2);
		}

	}
}

/*
Output:

12 is Even
20 is smaller than 30
20 is greater than 10

*/