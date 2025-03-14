package ilu2;

public class FizzBuzzer {

	int round = 1;

	public String next() {
		return String.format("%d", round++);
	}

}
