import java.util.*;

public class S22014 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String firstPartner[] = new String[N];
		String secondPartner[] = new String[N];

		for (int i = 0; i < N; i++) {
			firstPartner[i] = sc.next();
		}

		for (int i = 0; i < N; i++) {
			secondPartner[i] = sc.next();
		}

		boolean mismatch = false;
		for (int j = 0; j < N && mismatch == false; j++) {
			for (int i = 0; i < N && mismatch == false; i++) {
				if (firstPartner[i] .equals(secondPartner[j]) && i != j) {
					if (!firstPartner[j] .equals(secondPartner[i])) {
						System.out.println("bad");
						mismatch = true;
					}
				} else if (firstPartner[j] .equals(secondPartner[j])) {
					System.out.println("bad");
					mismatch = true;
				}

			}
			if (j == N - 1 && j != 0) {
				System.out.println("good");
			}
		}
	}
}