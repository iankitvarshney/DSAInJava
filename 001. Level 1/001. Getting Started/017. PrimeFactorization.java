import java.util.*;

public class Main {

	// optimized approach
	public static void primeFactorization(int num) {

		for(int div = 2; (div * div) <= num; div++) {
			while(num % div == 0) {
				System.out.println(div);
				num /= div;
			}
		}

		if(num != 1) {
			System.out.println(num);
		}

	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();

		primeFactorization(num);
	}
}