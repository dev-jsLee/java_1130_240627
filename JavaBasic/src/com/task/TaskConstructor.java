package com.task;

public class TaskConstructor {
	String owner;
	
	public TaskConstructor() {;} // 기본 생성자
	
	// 오버로딩의 개념
	// 과적: 같은 이름으로 선언된 메서드가 있을 때
	// 파라미터의 개수, 종류, 순서가 서로 다른 조합이면
	// 같은 메서드 이름이더라도 파라미터 조합에 따라
	// 해당 메서드가 호출된다
	public TaskConstructor(String owner) {
		this.owner = owner;
		// this는 해당 클래스를 객체화한 인스턴스를 가리킨다
		// 인스턴스 & 객체의 주소값
	}
	// 파라미터의 조합에서 변수명은 고려하지 않는다.
//	public TaskConstructor(String name) {
//		
//	}
	
	public static void main(String[] args) {
		TaskConstructor 일동101호 = new TaskConstructor();
		// -> 참조 자료형은 값이X 주소값(위치값)을 참조하는 것이다.
		// 참조 : '가리킨다'라는 의미
		// 1동 101호: 주소값
		// 철수네집
		// 철수엄마네집
		TaskConstructor 철수네집 = 일동101호;
		TaskConstructor 철수엄마네집 = 일동101호;
		System.out.println(철수네집.owner);
		
		일동101호.owner = "철수엄마";
		
		System.out.println(철수네집.owner);
		
		
		int a = 3; // 기본 자료형 -> 값 자체가 저장공간에 들어간 거다
		int b = a; // b => 3
		a = a + 3; // a => 6
		// b => 6?
		
		
		
		
		
		
	}
	
	
	
}
