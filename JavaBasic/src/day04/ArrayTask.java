package day04;

public class ArrayTask {

	public static void main(String[] args) {
		// 배열
		// 같은 타입의 변수로 이루어진 값의 나열
		// 순서가 있다
		
		// 선언 방식
		// 자료형[] 변수명 = new 자료형[]{값1, 값2, 값3};
		// 요소(element)의 개수, 배열의 크기 변하지 않는다.
		int[] arrInt1 = new int[] {1, 2, 3};
		// 직접 값을 설정하는 경우
		// 요소를 직접 넣음으로써 길이가 정해진다.
		
		// 자료형[] 변수명 = new 자료형[길이];
		int[] arrInt2 = new int[3];
		// 요소는 당장은 알 수 없지만 길이(크기)를 미리 정해놓는 경우
		// 길이를 정해놓고 값은 나중에 넣는다
		
		// 자료형[] 변수명 = {값1, 값2, 값3};
		int[] arrInt3;
//		arrInt3 = {1, 3, 4}; // 사용시 주의
		// 선언 후 따로 초기화를 할 때는 사용할 수 없다.
		arrInt3 = new int[] {1, 3, 4};
		// 첫번째 new 자료형[]{값들} 방식을 사용해야 한다.
		// ==========================================
		int[] arrInt4 = new int[3];
		for (int i = 0; i < arrInt4.length; i++) {
			System.out.print(arrInt4[i] + ", ");
		}
		// int[]에 값을 직접 넣지 않은 경우
		// 초기값으로 0이 들어간다
		// 실수형은 0.0
		// 논리형은 false
		// 문자형은 '\u0000'(빈값을 의미)
		// 문자열(String)은 null
		System.out.println("===============");
		
		// arrInts -> 이차원 배열
		int[][] arrInts = {
			//   0, 1, 2 번째 열
				{0, 1, 2}, // 0번째 행
				{1, 2, 3}, // 1번째 행
				{2, 3, 4}
		};
		
		System.out.println(arrInts[0][2]); // 0, 0
		
		
		boolean flag = false; // 중첩 반복문 탈출 방법
		
		firstFor: // 라벨/레이블
		// 반복문에 이름을 부여함으로써 탈출할 반복문을 지정할 수 있다.
		// 전통적인 중첩 반복문 탈출방법
		for (int i = 0; i < arrInts.length; i++) {
			secondFor:
			for (int j = 0; j < arrInts[i].length; j++) {
				// i0, j1
				arrInts[i][j] = i + j;
				if(j == arrInts[i].length - 1) {
					flag = true;
//					break firstFor;
					break;
				}
				System.out.println(i + "행, " + j +"열 : " + arrInts[i][j]);
			}
			// 조건 탈출 후 위치
			if(flag) {
				break;
			}
		}
		// 레이블을 이용한 탈출방법
		// flag변수를 활용한 탈출방법
		
		
		

	}

}
