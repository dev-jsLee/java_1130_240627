package day03;

public class PlusMinusOperator {

	public static void main(String[] args) {
		// 증감 연산자
		// 정수 값을 1씩 증가/감소 시키는 단항 연산자
		int num1 = 1;
		
//		num1 = num1 +1;
//		num1 += 1;
//		num1++; // 후위 연산자
		// 사용 후 연산 
		// 2
		System.out.println(num1++); // 사용시 1, 연산 후 2
		num1 = num1 + 1;
		
		System.out.println(num1);	// 2
		
		// =======================================
//		++num1; // 전위 연산자
		// 연산 후 사용
		System.out.println(++num1); // 연산 시 3 사용도 3
		
		
		
		
		
	}

}
