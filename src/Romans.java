
public class Romans {

	public static int toArabic(String string) {
		
		int n=0;
		
		for (int i=0 ; i<string.length() ; i++) 
			n += translateDigit(string.charAt(i));
		
		return n;
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
