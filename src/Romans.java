
public class Romans {

	public static int toArabic(String string) {
		int n=0;
		for (int i=0 ; i<string.length() ; i++) {
			n += translateDigit(string.charAt(i));
		}
		return n;
	}

	private static int translateDigit(char digit) {
		int d = -1;
		if (digit == 'I')
			d = 1;
		if (digit == 'V')
			d = 5;
		if (digit== 'X')
			d = 10;
		if (digit == 'L')
			d = 50;
		return d;
	}

}
