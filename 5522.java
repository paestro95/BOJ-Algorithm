import java.util.Scanner;

/* JOI군은 카드 게임을 하고 있다. 이 카드 게임은 5회의 게임으로 진행되며, 그 총점으로 승부를 하는 게임이다.
JOI군의 각 게임의 득점을 나타내는 정수가 주어졌을 때, JOI군의 총점을 구하는 프로그램을 작성하라. */

public class Main {
	public static void main(String[] args) {
		int sum = 0;
		Scanner inputs = new Scanner(System.in);
		int[] gameScore = new int[5];

		for (int i = 0; i < 5; i++) {
			gameScore[i] = inputs.nextInt();
			sum += gameScore[i];
		}

		System.out.println(sum);
	}
}
