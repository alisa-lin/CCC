import java.util.*;

public class S22016 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//reading input
		int question = sc.nextInt();
		sc.nextLine();
		int N = sc.nextInt();
		sc.nextLine();
		int Dmojistan[] = new int[N];
		int Pegland[] = new int[N];

		for (int i = 0; i < N; i++) {
			Dmojistan[i] = sc.nextInt();
		}
		sc.nextLine();
		for (int i = 0; i < N; i++) {
			Pegland[i] = sc.nextInt();
		}

		Arrays.sort(Dmojistan);
		Arrays.sort(Pegland);

		//question 1: minimum total speed
		if (question == 1) {
			int minimumTotalSpeed = 0;
			for (int i = 0; i < N; i++) {
				if (Dmojistan[i] < Pegland[i]) {
					minimumTotalSpeed = minimumTotalSpeed + Pegland[i];
				} else {
					minimumTotalSpeed = minimumTotalSpeed + Dmojistan[i];
				}
			}
			System.out.println(minimumTotalSpeed);
		} else if (question == 2) {
			int maximumTotalSpeed = 0;
			for (int i = 0; i < N; i++) {
				if (Dmojistan [i] < Pegland [N-i-1]) {
					maximumTotalSpeed = maximumTotalSpeed + Pegland[N-1-i];
				} else {
					maximumTotalSpeed = maximumTotalSpeed + Dmojistan [i];
				}
			}
			System.out.println(maximumTotalSpeed);
		}

		//question 1: minimum speed
		// if (question == 1) {
		// 	int maxDmoj = 0;
		// 	int maxPeg = 0;

		// 	for (int i = 0; i < N; i++) { //finding maximum speed
		// 		int j = Dmojistan[i];
		// 		if (j > maxDmoj)
		// 			maxDmoj = j;
		// 		int k = Pegland[i];
		// 		if (k > maxPeg)
		// 			maxPeg = k;
		// 	}

		// 	int minDmoj = maxDmoj;
		// 	int minPeg = maxPeg;

		// 	for (int i = 0; i < N; i++) { //finding minimum speed
		// 		int j = Dmojistan[i];
		// 		if (j < maxDmoj)
		// 			minDmoj = j;
		// 		int k = Pegland[i];
		// 		if (k < maxPeg)
		// 			minPeg = k;
		// 	}
		// 	//output
		// 	if (minDmoj < minPeg) {
		// 		System.out.println(minPeg);
		// 	} else {
		// 		System.out.println(minDmoj);
		// 	}
		// } else if (question == 2) { //question 2: maximum speed
		// 	int maxDmoj = 0;
		// 	int maxPeg = 0;

		// 	for (int i = 0; i < N; i++){ //finding maximum speed
		// 		int j = Dmojistan[i];
		// 		if (j > maxDmoj)
		// 			maxDmoj = j;
		// 		int k = Pegland[i];
		// 		if (k > maxPeg)
		// 			maxPeg = k;
		// 	}
		// 	//output
		// 	if (maxPeg > maxDmoj) {
		// 		System.out.println(maxPeg);
		// 	} else {
		// 		System.out.println(maxDmoj);
		// 	}
	}
}

