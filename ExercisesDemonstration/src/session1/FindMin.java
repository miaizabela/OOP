package session1;

public class FindMin {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("No arguments received.");
			return;
		}
		int min = Integer.parseInt(args[0]);
		for (int i = 0; i < args.length; i++) {
			int parsedInt = Integer.parseInt(args[i]);
			if (parsedInt < min) {
				min = parsedInt;
			}
		}
		System.out.println("The smallest number is " + min);
	}

}
