package day03;

import java.util.Scanner;

public class ControlFlowStatement {

	public static void main(String[] args) {
		// (흐름) 제어문
		// 기본적으로 모든 코드는 위에서 아래로 흐르지만
		// 필요에 따라 이 흐름을 바꿔야 할 때가 있다.
		// 그럴 때 사용하는 문법이 제어문이다.
		/* 1. 조건문
		 * 1-1. if문
		 * 1-2. switch/case문
		 * 2. 반복문
		 * 2-1. while문
		 * 2-2. for문
		 * */
		// 조건문
		// 논리형 값(조건식)에 따라 실행할 코드블록을 선택하여
		// 실행 흐름을 제어하는 제어문이다.
		
		// if문
//		if(true|false) {
		if(1+1 >= 2) {	// true
			// 조건식이 참일 경우 실행할 코드 블록
		}
		
		// if/else문
		if(1+1 >= 2) {
			// 참이라면
		} else {
			// 거짓이라면
		}
		
		// if/else if/else문
		if(1+1 >= 2) { // 첫번째 조건식
			// 첫번째 조건식이 참일 때 실행할 코드블록
		} else if(1+2 >= 2) { // 두번째 조건식
			// (첫번째 조건식이 거짓이고)
			// 두번째 조건식이 참일 때 실행할 코드블록
		} else if(1+2 >= 2) { // 세번째 조건식
		} else if(1+2 >= 2) { // 네번째 조건식
		} else {
			// 위의 모든 조건식이 거짓일 때 실행할 코드블록
		}
		// 탈출
		
		// switch/case 문
		// 위에서 아래로 '흘러내리며' 실행한다.
		Scanner sc = new Scanner(System.in);
		// 자동 임포트 ctrl + shift + o
		System.out.print("입력 : ");
		int var = sc.nextInt();
		
		switch(var) { // 검사할 변수나 값을 넣어준다.
			case 1: // 상수 값을 넣어준다
				// var가 1일 경우 실행을 시작할 위치
				break;
			case 2:
				// var가 2일 경우 실행을 시작할 위치
				break;
			case 3:
				// 3등급만 가지는 혜택
			default:
				// 위 경우가 아닐 경우 실행을 시작할 위치
		}
		// 탈출
		
		// 스코프(scope)
		// 더 넓은 범위에서 선언된 변수는
		// 그 안에 선언된 다른 코드 블록 안에서 사용할 수 있지만
		// 안쪽에서 선언된 변수는 바깥에서 사용할 수 없다.
		
		int num1 = 1;
		// if문 바깥에서 선언된 변수
		if(num1 == 1) {
			int num2 = num1 + 1;
			// if문 안쪽에서 선언된 변수
			num1 = num2 + 1;
			// 바깥에서 선언한 num1은 저장/사용이 자유롭다
		}
//		System.out.println(num2);
		// 안쪽에서 선언된 변수를 바깥에서 사용하면 오류가 난다
		
		for (
				int index = 0;	// 1. 초기실행문
				// 반복의 순번을 추적하기 위한 변수 선언
				
				index < 10;		// 3. 조건식
				// 반복 조건. 증감식 실행 후 조건 검사
				
				index++) {		// 2. 증감식
				// 반복이 끝날 때마다 실행
			
		} // for문 끝
		// 탈출
		
	}

}
