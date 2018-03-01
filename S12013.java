import java.util.*;

public class S12013 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int input = sc.nextInt() + 1;

		boolean distinct = false;
		while (distinct == false) {
			String original = input + "";
			char year[] = original.toCharArray();
        	boolean unknown = true;
				if (year.length > 1) {
					for (int i = 0; i < year.length && unknown == true; i++) {
						for (int j = 0; j < year.length && unknown == true; j++) {
							if (year[i] == year[j] && i != j) {
								unknown = false;
							}
						}
                  if (i == year.length - 1 && unknown == true)
                     distinct = true;
					}
				} else {
					distinct = true;
				}

			if (distinct == false)
				input = input + 1;
		}

		System.out.println(input);
	}
}