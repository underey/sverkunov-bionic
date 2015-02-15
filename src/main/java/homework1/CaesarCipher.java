package homework1;

public class CaesarCipher {

	public static String process(String text, int key, Goal type) {
		int maxValue = (int) 'z';
		int minValue = (int) 'A';
		int range = (int) ('z' - 'A'); //take only (A-Za-z) 
		key = key % range; //allow set any positive shift (0, 1, 2 ... )

		char[] textToArray = text.toCharArray();
		int size = textToArray.length;
		char[] resultText = new char[size];

		// for crypt case
		if (type == Goal.CRYPT) {
			for (int i = 0; i < size; i++) {
				int value = (int) textToArray[i];
				int temp = value + key;

				if (value < minValue || value > maxValue) {
					resultText[i] = (char) value;
				} else {
					if (temp > maxValue) {
						temp -= range;
					}
					resultText[i] = (char) temp;
				}
			}
		} else { //for encrypt case
			for (int i = 0; i < size; i++) {
				int value = (int) textToArray[i];
				int temp = value - key;

				if (value < minValue || value > maxValue) {
					resultText[i] = (char) value;
				} else {
					if (temp < minValue) {
						temp += range;
					}
					resultText[i] = (char) temp;
				}
			}
		}

		return new String(resultText);
	}
}