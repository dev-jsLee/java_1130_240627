package day03;

public class BokhabOperator {

	public static void main(String[] args) {
		// 복합 할당 연산자
		// 대입 연산자의 확장으로,
		// 사칙연산(+ - * /)와 나머지 연산자(%)를
		// 대입연산자(=)와 결합한 형태로 쓰인다.
		int num1 = 5;
//		num1 = num1 + 3;
		// -> 짧게 만든 것
		num1 += 3; // 기존 num1 값에 3을 더해 덮어쓰기
		num1 -= 3; // 기존값에 연산
		num1 *= 3; // 기존값에 연산
		num1 /= 3; // 기존값에 연산
		num1 %= 3; // 기존값에 연산
		// =============================
		// 사칙연산 중 더하기 연산자(+)의 특이한 점
		int num2 = 5; 	// 5
		num2 += 2;		// 7
		
		String strVal = "hello";
		// 문자열 타입은 + 연산자 사용시 연결이 된다.
		strVal += ", world"; // 기존 값 뒤에 이어서 값을 붙인다.
		
		System.out.println(strVal); // hello, world
		
		
		
		
		
		
		
		
	}

}
