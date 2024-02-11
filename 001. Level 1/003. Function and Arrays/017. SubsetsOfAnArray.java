import java.util.*;

public class Main {

	public static void subsets(int[] arr) {

		int limit = (int)Math.pow(2, arr.length);

		for(int i = 0; i < limit; i++) {

			String set = "";
			int value = i;

			for(int j = arr.length - 1; j >= 0; j--) {
				int remainder = value % 2;
				value /= 2;

				if(remainder == 0) {
					set = "-\t" + set;
				}
				else {
					set = arr[j] + "\t" + set;
				}
			}

			System.out.println(set);

		}
	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];

		for(int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		subsets(arr);

	}
}

/*

Input:
3
1 2 3

Output:
-	-	-	
-	-	3	
-	2	-	
-	2	3	
1	-	-	
1	-	3	
1	2	-	
1	2	3	

*/

/*

Array: [a, b, c]
Total Subsets: 2^3 = 8

- - -		0 => 0 0 0
- - c 	1 => 0 0 1
- b -		2 => 0 1 0
- b c 	3 => 0 1 1
a - - 	4 => 1 0 0
a - c 	5 => 1 0 1
a b - 	6 => 1 1 0
a b c 	7 => 1 1 1


NOTE:
Binary of a number will be given by remainders, 
which we will get by dividing given number by 2 repeatedly.

2 | 6
2 | 3 - 0
2 | 1 - 1
  | 0 - 1

Binary of 6 : 1 1 0

*/