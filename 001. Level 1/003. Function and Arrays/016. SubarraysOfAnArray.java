import java.util.*;

public class Main {

	public static void subarrays(int[] arr) {

		for(int i = 0; i < arr.length; i++) {
			for(int j = i; j < arr.length; j++) {
				for(int k = i; k <= j; k++) {
					System.out.print(arr[k] + "\t");
				}
				System.out.println();
			}
		}

	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];

		for(int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		subarrays(arr);

	}
}

/*

Input:
3
10 20 30

Output:
10	
10	20	
10	20	30	
20	
20	30	
30	

Input:
4
10 20 30 40

Output:
10	
10	20	
10	20	30	
10	20	30	40	
20	
20	30	
20	30	40	
30	
30	40	
40	

*/