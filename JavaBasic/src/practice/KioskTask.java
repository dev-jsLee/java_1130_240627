package practice;

import java.util.Scanner;

public class KioskTask {

	public static void main(String[] args) {
		// 상품이나 과정을 선택하기 위한 입력을 받은 스캐너 선언
		Scanner sc = new Scanner(System.in);

		// 선택지 선언
		String[] orderList = {"", "치즈버거", "불고기버거", "콜라" };
		int[] orderPriceList = {0, 3000, 4000, 1500 };
		// 안내 문구를 담을 변수 선언
		String noticeMsg = "";
		
		// 안내문구에 따른 선택지를 입력받을 변수 선언
		int select = 0;
		
		// 상품 개수를 입력받을 변수 선언
		int count = 0;
		
		// 최종 결제 금액을 담을 변수 선언
		int lastNeedMoney = 0;
		
		// ctrl + shift + f -> 코드 줄 정리
//			System.out.println("1. 치즈버거\n2. 불고기버거\n3. 콜라");
		
		// 상품 개수 변동에도 대응할 수 있는 안내 메시지 구성
		for (int i = 1; i < orderPriceList.length; i++) {
			// i == 1? -> 시뮬레이션을 돌려보자
			// "1. 치즈버거\n"; -> 시뮬레이션에 따라 나올 값을 생각해볼 수 있다.
			noticeMsg += i + ". " + orderList[i] + "\n";
		}
		
		// 키오스크는 몇 번이나 주문 받을지 누군가는 아는가?
		// 컴퓨터X 개발자X 사용자X
		// 반복적인 입력을 통해 주문을 무한히 받아야 하므로 while문 사용
		while (true) {

//			// 입력 안내 메시지
			System.out.println(noticeMsg);

			// 입력 안내 메시지
			System.out.print("입력: ");

			// 선택지 입력을 받을 변수 선언 and 입력
			select = Integer.parseInt(sc.nextLine().strip());

			// 제대로 값이 들어갔는지 확인하기 위한 출력문
//			System.out.println(orderList[select]);
//			System.out.println(orderPriceList[select]);

			// 개수 입력 안내 메시지
			System.out.print("개수 입력: ");

//		- 개수 입력 받고
			count = Integer.parseInt(sc.nextLine());
			
			// 최종 결제 금액을 담아준다
			lastNeedMoney = (orderPriceList[select] * count);
//		- 최종 결제 금액을 알려주고
			System.out.println("최종 결제 금액: " + lastNeedMoney);

			// 받을 돈 입력 안내 메시지
			System.out.print("결제 금액 입력: ");

//		- 받을 돈 입력 받아서
			int inputMoney = Integer.parseInt(sc.nextLine());
			System.out.println();// 줄바꿈

			// 최종 결제 금액과 입력받은 결제 금액을 비교한다
//		    - 충분하면 거스름돈 계산해서 알려주기
			if (lastNeedMoney <= inputMoney) {
				System.out.println("거스름돈은 " + (inputMoney - lastNeedMoney));
			} else {
//		    - 부족하면→ 금액부족
				System.out.println((lastNeedMoney - inputMoney) + "원만큼의 금액이 부족합니다");
			}

		}

	}

	public static void method1() {

	}

}
