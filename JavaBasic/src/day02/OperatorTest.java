package day02;

public class OperatorTest {

	public static void main(String[] args) {
		// +, -, *, /, %
		int num1 = 10;
		int num2 = num1 + 1;
		System.out.println(num2); // 11
		System.out.println(num2 - num1);// 1
		System.out.println(num1 * num2);// 110
		System.out.println(1 / 10); // 1/10 => 0
		// 정수:정수 연산 시, 결과는 정수로 나온다.
		System.out.println(10 % 3); // 1?
		System.out.println("==============");
//		System.out.println(1.0 / 10);	// 0.1
//		System.out.println((float)1 / 10);	// 0.1
		System.out.println((float) (1 / 10)); // 0.0
		// 실수:정수 연산 시, 더 큰 범위인 실수로 나온다.

		// 결론
		// 같은 실수끼리 혹은 정수끼리 연산했을 시, 결과값은 그 타입 그대로 나온다.
		// 실수와 정수 연산 시, 실수로 나온다.

		// ===============================
		System.out.println("========관계 연산자=========");
		// 관계 연산자
		// 관계 연산자는 그 결과가 항상 true 혹은 false로 나온다.
		// == 같다
		System.out.println(1 == 1); // true
		System.out.println(2 == 1); // false

		// != 같지 않다
		System.out.println(2 != 1); // true
		System.out.println(1 != 1); // false

		// >< 초과, 미만(포함x)
		System.out.println(2 > 1); // true
		System.out.println(1 > 1); // false

		// >= <= 이상, 이하(포함)
		System.out.println(2 >= 2);// true
		System.out.println(3 <= 2);// false
		
		// ===============================
		System.out.println("============논리 연산자============");
		// AND 연산자
		// 두 값이 모두 true일 때 true를 반환한다.
		// 하나라도 false라면 false를 반환한다.
		System.out.println(1 != 2 & 1 != 1);
						//   true &   false
		// => false
		System.out.println(1 == 2 & 1 == 2);
		//   				false &   false
		// => false
		
		// OR 연산자
		// 두 값 중 단 하나라도 true일 때 true를 반환한다.
		// true | true	=> true
		// true | false	=> true 
		// false| false	=> false
		
		// XOR 연산자
		// 두 값이 반대일 경우 true
		// true ^ true	=> false
		// true ^ false	=> true 
		// false^ false	=> false
		
		// 부정 연산자
		// 조건식 앞에 !를 붙여 해당 값을 반전시킨다.
		// !true => false
		
		// 삼항 연산자
		// ? :
		// 조건식 ? [참일 경우 반환할 값] : [거짓일 경우 반환할 값]
		
		System.out.println(true ? true : false);
		
		
		
		
		
		
		
	}

}
