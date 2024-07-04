package day03;

import java.util.Scanner;

public class Task240701 {

	public static void main(String[] args) {
		// 입력한 점수에 따라 학점을 출력하는 프로그램
		// 90 ~ 100 -> A
		// 80 ~ 89 -> B
		// 70 ~ 79 -> C
		// 60 ~ 69 -> D
		
		// 1. Scanner 선언
		Scanner sc = new Scanner(System.in);
		
		// 2. nextInt()로 값을 받아서 변수에 저장
		// 점수
		// 항상 제대로 입력한다고 가정한다
		System.out.print("점수 입력: ");
		int score = sc.nextInt();
		
		// 3. if문에 넣어서 검사
//		if(score >= 90) {
//			// 4. 검사 결과에 따라 학점 출력
//			System.out.println("당신의 학점은 A입니다.");
//		} else if(score >= 80) { // B
//			System.out.println("당신의 학점은 B입니다.");
//		} else if(score >= 70) { // C
//			System.out.println("당신의 학점은 C입니다.");
//		} else if(score >= 60) { // D
//			System.out.println("당신의 학점은 D입니다.");
//		}
		// 좀더 유지보수에 좋은 코드로 바꾼다
		// -> 리팩토링(refactoring)
		String scoreStr = "";
		
		if(score >= 90 && score <= 100) {
			scoreStr = "A";
		} else if(score >= 80) { // B
			scoreStr = "B";
		} else if(score >= 70) { // C
			scoreStr = "C";
		} else if(score >= 60) { // D
			scoreStr = "D";
		} else { // 60점 미만인 경우
			scoreStr = "F";
		}
		
		// 출력문 형태 잡기
		System.out.printf("당신의 학점은 %s입니다", scoreStr);
		System.out.println("====================");
		
		
		// 1부터 100까지의 수를 모두 더한 값을 출력하는 프로그램
		// for문
		int result = 0; // 모두 더한 값을 담을 변수 초기화
		
		for (int i = 0; i < 100; i++) {
			System.out.println(i + "번째 반복, 현재 총합: " + result);
			// 매 반복마다 i+1을 기존의 합계에 더한다
			result += i+1;
		}
		System.out.println("합계: " + result);
		
		
		
		

	}

}
