package session1;
import session1.util.GCD;

public class CoprimeArgs {

	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("Program requiers two varibles.");
			System.exit(1);
		}
		
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		int d = GCD.BiggestDivisor(x, y);
		System.out.printf("gcd(%d, %d) = %d %s", x, y, d, d == 1 ? "coprime!" : "");
	}

}
