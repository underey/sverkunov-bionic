package homework1;

public class Runner {

	private static String text = "How are you doing? It was a great match.";
	private static int key = 13;
	
	public static void main(String[] args) {
		String str1 = CaesarCipher.process(text, key, Goal.CRYPT);
		String str2 = CaesarCipher.process(str1, key, Goal.ENCRYPT);
		
		System.out.println(text);
		System.out.println(str1);
		System.out.println(str2);
	}
}
