package session1.util;

public class GCD {

	public static int BiggestDivisor (int x, int y) {
		int max;
		int divisor = 1;
		
		if (x < y) {
			max = y;
		}
		else {
			max = x;
		}
		
		for (int i = 2; i <= max; i++) {
			if (x%i == 0 & y%i == 0) {
				divisor = i;
			}
		}
		return divisor;
	}
}
