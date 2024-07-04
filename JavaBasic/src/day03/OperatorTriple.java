package day03;

import java.util.Scanner;

public class OperatorTriple {

	public static void main(String[] args) {
		// 입력을 받기 위한 스캐너 선언
		Scanner sc = new Scanner(System.in);
		// 자동 임포트 단축키
		// ctrl + shift + o
		
//		boolean isTrue = 1 > 0 ? true : false;
		
		// 입력을 위한 안내문
		System.out.print("입력: ");
		String inputStr = sc.nextLine();
		
		// 기억해주세요
		// 값을 비교할 때, 두 값의 타입이 클래스라면(String)
		// ==이 아니라 .equals() 메서드를 사용해야 한다.
		String result = ("hello".equals(inputStr)) ? "같다" : "다르다";
		System.out.println(result);
		

	}

}
