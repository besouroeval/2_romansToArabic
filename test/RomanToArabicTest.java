import junit.framework.Assert;

import org.junit.Test;


public class RomanToArabicTest {
	
	@Test
	public void shouldTranslateBareNumbers() {
		Assert.assertEquals(1, Romans.toArabic("I"));
		Assert.assertEquals(5, Romans.toArabic("V"));
		Assert.assertEquals(10, Romans.toArabic("X"));
		Assert.assertEquals(50, Romans.toArabic("L"));
	}
	
	@Test
	public void shouldTranslateSimpleSums() {
		Assert.assertEquals(2, Romans.toArabic("II"));
	}
	
	
	
}
