package homework3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RealNumber {

	private Pattern pattern;
	private Matcher matcher;
	private String regex = "[+-]?(?:\\d+\\.?\\d*|\\d*\\.\\d+)";

	public boolean checkReal(double number) {
		pattern = Pattern.compile(regex);
		matcher = pattern .matcher(Double.toString(number));
		return matcher.matches();
	}
}
