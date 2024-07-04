package day04;

import java.util.Scanner;

public class WileTask {

	public static void main(String[] args) {
		// while문
		// 반복 횟수가 정확히 얼마인지 모를 때 사용하는 반복문
		// 컴퓨터 or 개발자
		// ex) 키오스크
		Scanner sc = new Scanner(System.in);
		int choice = 0;

		while (true) {/* 조건식 */
			System.out.print("선택 입력(1, 2, 3): ");
			choice = sc.nextInt();
			// switch/break
			// 반복문 탈출하는 용도의 키워드(예약어)

			if (choice == 3) {/* 탈출 조건문 */
				System.out.println("프로그램 종료");
				break; // 실행하는 순간, 반복문 탈출 -> while문 종료
//				System.out.println("break 이후");
			} else if(choice == 2){
				// 다음 반복으로 이동하는 예약어
				continue; // 실행하는 순간, 다음 반복 실행
//				System.out.println("continue 이후");
			} else {
				System.out.println("진행합니다");
			}
		} // while문 종료
		
		// do/while문
		do {// 조건문과 관계없이 첫 반복에는 실행되는 코드 블록
			
		} while (true); // 두번째 반복부터는 조건문 검사 실행
	}

}
