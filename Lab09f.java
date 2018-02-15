package unit6;

public class Lab09f {
	public static void main (String[] args) {
		LetterRemover a = new LetterRemover("I am Sam I am", 'a');
		System.out.println(a.toString());
		System.out.println(a.removeLetters());
	}
}
