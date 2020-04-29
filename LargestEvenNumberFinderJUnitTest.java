/*
 * The following program tests the LargestEvenNumberFinder class using JUnit
 * 
 * @Author: Joan Hickey
 * @Version: 29th April 2020
 */

import org.junit.Assert;
import org.junit.Test;

public class LargestEvenNumberFinderJUnitTest {

	@Test 
	public void findsLargestEvenNumber() {
		int y[] = {2,6,7,9,10,11,4,3,7};
		LargestEvenNumberFinder finder1 = new LargestEvenNumberFinder (y);
		int largest1 = finder1.getLargestEvenNumber();
		
		Assert.assertEquals(10, largest1);
	}
}
