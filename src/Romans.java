
public class Romans {

	public static int toArabic(String string) {
		
		int d = translateDigit(string);
		
		return d;
	}

	private static int translateDigit(String string) {
		int d = -1;
		
		if (string.equals("I"))
			d = 1;
		if (string.equals("V"))
			d = 5;
		if (string.equals("X"))
			d = 10;
		if (string.equals("L"))
			d = 50;
		return d;
	}

}
