import java.util.*;

public class Main {

	public static boolean isPythagoreanTriplet(int num1, int num2, int num3) {

		int hypotenuse = Math.max(num1, Math.max(num2, num3));
		int base = Math.min(num1, Math.min(num2, num3));
		int perpendicular = (num1 + num2 + num3) - (hypotenuse + base);

		if((hypotenuse * hypotenuse) == ((base * base) + (perpendicular * perpendicular))) {
			return true;
		}
		else {
			return false;
		}
		
	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int num1 = scn.nextInt();
		int num2 = scn.nextInt();
		int num3 = scn.nextInt();

		boolean ans = isPythagoreanTriplet(num1, num2, num3);
		System.out.println(ans);
	}
}