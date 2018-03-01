import java.util.*;

public class S12016 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String wordOne = sc.nextLine();
		String wordTwo = sc.nextLine();

		char firstWord[] = wordOne.toCharArray();
		Arrays.sort(firstWord);

		char anagram[] = wordTwo.toCharArray();
		Arrays.sort(anagram);

		boolean solved = false;
		for (int i = 0; i < firstWord.length && solved == false; i++) {
			if (firstWord[i] != anagram[i]) {
				if (anagram[i] != '*') {
					System.out.println("N");
					solved = true;
					// break;
				}
			} else if (i == firstWord.length - 1) {
				System.out.println("A");
			}
		}

	}
}
