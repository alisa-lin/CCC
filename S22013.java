import java.util.*;

public class S22013 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int capacity = sc.nextInt();
		int N = sc.nextInt();

		int weight[] = new int[N];

		for (int i = 0; i < N; i++) {
			weight[i] = sc.nextInt();
		}

		int cars = 0;
		int totalWeight = 0;
		boolean overCapacity = false;

		for (int i = 0; i < N && overCapacity == false; i++) {
			if (cars < 4) {
				if (weight[i] + totalWeight <= capacity) {
					totalWeight = totalWeight + weight[i];
					cars = cars + 1;
				} else {
					overCapacity = true;
				}
			} else {
				totalWeight = totalWeight - weight[i-4];
				if (weight[i] + totalWeight <= capacity) {
					totalWeight = totalWeight + weight[i];
					cars = cars + 1;
				} else {
					overCapacity = true;
				}
			}
		}

		System.out.println(cars);
	}
}