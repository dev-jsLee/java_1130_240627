package com.task;

public class PracticeArray {

	public static void main(String[] args) {
		int[] arrInt1 = new int[100];
		
		for (int i = 0; i < arrInt1.length; i++) {
			arrInt1[i] = i; // 0 ~ 99
		}
		
		for (int i : arrInt1) {
			boolean isEven = i % 2 == 0;
			// 숫자i를 2로 나눴을 때 나머지가 0이라면 짝수다
			// '2의 배수인가'를 판별하는 조건식이다
			if(isEven) {
				// i가 짝수인 경우 i값 출력
				System.out.println(i);
			}
		}
		System.out.println("===================");
		// 1부터 100까지의 수 중 2 혹은 3의 배수인 값만 출력하는 프로그램 작성
		// 12시까지 실습문제 풀어보기
		// 3의 배수는 모든 자릿수의 합이 항상 3의 배수
//		for (int i = 0; i < 100; i++) {
//			// 0 ~ 99
//			int tempNum = i + 1;
//			boolean isEven = tempNum % 2 == 0; // 2의 배수 여부
//			boolean isThrees = tempNum % 3 == 0; // 3의 배수 여부
//			
//			if(isEven || isThrees) { // 2의 배수 혹은 3의 배수인 경우
//				System.out.print(tempNum + ", "); // 출력한다
//			}
//		}
		
		// 2의 배수이거나 3의 배수인 경우
		// + 2와 3의 공배수인 경우는 출력하지 않는다
		for (int i = 0; i < 100; i++) {
			// 0 ~ 99
			int tempNum = i + 1;
			boolean isEven = tempNum % 2 == 0; // 2의 배수 여부
			boolean isThrees = tempNum % 3 == 0; // 3의 배수 여부
			
			if(isEven || isThrees) { // 2의 배수 혹은 3의 배수인 경우
				if(isEven & isThrees) { // 2의 배수이면서 3의 배수인 경우
					continue; // 다음 반복으로 넘어간다.
				}
				System.out.println(tempNum); // 출력한다
			}
		}
		
		
		
		
	}

}
