import java.util.ArrayList;
import java.util.List;


public class Romans {

	public static int toArabic(String string) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		int previous = 0;
		int n=0;
		
		for (int i=0 ; i<string.length() ; i++) {
			int d = translateDigit(string.charAt(i));
			if (i>0) {
				if (list.get(i-1) < d ) {
					n -= 2*list.get(i-1);
				}
				previous = list.get(i-1);
			}
			n += d;
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
		if (digit == 'C')
			d = 100;
		return d;
	}

}
