import java.util.ArrayList;
import java.util.List;


public class Romans {

	public static int toArabic(String string) {
		
		int n=0;
		int previous = 0;
		
		for (int i=1 ; i<string.length() ; i++) {
			int d = translateDigit(string.charAt(i));
			
				if (previous < d ) {
					n -= previous;
				} else {
					n += previous;
					
				}
				
			previous = d;
		}
		
		n += previous;
		
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
		if (digit == 'C')
			d = 100;
		return d;
	}

}
