import java.util.*;

public class S12017 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int daysInSeason = sc.nextInt();
		sc.nextLine();
		int swifts[] = new int[daysInSeason];
		int semaphores[] = new int[daysInSeason];

		for (int i = 0; i < daysInSeason; i++) {
			swifts[i] = sc.nextInt();
		}

		sc.nextLine();

		for (int i = 0; i < daysInSeason; i++) {
			semaphores[i] = sc.nextInt();
		}

		int day = 0;
		int swiftsSum = 0;
		int semaphoresSum = 0;

		for (int i = 0; i < daysInSeason; i++) {
			swiftsSum = swiftsSum + swifts[i];
			semaphoresSum = semaphoresSum + semaphores[i];

			if (swiftsSum == semaphoresSum) {
				day = i + 1;
			}
		}

		System.out.println(day);
	}
}
