package testCalcul;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import calcul.Calcul;

public class TestCalcul {

	@Test
	public void TestCalculer() {

		assertEquals(2, Calcul.calculAdd(1, 1));
		assertEquals(2, Calcul.calculAdd(1, 2));

	}

}
