import junit.framework.Assert;

import org.junit.Test;


public class RomanToArabicTest {
	
	@Test
	public void shouldTranslateI() {
		Assert.assertEquals(1, Romans.toArabic("I"));
	}
	
	
}
