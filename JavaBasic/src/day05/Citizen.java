package day05;

public class Citizen {
	// 대한민국 국민을 개념적으로 정의해보자.
	/* 주민등록증
	 * - 성명
	 * - 주민등록번호
	 * - 주소
	 * - 나이
	 * */
	String name;
	String citizenRegister;
	String address;
	int age;
	
	// 생성자(Constructor)
	// 메서드의 일종(특수 메서드)
	// 특징(메서드와 다른 점)
	/* 1. 메서드와 동일하게 작성하지만 반환타입을 지정하지 않는다.
	 * 		- 반환타입을 지정하지 않는 이유는, 이미 반환할 것이 정해져있기 때문이다.
	 * 		- 정해진 반환값은 바로 주소값
	 * 2. 생성자의 이름은 클래스 이름과 동일하게 작성한다.(대문자로 시작)
	 * */
	public Citizen() { // 기본 생성자
		// 입력X 내용물X
		// 생성자가 없을 때 자동으로 만들어둔다.
		
	}
	// 같은 이름으로 메서드를 두 개 만드는 것 -> 오버로딩(overloading)
	// 오버로딩: 과적: 과하게 적재
	// 오버로딩은 같은 이름의 메서드를 여러 개 선언해서 사용할 수 있는 기능인데
	// 사용조건
	// 1. 파라미터의 개수, 종류의 조합이 서로 달라야 한다.
	// 		- 순서가 다르거나, 개수가 다르거나 자료형이 다르거나
	// method(String, int)
	public void printInfo(String name, int age) {
		System.out.println("메서드 String, int");
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
	}
	// method(int, String)
	public void printInfo(int age, String name) {
		System.out.println("메서드 int, String");
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
	}
	// 위 메서드들은 오버로딩된다.
	// 2. 같은 이름의 메서드로 선언되어야 한다(대소문자 구분)
	// method()
	// methoD() -> 서로 다름
	// 3. 파라미터의 변수명은 신경쓰지 않는다.
	// method(int age)
	// method(int num) -> 오버로딩이 되지 않아 오류가 발생한다.
	
	public Citizen(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public Citizen(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Citizen(String name) {
		this.name = name;
	}
	
	
	
	public static void main(String[] args) {
		// 클래스
		// 예시를 통해 클래스를 알아보자.
		
		// 기본 자료형
		// int, float, double, boolean
		// 값을 가리키는 자료형
		int num1 = 3;
		int num2 = num1;
		System.out.println(++num1); // 4
		System.out.println(num2);	// 4x 3o
		
		
		// 참조 자료형
		// String .equals()
		// 위치를 가리키는 자료형
		Citizen citizen1 = new Citizen();
		Citizen citizenCopy = citizen1;
		
		// 값을 초기화 하기 전
		System.out.println(citizen1.name); // null
		
		// 값을 초기화하고
		citizen1.name = "홍길동";
		System.out.println(citizen1.name);
		
		System.out.println(citizenCopy.name); // null?
		System.out.println("=====================");
		// 생성자
//		citizen1.name = "홍길동";
//		citizen1.age = 20;
//		citizen1.address = "서울시 어딘가";
		
		Citizen ctz1 = new Citizen("홍길동", 30, "서울시 어딘가"); // 객체 생성
		// 비유-> 이력서 양식 다운로드
		System.out.println("이름: " + ctz1.name + 
				"\n나이: " + ctz1.age + 
				"\n주소: " + ctz1.address);
		
		System.out.println("==================");
		Citizen ctz2 = new Citizen("김길동");
		Citizen ctz3 = new Citizen("이길동", 20);
		Citizen ctz4 = new Citizen("박길동", 20, "서울시 구석 어디 시골");
		
		System.out.println("===============");
		ctz2.printInfo("길동", 30);
		
		
		
		
		
		
	}

}
