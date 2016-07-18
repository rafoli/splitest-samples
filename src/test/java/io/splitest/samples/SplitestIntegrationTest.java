package io.splitest.samples;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import io.splitest.category.IntegrationTest;

@Category(IntegrationTest.class)
public class SplitestIntegrationTest {
	
	@Test
	public void integrationTest() {
		assertEquals(true, true);
	}

}
