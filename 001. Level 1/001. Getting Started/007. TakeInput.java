import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		/*

		// integer input

		int n = scn.nextInt();

		for(int i = 0; i <= n; i++) {
			System.out.println(i);
		}

		*/

		/*

		// string input

		String name = scn.nextLine();
		System.out.println("Hello " + name);

		*/

		int n = Integer.parseInt(scn.nextLine());
		String name = scn.nextLine();

		System.out.println("Dear " + name + ", here is the counting");

		for(int i = 0; i <= n; i++) {
			System.out.println(i);
		}

		/*
		When we have to take both integer and string as input, 
		then take the integer input as string 
		and use Integer.parseInt() to convert string to integer.
		*/
	}
}