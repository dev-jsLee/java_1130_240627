package day04;

import java.util.Scanner;

public class MethodTask {

	public static void main(String[] args) {
		// public
		// 접근 제어자 -> 클래스 넘어가서 다시
		// 1. private -> 같은 클래스 내에서만 -> 같은 파일내
		// 2. default -> 같은 패키지 내에서만
		// 3. protected->같은 패키지 내 관련이 있는 클래스 내에서
		// 4. public  -> 제한 없음
		
		// static
		// 독립적으로 공간을 할당받는 우선순위 예약어 -> 클래스
		
		// void
		// return 하는 값의 타입을 정해놓아야 한다.
		
		// 메서드의 구성
		// [접근제어자] [static 여부] [반환값의 타입] [메서드명](제공할 값){}
		
		
		// 메서드란
		// 어떤 기능을 하는 부품을 따로 만들어두어
		// 다른 상황에서도 동일하게 동작하는
		// 코드를 만들어둔 것
		
		// 쓰는 이유
		// 재사용성
		int num1 = 11;
//		System.out.println(num1);
//		System.out.println(num1);
		System.out.println("================");
		// 메서드의 사용 -> 함수(function)
		// function, fn, func -> 함수구나!
		System.out.println(sum(3, 5));
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		printStr(sc.next());
		
//		boolean f = (boolean)1;
	}
	
	public static void printStr(String content) {
		System.out.println("입력받은 값은 : " + content);
		return; // 옵션-> 적어도 안 적어도 된다.
	}
	
	public static int sum(int num1, int num2) { // 파라미터(parameter)
		int result = 0;
		result = num1 + num2;
		return result;
	}

}
