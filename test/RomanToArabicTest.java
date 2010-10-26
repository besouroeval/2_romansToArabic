import junit.framework.Assert;

import org.junit.Test;


public class RomanToArabicTest {
	
	@Test
	public void shouldTranslateI() {
		Assert.assertEquals(1, Romans.toArabic("I"));
	}
	
	@Test
	public void shouldTranslateV() {
		Assert.assertEquals(5, Romans.toArabic("V"));
	}
	
	
}
