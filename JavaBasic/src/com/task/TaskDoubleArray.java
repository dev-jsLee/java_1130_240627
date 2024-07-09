package com.task;

public class TaskDoubleArray {

	public static void main(String[] args) {
		// 이중 배열
		// 가장 바깥에 있는 배열의 요소로 배열이 들어가는 배열이다.
		int[][] dArrInt = new int[4][3];
		// 외부 배열은 행으로 보통 읽는다
		// 내부 배열은 열로 보통 읽는다
		
		for (int i = 0; i < dArrInt.length; i++) {
			for (int j = 0; j < dArrInt[i].length; j++) {
				// 내부 배열의 요소를 출력
				dArrInt[i][j] = i + j;
				System.out.print(dArrInt[i][j] + ", ");
			}
			// 내부 배열 요소 출력 후 줄바꿈
			System.out.println();
		}
		
		int[][] dArrInt2 = {
			{0, 1, 2, 4}, // 0번째 행의 배열
			{1, 2, 3}, // 1번째 행의 배열
			{2, 3},
			{3, 4, 5}, 
		};
		
		// 내부 배열의 길이는 서로 다를 수 있다.
		// 다만 각각의 배열은 그 길이가 정해져 있으므로
		// 길이가 늘거나 줄어들 수 없다.
		
		
		
		
	}

}
