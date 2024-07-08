package solution.codingDojang;

public class Solution406Board {

	public static void main(String[] args) {
//		A씨는 게시판 프로그램을 작성하고 있다.
//		A씨는 게시물의 총 건수와 한 페이지에 보여줄 게시물수를 입력으로 주었을 때 총 페이지수를 리턴하는 프로그램이 필요하다고 한다.
//		입력 : 총건수(m), 한페이지에 보여줄 게시물수(n) (단 n은 1보다 크거나 같다. n >= 1)
//		출력 : 총페이지수
//		입력 : 총건수(m), 한페이지에 보여줄 게시물수(n) (단 n은 1보다 크거나 같다. n >= 1)
//		출력 : 총페이지수
//		A씨가 필요한 프로그램을 작성하시오.
//		예) 프로그램 수행 시 다음과 같은 결과값이 나와야 함.
//
//		m	n	출력
//		0	1	0
//		1	1	1
//		2	1	2
//		1	10	1
//		10	10	1
//		11	10	2
		// test case
//		입력 : 총건수(m),
		int[] test_m = { 0, 1, 2, 1, 10, 11 };
//		한페이지에 보여줄 게시물수(n) (단 n은 1보다 크거나 같다. n >= 1)
		int[] test_n = { 1, 1, 1, 10, 10, 10 };
//		출력 : 총페이지수
		int[] test_p = { 0, 1, 2, 1, 1, 2 };

		for (int i = 0; i < test_p.length; i++) {
			int result = paging(test_m[i], test_n[i]);
			if(result==test_p[i]) {
				// 결괏값이 테스트 케이스와 같을 경우 출력
				System.out.printf("m: %d\tn: %d\tp: %d\n", test_m[i], test_n[i], result);
			}
		}
	}

	public static int paging(int m, int n) {
		int result = 0;
		result = m / n + (m % n > 0 ? 1 : 0);
		return result;
	}

}
