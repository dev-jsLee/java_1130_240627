package day02;

public class PrintTest {

	public static void main(String[] args) {
		System.out.println("안녕1");
		System.out.println("안녕2");
		// 출력하고자 하는 값을 넣으면
		// 출력될 문장 끝에 줄바꿈 되어 출력된다.
		
		System.out.print("안녕3.");
		System.out.print("안녕4.");
		
		System.out.println(); // 줄바꿈만
		
//		===============================
		System.out.printf(""); // format의 앞글자 f
		
		String name = "이준상";
		int age = 32;
		
		System.out.printf("제 이름은 %s입니다.\n제 나이는 %d입니다.", name, age);
		
	}

}
