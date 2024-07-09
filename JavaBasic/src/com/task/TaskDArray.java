package com.task;

public class TaskDArray {

	public static void main(String[] args) {
		// 구구단의 결과 값을 이중 배열에 넣어서
		// 행렬 모양에 맞춰 출력해보자
		/* 1 2 3 4 5 6 7 8 9
		 * 2 4 6 8 10...
		 * 3 6 9 ...
		 * 4 8
		 * ...
		 * 8
		 * 9
		 * */
		// 이중배열의 길이 세팅
		int[][] dArr1 = new int[9][9];
		
		// 이중for문 사용
		for (int i = 0; i < dArr1.length; i++) {
			for (int j = 0; j < dArr1[i].length; j++) {
				// 값 세팅
				dArr1[i][j] = (i+1) * (j+1);
				// 한 행씩 출력
				System.out.printf("%-3d", dArr1[i][j]);
			}
			System.out.println();
		}
		
		
		
		
		
		
	}

}
