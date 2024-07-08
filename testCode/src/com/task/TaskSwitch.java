package com.task;

import java.util.Scanner;

public class TaskSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력: ");
		int inputNum1 = sc.nextInt();
		
		switch(inputNum1) { // 검사할 변수
			case 1: // 검사한 값이 상수값과 같은 경우
				// 해당 위치에서부터 코드를 실행한다
				System.out.println(inputNum1 + " is 1");
			case 2:
				System.out.println(inputNum1 + " is 1 or 2");
			case 3:
				System.out.println(inputNum1 + " is numuric.");
				break; // break를 하기 전까지 위에서 아래로 흘러내린다
			default:
				System.out.println(inputNum1 + " is not 1 or 2 or 3");
		}
		
		
		
		

	}

}
