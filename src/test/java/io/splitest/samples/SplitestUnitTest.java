package io.splitest.samples;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.modules.junit4.rule.PowerMockRule;

import io.splitest.category.UnitTest;

@Category(UnitTest.class)
@PowerMockIgnore({ "org.mockito.*" })
public class SplitestUnitTest {
	
	@Rule
	public PowerMockRule rule = new PowerMockRule();

	@Test
	public void unitTest() {
		
		assertEquals(true, true);
	}

}
