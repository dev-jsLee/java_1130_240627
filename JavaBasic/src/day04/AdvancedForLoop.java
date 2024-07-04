package day04;

public class AdvancedForLoop {

	public static void main(String[] args) {
		// foreach문
		// 배열처럼 여러 값이 들어있는
		// iterable 객체의 요소를 하나씩 들고와서
		// 좌항에 선언한 변수에 담아 쓸 수 있다.
		// for(임시로 담아쓸 요소의 변수 : 내용을 확인할 iterable 객체)
		// 와 같이 작성한다
		int[] arrInt1 = {3, 6, 9};
//		for (int i = 0; i < arrInt1.length; i++) {
		for (int element : arrInt1) { // 좌항 : 우항
			System.out.println(element);
		}
		

	}

}
