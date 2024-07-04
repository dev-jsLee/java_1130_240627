package day03;

import java.util.Scanner;

public class TypeCastingTest {

	public static void main(String[] args) {
		// 부동소수점 방식으로 표현된 작은 수는
		// 정확한 값이 아닌 근삿값으로만 컴퓨터가 표현할 수 있어서
		// 비교적 작은 값인 float으로 표현했을 때의 오차가
		// double형으로 형변환될 때 오차가 표현된다.
		System.out.println((double)(20.3f + (float)50.2));
		Scanner sc = new Scanner(System.in);
		int num1 = (int)100L;

	}

}
