package com.gaurav.programs.basic;

public class GcdAndLcm {
	public static void main(String[] args) {

		int n1 = 81, n2 = 153, gcd = 1;

		gcd = GcdUsingForLoop(n1, n2, gcd);
		
		int lcm = (72 * 120) / gcd;
        System.out.printf("The LCM of %d and %d is %d.", 72, 120, lcm);

		GcdUsingWhileLoop(n1, n2);

		GcdOfBothNegAndPosNum(n1, n2);
		
		
	}

	private static int GcdUsingForLoop(int n1, int n2, int gcd) {
		for (int i = 1; i <= n1 && i <= n2; ++i) {
			// Checks if i is factor of both integers
			if (n1 % i == 0 && n2 % i == 0)
				gcd = i;
		}

		System.out.printf("G.C.D of %d and %d is %d", n1, n2, gcd);
		
		return gcd;
	}

	private static void GcdUsingWhileLoop(int n1, int n2) {
		while (n1 != n2) {
			if (n1 > n2)
				n1 -= n2;
			else
				n2 -= n1;
		}

		System.out.println("G.C.D = " + n1);

	}

	private static void GcdOfBothNegAndPosNum(int n1, int n2) {
		// Always set to positive
		n1 = (n1 > 0) ? n1 : -n1;
		n2 = (n2 > 0) ? n2 : -n2;

		GcdUsingWhileLoop(n1, n2);
	}
}
