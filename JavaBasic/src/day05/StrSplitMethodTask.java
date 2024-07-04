package day05;

import java.util.Scanner;

public class StrSplitMethodTask {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력: ");
		String inputText = sc.nextLine();
		
		System.out.println();
		int[] result = makeArray(inputText);
		for (int num : result) {
			System.out.print(num + ", ");
		}
		
		
		
		
	}
	
	// "1 3 5 2 -1" -> 공백을 기준으로 구분하여 int값으로 변환해서
	// int[]에 담는 메서드를 구현하고 한다.
	public static int[] makeArray(String strNumsSplitSpace) {
		int[] result; // 현재 배열의 길이가 얼마나 될지 모르기 때문에
		// 선언만 해놓는다.
		int arrLength = 0; // 입력받은 숫자의 개수를 담을 변수 초기화
		String[] arrStrNums = strNumsSplitSpace.split(" ");
		// String 클래스의 split 메서드를 사용하여 구분자를 기준으로
		// 분할된 String 배열을 반환한다.
		
		arrLength = arrStrNums.length;
		// 배열의 .length는 배열의 길이(크기) 값을 정수 형태로 반환한다.
		
		// 이제 반환할 배열의 길이를 알아냈으므로 반환용 배열을 초기화한다.
		result = new int[arrLength];
		
		// for문을 이용해 반복하고
		for (int i = 0; i < arrStrNums.length; i++) {
			// 문자열 배열의 값을 숫자형으로 바꿔주는 메서드를 통해
			// String -> int
			int tempNum = Integer.parseInt(arrStrNums[i]);
			
			// 반환용 배열에 차곡차곡 담는다.
			result[i] = tempNum;
			
		}
		
		// 반환용 배열을 반환해준다.
		return result;
	}
	
}
