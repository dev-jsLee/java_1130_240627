package day03;

import java.util.Scanner;

public class TaskScore {

	public static void main(String[] args) {
		// 입력을 받기 위한 스캐너 선언/호출
		Scanner sc = new Scanner(System.in);
		
		// 현재 확인하고 있는 기준 점수
		int tempScore = 90;
		
		// 입력 안내 메시지
		System.out.print("점수 입력: ");
		
		// 점수 입력
		int inputScore = sc.nextInt();
		
		// 학점을 담을 변수 선언
		String strScore = "";
		
		for (
				int i = 0;	// A->D 이동할 때 쓰일 인덱스 값
				i < 'F'-'A';// char값인 F에서 char값인 A 사이의 거리만큼 반복
				i++) {		// 증감식
			if(inputScore >= tempScore) { // 입력값이 기준점수보다 높으면 진입
				strScore += (char)('A' + i); // char값은 int값과 1:1 대응된다.
				// 첫번째 반복때는 A,
				// 두번째 반복 때는 A에 1이 더해진 B
				break; // 현재 학점이 입력되었으므로 for문 탈출
			}
			tempScore -= 10; // 기준 점수 간격 10점
		}
		// 최종학점 안내 메시지 출력
		System.out.printf("당신의 학점은 %s입니다.", strScore);
	}

}
