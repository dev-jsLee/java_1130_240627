package solution.codingDojang;

import java.util.Scanner;

public class Solution465 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 입력 예시: aaabbcccccca
		String input = "aaabbcccccca";
		// 출력 예시: a3b2c6a1
		String output = "a3b2c6a1";
		
		// 결과값이 들어갈 변수 선언
		String result = "";

		// 문자열을 입력받아서,
		// input = sc.nextLine();

		// + 문자열을 배열로 담아
		String[] arrStr = input.split("");
		
		// + 검사할 문자열과 현재 문자열을 검사하기 위해
		// + 검사할 문자열을 담을 변수 선언
		String target = "";
		
		// 같은 문자가 연속적으로 반복되는 경우에
		// 그 반복 횟수를 표시하여
		// + 반복 횟수를 담을 변수 선언
		int times = 0;
		// 출력 예시: a3b2c6a1
		for (int i = 0; i < arrStr.length; i++) {
//			System.out.println("str: " + arrStr[i] + ", times: " + times + "\nresult: " + result + "\n계속하려면 엔터");
//			sc.nextLine();
			if (i == 0) { // 첫번째 문자는
				target = arrStr[0]; // 바로 담는다
				times++; // 개수를 1 증가
				continue; // 다음 반복으로 이동
			} else { // 두번째 문자부터
				// 이전 문자와 현재 문자를 비교
				if(target.equals(arrStr[i])) { // 같다면
					times++; // 개수를 1 증가
					continue; // 다음 반복으로 이동
				} else { // 다르면
					// 그 반복 횟수를 표시하여
					// + 결괏값에 붙이기
					result += target + times;
					// 검사할 문자열을 현재 문자열로 변경
					target = arrStr[i];
					// 반복횟수도 1로 초기화
					times = 1;
				}
			}
		}
		// 마지막 글자는 붙이는 부분이 없으므로 반복문 밖에 작성
		result += target + times;
		
		// 문자열을 압축하기.
		// 결괏값과 출력 예시를 비교
		System.out.println("==========");
		System.out.println(result);
		System.out.println("==========");
		System.out.println(output);
		System.out.println("==========");
		System.out.println(result.equals(output));
	}

}
