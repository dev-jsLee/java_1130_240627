package day02;

public class VariableTest1 {
	public static void main(String[] args) {
		int num1; // 선언
		int num2 = 10; // 선언과 초기화
		
		num1 = num2 + 2;
		// num1은 저장공간
		// num2는 변수 값의 사용
		
//		int num1;
//		int sutja;
//		float floatNum1 = 3.3f;
//		long longNum = 1000L;
//		==============================
		// 자동 형변환
		// 작은 자료형에서 더 범위가 큰 자료형으로 ★대입할 때
		// 자동으로 큰 자료형으로 형변환된다.
		float floatNum1 = 100f;
		double doubleNum2 = floatNum1; // 자동형변환
		
		float floatNum3 = (float)doubleNum2;
		
		// 큰타입->작은타입 형변환 시 오류가 나는 이유
		// 1. 데이터의 손실 위험이 있다.
		// 2. 오버플로우의 위험이 있다.
		int intNum = 128;
		byte byteNum = (byte)intNum;
		System.out.println(byteNum);
		
//		int itIsNotInt = (int)"13";
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
