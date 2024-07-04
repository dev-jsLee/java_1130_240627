package day06;

public class ClassTask { // 클래스 선언부
	// 클래스 안의 공간은 필드(field)라고 부른다
	// 멤버 변수 or 객체 변수
	private String name;
	private int age;
	
	// 클래스 변수 or 공유 변수(shared variable)
	// static
	static int index;
	
	
	// 1. static 블록
	// 프로그램이 실행되는 순간, 클래스를 로딩하면서
	// 최초 1회 실행되는 코드 블록이다.
	static {
		// 일반적으로 클래스 변수를 초기화 해준다.
		index = 0;
		System.out.println("스태틱 블록 호출");
	}
	
	// 2. 초기화 블록(instance 블록)
	// 생성자를 호출할 때, 생성자 호출마다 직전에 1회 실행된다. 
	{
		// 어떤 생성자를 호출하든, 공통적으로 먼저 실행되어야 하는
		// 내용이 들어간다.
		index++;
		System.out.println("초기화 블록 호출, index : " + index);
	}
	
	
	public ClassTask(String name, int age) {
		// 생성자
		// 멤버 변수를 초기화
		this.name = name;
		this.age = age;
	}
	
	public ClassTask(String name) {
		this(name, 0);
	}
	
	public ClassTask(int age) {
		this("", age);
	}
	
	// getter/setter
	// 메서드를 통해서만 멤버변수에 접근하게끔 제어하는 방법
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	// setter
//	public void setName(String name) {
//		this.name = name;
//	}
//	
//	public void setAge(int age) {
//		this.age = age;
//	}
	
	public ClassTask printInfo() {
		// 현재 클래스 타입 = ClassTask
		
		System.out.printf("제 이름은 %s이고, 나이는 %d입니다.\n",
				this.getName(), 
				this.getAge());
		return this; // this의 타입도 ClassTask
		// 객체의 주소값
	}
	
	public static void main(String[] args) {
		
		ClassTask ct1 = new ClassTask("홍길동", 20);
		
		ct1.printInfo().printInfo().printInfo();
		
		ClassTask ct2 = new ClassTask("김길동", 20);
		ClassTask ct3 = new ClassTask("이길동", 20);
		
		
		
		
		
		
	}
}
