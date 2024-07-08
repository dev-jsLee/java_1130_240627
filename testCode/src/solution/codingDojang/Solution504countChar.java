package solution.codingDojang;

public class Solution504countChar {

	public static void main(String[] args) {
		// 1~1000에서 각 숫자의 개수 구하기
//		예로 10 ~ 15 까지의 각 숫자의 개수를 구해보자
//
//		10 = 1, 0
//		11 = 1, 1
//		12 = 1, 2
//		13 = 1, 3
//		14 = 1, 4
//		15 = 1, 5
//
//		그러므로 이 경우의 답은 0:1개, 1:7개, 2:1개, 3:1개, 4:1개, 5:1개
		int start = 1; // 시작값
		int end = 1000; // 끝값
		// 0~9 숫자마다의 개수를 담을 배열 선언
		// 모든 요소는 초기값 0으로 설정된다.
		int[] arrTimes = new int[10];
		for (int i = start; i <= end; i++) {
			String strI = i + "";
//			String strI = String.valueOf(i);
			for (String e : strI.split("")) {
				// 문자 '0'에서 문자 '0'을 빼면 숫자 0이 된다.
				int current = (int) (e.charAt(0) - '0');
				arrTimes[current]++;
//				System.out.println(current + ": " + arrTimes[current]);
			}
		}
		for (int i = 0; i < arrTimes.length; i++) {
			System.out.println(i + ":" + arrTimes[i]);
		}

	}

}
