package solution.codingDojang;

import java.util.Random;
import java.util.Scanner;

public class Solution711upDown {

	public static void main(String[] args) {
		/*
		 * 컴퓨터가 1~100 숫자(정수 범위) 중 하나를 랜덤으로 정합니다. (이를 알려주지 않습니다.)사용자는 이 숫자를 맞추어야 합니다. 입력한
		 * 숫자보다 정답이 크면 → "UP" 출력, 입력한 숫자보다 정답이 작으면 → "DOWN" 출력. 정답을 맞히면 → "정답"을 출력하고,
		 * 지금까지 숫자를 입력한 횟수를 알려줍니다. 코딩 초보자라도 if 함수와 while함수, 랜덤 모듈 정도까지만 배워도 재미있게 풀 수 있는
		 * 문제입니다.
		 * 
		 * (예시) 컴퓨터가 1~100 중 랜덤 숫자 하나를 정합니다. 이 숫자를 맞춰주세요. 입력:50 DOWN 입력:25 UP 입력:38 DOWN
		 * 입력:32 UP 입력:35 UP 입력:37 DOWN 입력:36 정답입니다! 7회 만에 맞혔어요.
		 */
		// 랜덤 함수
		Random r = new Random();
		// 입력 함수
		Scanner sc = new Scanner(System.in);

		// 랜덤값 담을 변수
		int target = 0;
		// 사용자 입력값을 담을 변수
		int input = 0;
		boolean flag = false;
		final int RIGHT = 0; final int DOWN = 1; final int UP = 2;
		String[] notices = { "정답", "down", "up" };
		int solutionTimes = 0;

		// 종료 전까지 게임 지속
		while (true) {
			if (flag) {
				System.out.println("게임을 종료합니다.");
				break;
			}
			// nextInt(100)은 0~99로 설정되므로 1을 추가
			target = r.nextInt(100) + 1;
			int times = 0; // 답변 시도 횟수
			System.out.printf("======%d번째 문제(게임종료 exit)======\n", ++solutionTimes);
			// 문제를 몇 번만에 맞힐지 모르므로 while문 사용
			while (true) {
				System.out.printf("%d번째 시도\n", ++times);
				// 사용자 입력
				System.out.print("입력 : ");
				input = sc.nextInt();
				if (input < 0) {
					flag = true;
					break;
				}
				int rightNum = input < target ? UP : input > target ? DOWN : RIGHT;
				System.out.println(rightNum == RIGHT ? notices[rightNum] + "입니다! " + times + "번 만에 맞혔습니다!" : notices[rightNum]);
				if (rightNum == RIGHT) {
					break;
				}
				
			}
		}
	}
}
