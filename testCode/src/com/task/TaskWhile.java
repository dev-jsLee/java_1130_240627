package com.task;

import java.util.Scanner;

public class TaskWhile {

	public static void main(String[] args) {
		// while문은 반복횟수를 모를 때 사용한다
		// -> 언제 끝날지 모른다 -> 조건식에 따라 종료한다
		Scanner sc = new Scanner(System.in);

		int i = 0;
		while (i < 10) {
			System.out.print(i + ", ");
			i++;
		}
		
		boolean flag = false;
		while (true) {
			System.out.print("\n숫자 입력 : ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("choice 1");
				break;
			case 2:
				System.out.println("choice 2");
				break;
			case 0:
				flag = true;
				break;
			}
//			if(flag) {
			if(flag == true) {
				System.out.println("프로그램 종료");
				break;
			}

		}

	}

}
