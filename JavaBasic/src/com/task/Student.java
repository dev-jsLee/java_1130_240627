package com.task;

public class Student {
	String name;
	int age;
	String address;
	int personalId;
	static int id; // identification
	
	// 스태틱 블록
	// 해당 클래스를 처음으로 객체화할 때
	// 1회 실행되는 코드블록이다
	static {
		id = 0;
	}
	
	// 초기화 블록
	// 객체화를 할 때마다 생성자 호출 이전에
	// 실행되는 코드블록이다
	{
		this.personalId = ++id;
	}
	
	public Student(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public Student(String name, int age) {
		this(name, age, "");
	}
	
	public Student(String name) {
		this(name, 0, "");
	}
	
	public static void main(String[] args) {
		System.out.println("호출 전 " + Student.id);
		Student st1 = new Student("홍길동", 10);
		System.out.println("1회 호출 " + Student.id);
		Student st2 = new Student("김길동", 20);
		System.out.println(Student.id);
		Student st3 = new Student("이길동", 30);
		System.out.println(Student.id);
		Student st4 = new Student("길길동", 40);
		System.out.println(Student.id);
		System.out.println("==================");
		
		System.out.println(st1.personalId);
		System.out.println(st2.personalId);
		System.out.println(st3.personalId);
		System.out.println(st4.personalId);
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
