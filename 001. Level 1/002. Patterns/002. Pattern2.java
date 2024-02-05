import java.util.*;

public class Main {

	public static void pattern2(int n) {

		for(int i = n; i > 0; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*\t");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		pattern2(n);

	}
}

/*

Input:
5

Output:
*	*	*	*	*	
*	*	*	*	
*	*	*	
*	*	
*	

*/