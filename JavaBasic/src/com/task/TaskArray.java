package com.task;

public class TaskArray {

	public static void main(String[] args) {
		// 배열이란
		// 같은 타입을 가진 값들을 하나의 배열에 담아 인덱스(숫자)로
		// 접근하는 방식의 자료형을 말한다
		// - 배열은 길이가 한번 정해지면 변하지 않는다
		
		int[] arrInt1 = new int[10]; // 1. 길이를 정해놓고 만든 배열
		System.out.println(arrInt1[0]);
		
		double[] arrDouble1 = new double[10];
		System.out.println(arrDouble1[0]);
		
		// 초기값으로 자료형에 맞는 초기값이 들어간다
		// 정수 0, 실수 0.0, 문자 ' ', 논리 false
		char[] arrChar1 = new char[10];
		System.out.println(arrChar1[0]);
		
		boolean[] arrBool = new boolean[10];
		System.out.println(arrBool[0]);
		// ==============================
		
		// 2. 값을 바로 세팅하는 배열 선언 및 초기화 방법
		int[] arrInt2 = {1, 2, 3, 7, 1, 5};
		
		int[] arrInt3 = null; // 단순 선언은 길이가 없다
//		arrInt3 = {1, 2, 3, 7, 1, 5}; // 선언 후 직접 값 세팅 방법X
		arrInt3 = new int[]{1, 2, 3, 7, 1, 5}; // 3. new로 세팅해야 한다
		
		
		
		
	}

}
