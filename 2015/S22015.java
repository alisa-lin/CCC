import java.util.*;

public class S22015 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int J = sc.nextInt();
		int A = sc.nextInt();
		String sizesAvailable[] = new String[J];
		int jerseyNumber[] = new int[A];
		String sizesDesired[] = new String[A];

		for (int i = 0; i < J; i++) {
			sizesAvailable[i] = sc.next();
		}

		for (int i = 0; i < A; i++) {
			sc.nextLine();
			sizesDesired[i] = sc.next().charAt(0) + "";
			jerseyNumber[i] = sc.nextInt();
		}

		int requestsSatisfied = 0; 
		for (int i = 0; i < A; i++) { //those who want size L
			if (sizesDesired[i] .equals("L")) {
				if (sizesAvailable[jerseyNumber[i]-1] .equals("L")) {
					requestsSatisfied = requestsSatisfied + 1;
					sizesAvailable[jerseyNumber[i]-1] = "N";
				}
			} 
		}
		for (int i = 0; i < A; i++) { //those who want size M
			if (sizesDesired[i] .equals("M")) {
				if (sizesAvailable[jerseyNumber[i]-1] .equals("M")) {
					requestsSatisfied = requestsSatisfied + 1;
					sizesAvailable[jerseyNumber[i]-1] = "N";
				} else if (sizesAvailable[jerseyNumber[i]-1] .equals("L")) {
					requestsSatisfied = requestsSatisfied + 1;
					sizesAvailable[jerseyNumber[i]-1] = "N";
				}
			}
		}
		for (int i = 0; i < A; i++) { //those who want size S
			if (sizesDesired[i] .equals("S")) {
				if (sizesAvailable[jerseyNumber[i]-1] .equals("S")) {
					requestsSatisfied = requestsSatisfied + 1;
					sizesAvailable[jerseyNumber[i]-1] = "N";
				} else if (sizesAvailable[jerseyNumber[i]-1] .equals("M")) {
					requestsSatisfied = requestsSatisfied + 1;
					sizesAvailable[jerseyNumber[i]-1] = "N";
				} else if (sizesAvailable[jerseyNumber[i]-1] .equals("L")) {
					requestsSatisfied = requestsSatisfied + 1;
					sizesAvailable[jerseyNumber[i]-1] = "N";
				}
			}
		}

		System.out.println(requestsSatisfied);
	}
}
