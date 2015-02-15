package testhomework3;

import homework3.RealNumber;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RealNumberTest {

	@Test
	public void checkRealNumber() {
		double value = 8;
		boolean expected = true;
 
		RealNumber rn = new RealNumber();
		boolean actual = rn.checkReal(value);

		Assert.assertEquals(actual, expected);
	}
}
