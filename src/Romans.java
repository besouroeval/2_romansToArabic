
public class Romans {

	public static int toArabic(String string) {
		if (string.equals("I"))
			return 1;
		if (string.equals("V"))
			return 5;
		if (string.equals("X"))
			return 10;
		if (string.equals("L"))
			return 50;
		return -1;
	}

}
