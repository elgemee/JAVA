package pruebasunitarias;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	
	private final Calculator calculator = new Calculator();
	
	@Test
	void addition () {
		assertEquals(8,calculator.addNumbers(5, 3));	}

	@Test
	void substraction () {
		assertEquals(8,calculator.subtractNumbers(20, 12));
	}
	@Test
	void addition2 () {
		assertEquals(8,calculator.divideNumbers(64, 8));
		
	}
	@Test
	void addition3 () {
		assertEquals(8,calculator.multiplyNumbers(4, 2));
		
	}
	
}
