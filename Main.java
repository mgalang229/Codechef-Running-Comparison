import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = 1;
		T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int n = fs.nextInt();
			int[] alice = new int[n], bob = new int[n];
			for (int i = 0; i < n; i++) {
				alice[i] = fs.nextInt();
			}
			for (int i = 0; i < n; i++) {
				bob[i] = fs.nextInt();
			}
			int count = 0;
			for (int i = 0; i < n; i++) {
				boolean aHappy = true, bHappy = true;
				if (bob[i] > alice[i] * 2) {
					aHappy = false;
				}
				if (alice[i] > bob[i] * 2) {
					bHappy = false;
				}
				if (aHappy && bHappy) {
					count++;
				}
			}
			System.out.println(count);
		}
		fs.close();
	}
}
