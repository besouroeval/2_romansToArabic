
public class Romans {

	public static int toArabic(String string) {
		
		int n=0;
		
		for (int i=0 ; i<string.length() ; i++) 
			n += translateDigit(string.charAt(i));
		
		return n;
	}

	private static int translateDigit(char string) {
		int d = -1;
		
		if (string == 'I')
			d = 1;
		if (string == 'V')
			d = 5;
		if (string== 'X')
			d = 10;
		if (string == 'L')
			d = 50;
		return d;
	}

}
