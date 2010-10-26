import java.util.ArrayList;
import java.util.List;


public class Romans {

	public static int toArabic(String string) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i=0 ; i<string.length() ; i++) {
			int d = translateDigit(string.charAt(i));
			list.add(d);
		}
		
		
		int n=0;
		for (int i=0 ; i<list.size() ; i++) {
			int d = list.get(i);
			if (i+1 < list.size() && d < list.get(i+1)) {
				d *= -1;
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
		return d;
	}

}
