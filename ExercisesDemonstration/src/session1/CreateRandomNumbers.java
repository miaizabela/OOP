package session1;

public class CreateRandomNumbers {

	public static void main(String[] args) {
		if (args.length !=2) {
			System.out.println("Program requires lower and upper bound.");
			System.exit(1);
		}
		
		int low = Integer.parseInt(args[0]);
		int high = Integer.parseInt(args[1]);
		
		if (low >= high) {
			System.out.println("Invalid bounds.");
			System.exit(1);
		}
		
		int x = randomizer(low, high);
		int y = randomizer(low, high);
		do {
			x = randomizer(low, high);
			y = randomizer(low, high);
		} while (x == y);
		
		System.out.printf("Two different random number in range [%d, %d] are %d and %d.", low, high, x, y);
	}

	private static int randomizer(int low, int high) {
		int x = (int) (low + (high - low + 1) * Math.random());
		return x;
	}

}
