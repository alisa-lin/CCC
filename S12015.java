import java.util.*;

public class S12015 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int sum = 0;
		int previousNumbers[] = new int[K];

		for (int i = 0; i < K; i++) { 
			sc.nextLine();
			int input = sc.nextInt();
			if (input != 0) {
				previousNumbers[i] = input;
				sum = sum + input;
			} else if (input == 0) {
				previousNumbers[i] = 0;
				for (int j = 1; j <= i; j++) {
					if (previousNumbers[i-j] != 0) {
						sum = sum - previousNumbers[i-j];
						previousNumbers[i-j] = 0;
						break;
					} else {
						continue;
					}
				}
			}
		}

		System.out.println(sum);
		
	}
}