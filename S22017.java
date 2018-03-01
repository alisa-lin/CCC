import java.util.*;

public class S22017 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.nextLine();
		int measurements[] = new int[number];

		for (int i = 0; i < number; i++) {
			measurements[i] = sc.nextInt();
		}

		Arrays.sort(measurements);

		int sorted[] = new int[number];

		for (int h = 0; h < number; h++) {

			if (number % 2 == 0) {
				if (h % 2 == 0) {
					int i = number / 2 - 1 - h / 2;
						sorted[h] = measurements[i];
				} else if (h % 2 == 1) {
					int j = number / 2 - (1 - h)/2;
						sorted [h] = measurements[j];
				} 
			} else {
				if (h % 2 == 0) {
					int i = (number + 1) / 2 - 1 - h / 2;
						sorted[h] = measurements[i];
				} else if (h % 2 == 1) {
					int j = (number + 1) / 2 - (1 - h)/2;
						sorted [h] = measurements[j];
				} 
			}
		}

		for (int i = 0; i < number; i++) {
			System.out.print(sorted[i] + " ");
		}

		System.out.println();
	}
}