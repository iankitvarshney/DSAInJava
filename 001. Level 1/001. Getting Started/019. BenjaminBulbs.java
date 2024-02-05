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