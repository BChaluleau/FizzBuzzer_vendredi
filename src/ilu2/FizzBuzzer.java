package ilu2;

public class FizzBuzzer {

	private static int MAGIC_KEY = 3;
	private static String MAGIC_VALUE = "fizz";

	int round = 1;

	public String next() {
		if (round == MAGIC_KEY) {
			round++;
			return MAGIC_VALUE;
		}
		return String.format("%d", round++);
	}

}
