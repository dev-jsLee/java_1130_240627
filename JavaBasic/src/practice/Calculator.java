package practice;

import java.util.Scanner;

public class Calculator {
	// 계산기
	// 기능?
	// 더하기, 빼기, 곱하기, 나누기

	// 공백으로 구분된 문자열 값을 받아서
	// 연산자에 따라 연산하는 기능
	// 1단계 "31 + 43"
	// 2단계 "- 31 + 43"
	// 3단계 "- 31 - - 43" 고려 안 함
	public int calculate(String expression) {

		// 반환값을 담을 변수 선언
		int result = 0;

		// 구분자 공백을 기준으로 입력받은 문자열을 잘라 배열로 담는다
		String[] splitedStr = expression.split(" ");
		// {"31", "+", "43"}
		// 메인 로직
		String numStrs = ""; // 숫자를 담을 문자열
		String operStrs = ""; // 연산자(문자열)를 담을 문자열
		String[] arrOper; // 연산자를 담을 배열
		String[] arrStrNums; // 문자열 숫자를 담을 배열
		int[] arrNums; // 숫자형 숫자를 담을 배열
		int index = 0; // 계산할 때 사용할 인덱스

		for (int i = 0; i < splitedStr.length; i++) {
			// 확인하고자 하는 요소
			String e = splitedStr[i];

			// 현재 요소가 연산자이면
			if (e.equals("+") || e.equals("-") || e.equals("*") || e.equals("/")) {
				operStrs += e;// 연산자를 문자열에 붙여서 저장해둔다.
				continue; // 다음 반복으로 넘어간다.
			} else {// 연산자가 아니라면 -> 숫자
				// 숫자를 문자열numStrs에 연결시킨다
				// 배열이 아니라 문자열로 연결시키는 이유는
				// 총 길이가 얼마일지 아직 모르기 때문이다
				numStrs += e;

				// 마지막 요소가 아닌 경우에만
				if (i != splitedStr.length - 1) {
					// 구분을 위한 공백을 넣어준다
					numStrs += " ";
				}
				continue;
			}
		}
//		System.out.println("for문 끝남.");
		// operStrs
//		System.out.println(operStrs);	// "+"

		// numStrs
//		System.out.println(numStrs);	// "31 43"

		// 문자열로 이루어진 숫자를 숫자형으로 바꿔주는 작업을 해야 한다
		arrStrNums = numStrs.split(" ");
		// 길이는 기존의 문자열 배열의 길이를 그대로 가져다 쓴다
		arrNums = new int[arrStrNums.length];
		// 연산자를 나눠 담는다
		arrOper = operStrs.split("");
		// 각 문자열 요소를 숫자형으로 바꿔서
		// 숫자형 배열에 담아준다
		for (int i = 0; i < arrStrNums.length; i++) {
			// 문자열 요소를 담을 변수
			String e = arrStrNums[i];

			// 요소를 숫자형으로 바꿔서 같은 순번 위치에 담아준다
			arrNums[i] = Integer.parseInt(e);
		}

		// 숫자와 연산자를 순서에 맞게 연산한다
		index = 0;

		// 첫번째 값은 일단 더한 걸로 취급한다
		// + ?
		if (arrNums.length > arrOper.length) {
			// 숫자의 개수가 연산자보다 많다면
			result = arrNums[index]; // 1단계
			// 그냥 첫번째 값을 넣는다
//		} else {
//			//연산자 개수가 많다면
//			// 연산자를 첫번째 값 앞에 붙이고 숫자형으로 바꿔서
//			// 초기 계산값에 넣는다.
//			result = Integer.parseInt(arrOper[0] + arrNums[0]);
		}
		while (true) {
			// arrOper
			// arrNums
			switch (arrOper[index++]) {
			case "+":
				result = add(result, arrNums[index]);
				break;
			case "-":
				result = sub(result, arrNums[index]);
				break;
			case "*":
				result = multiple(result, arrNums[index]);
				break;
			case "/":
				result = division(result, arrNums[index]);
				break;
			default:
				System.out.println("뭘 입력한 거니?");
				return 0;
			}

			// 계산이 끝나면 반복문을 종료한다
			if (index == arrNums.length - 1) {
				break;
			}
		}

		return result;
	}

	public int add(int num1, int num2) {
		return num1 + num2;
	}

	public int sub(int num1, int num2) {
		return num1 - num2;
	}

	public int multiple(int num1, int num2) {
		return num1 * num2;
	}

	public int division(int num1, int num2) {
		// 나눗셈에서 분모가 0이면 문제가 생긴다
		if (num2 == 0) {
			return 0;
		}
		int result = num1 / num2;
		return result;
	}

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		// 단순계산기
		System.out.println(cal.add(1, 3)); // 4
		System.out.println(cal.sub(10, 3)); // 7
		System.out.println(cal.multiple(7, 5)); // 35
		System.out.println(cal.division(10, 3));// 몫 3
		System.out.println("===============");
		
		// 문자열 계산기
//		System.out.println(cal.calculate());
		
		// 앞에서부터 순서대로만 계산
		Scanner sc = new Scanner(System.in);

		// 첫번째로 입력하거나
		// 이전 계산의 결과를 담아둘 변수
		int inputNum = 0;
		
		// 반복의 횟수를 모른다.
		// -> 무한히 입력을 받는다
		while(true) {
			/* 1. 숫자를 입력 받는다
			 * 2. 계산할 두번째 숫자를 입력 받는다
			 * 3. 연산자 입력 받는다
			 * 4. 계산식에 넣는다.
			 * 5. 결과값을 받는다.
			 * 6. 결과값을 다음 계산의 첫번째 숫자로 취급한다.
			 * */
			
			// 첫 입력인 경우
			if(inputNum == 0) { // 초기값인지 검사한다.
				System.out.print("입력(숫자) :");
				// 1. 숫자를 입력 받는다
				inputNum = Integer.parseInt(sc.nextLine().strip());
				System.out.println(); // 줄바꿈
			}
			
//			2. 계산할 두번째 숫자를 입력 받는다
			System.out.print("입력(숫자) :");
			// 입력된 값이 esc이면 프로그램 종료
			String inputStr = sc.nextLine()
					.strip(); // strip은 문자열 양끝의 빈문자열이나
			// 줄바꿈을 없애주는 메서드다
			if(inputStr.equals("esc")) {
				System.out.println("프로그램 종료");
				break;
			}
			int inputNum2 = Integer.parseInt(inputStr);
			
//			3. 연산자 입력 받는다.
			System.out.print("입력(연산자) :");
			String inputOper = sc.nextLine().strip();
			
//			4. 계산식에 넣는다.
			// 입력받은 연산자에 따라서
			// 연산해야 할 내용이 달라진다
			// 연산자를 구분해야 한다.
			// -> 미리 만들어놓은 메서드를 활용한다.
//			5. 결과값을 받는다.
			int result = cal.calculate(inputNum + " " + inputOper + " " + inputNum2);
			
//			6. 결과값을 다음 계산의 첫번째 숫자로 취급한다.
			inputNum = result;
			System.out.println("계산된 결과는 :" + result);
			System.out.println("===================");
		}
		
		

	}

}
