public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static boolean isPalindrome(String word) {
		word = word.replace(" ", "");
		String[] isPalindrome = word.split("");
		for (int i = 0; i < isPalindrome.length; i++) {
			if (!isPalindrome[i].equalsIgnoreCase(isPalindrome[isPalindrome.length - 1 - i])) {
			return false;
		}
		}
		return true;
	}
}
	


