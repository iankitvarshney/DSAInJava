import java.util.*;

public class Main {

	public static void pattern20(int n) {

		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				if(j == 1 || j == n) {
					System.out.print("*\t");
				}
				else if(i > n / 2 && (j == i || j + i == n + 1)) {
					System.out.print("*\t");
				}
				else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		pattern20(n);

	}
}

/*

Input:
5

Output:
*				*	
*				*	
*		*		*	
*	*		*	*	
*				*	

*/