package com.task;

import java.util.Scanner;

public class TaskIf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력: ");
		int inputNum1 = sc.nextInt();
		
		boolean isPositive = inputNum1 > 0;
//		boolean isPositive = inputNum1 > 0 ? true : false;
		
//		if(isPositive) {
		if(isPositive) {
			System.out.println("양수");
		} else if(inputNum1 == 0) { // 값이 0인 경우
			System.out.println("0");
		} else { // 양수도 0도 아닌 경우
			System.out.println("음수");
		}
		
		
		
		
	}

}
