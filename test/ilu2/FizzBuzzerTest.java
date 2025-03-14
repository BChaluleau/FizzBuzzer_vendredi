package ilu2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FizzBuzzerTest {

	FizzBuzzer game;

	@BeforeEach
	void setUp() throws Exception {
		game = new FizzBuzzer();
	}

	@Test
	void testDebutPartie() {
		assertEquals("1", game.next());

	}

}
