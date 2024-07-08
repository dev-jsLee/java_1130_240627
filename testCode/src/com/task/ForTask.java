package com.task;

import java.util.Scanner;

public class ForTask {

	public static void main(String[] args) {
		// while문과 다르게 반복할 횟수가 정해지거나
		// 길이가 있는 객체의 요소를 반복할 경우 사용된다.
		int length = 10;

		// 0부터 10-1까지인 9까지 총 10번 반복된다
//		for (int i = 0; i < length; i++) {
		// 1부터 10까지 총 10번 반복된다
//		for (int i = 1; i <= length; i++) {
		// 시작값을 큰 값으로 잡고, 이 값을 감소하는 방향으로 진행되는 코드
		for (int i = length; i > 0; i--) {
			// 시작값이 10, 반복 때마다 1씩 감소
			// 10~1 총 10번
//			System.out.println(i);
		}
		System.out.println("=================");
		Scanner sc = new Scanner(System.in);
		int input = 0;
		
		// for문을 while문처럼 무한반복하되
		// 인덱스 값과 증감식을 사용할 수 있는 기법
		for (int i = 0;;i++) {
			System.out.print("숫자 입력: ");
			input = sc.nextInt();
			if(input==0) {
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println(i+1 + ". " + input);
			}
		}
		
		// length == 10
		// 증감식 부분은 반드시 천장 혹은 바닥을 정해둔 방향으로 똑같이 설정해놔야 한다
		// ->안하면 무한루프
		for (int i = 0; i < length; i+=2) {
			System.out.println(i);
		}
		
		String[] fruits = {"banana", "grape", "apple", "mango"};
		
		// foreach문은 여러값이 들어간 자료형(iterable 객체)의 요소를
		// 순차적으로 하나씩 들고 와서
		// fruit과 같은 변수명에 임시로 담아서
		// for문 안에서 사용하는 방법이다.
		for (String fruit : fruits) {
			System.out.println(fruit);
		}

	}

}
