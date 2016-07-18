package io.splitest.samples;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import io.splitest.category.FunctionalTest;

@Category(FunctionalTest.class)
public class SplitestFunctionalTest {

	@Test
	public void functionalTest() {
		assertEquals(true, true);
	}

    @Test
    public void failFunctionalTest() {
        assertEquals(true, false);
    }
}
