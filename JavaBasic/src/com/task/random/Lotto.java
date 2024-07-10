package com.task.random;

import java.util.Random;

public class Lotto {
	// 1~45
	// 6개를 컴퓨터가 랜덤으로 중복X 따로 뽑는다
	// 1회, 2회,...마다 번호가 다르게 뽑혀야 된다
	// 현재 회차 도전 || 다음 회차 도전
	// 이전 회차에 도전X
	// 
	
	// 당첨 번호가 들어갈 로또 번호 공유 변수 선언
	static int[] lotto = new int[6];
	
	// 랜덤 클래스 선언 전 공유 변수로 할당
	static Random r;
	
	// 서로 다른 로또 판매지점에서도
	// 같은 회차의 로또 번호를 공유할 수 있도록
	
	// 클래스를 처음으로 객체화할 때 1회 호출된다.
	static {
		// 처음 객체화할 때 랜덤함수도 하나 객체화
		r = new Random();
		System.out.println("로또 1회차 시작");
	}
	
	// 생성자
	public Lotto() {
		
	}
	
	// 로또 번호를 세팅하는 메서드
	public static void setLotto() {
		int[] madeLotto = new int[6]; // 0이 모든 요소에 초기화
		
		// r.nextInt(); // int 범위 전체 대상으로 랜덤값 반환
//		r.nextInt(45); // 1이상 45미만의 값이 랜덤으로 반환
		
		// 전체 반복은 6자리를 채우기 위한 반복
		for (int i = 0; i < madeLotto.length; i++) {
			// 이전에 값 존재 여부 판단을 위한 반복문 탈출하기 위한 플래그 선언
			// 값을 할당했다면, 다음 값 여부 판단을 위해 초기화
			boolean continueFlag = false;
			int tempNum; // 랜덤 값을 임시로 담기 위한 변수 선언
			
			while(true) {
				// 새로운 랜덤값을 받았다
				tempNum = r.nextInt(45) + 1; // 0~44라서
				// 1을 더해주어 1~45 범위로 바꿔준다
				
				// 이전에 값이 존재했는지 검사
				// 요소 값을 하나씩 들고 와서 검사
				for (int e : madeLotto) {
					if(e == tempNum) {
						continueFlag = true;
					} else if(e <= 0) {
						// 할당된 적이 없다면
						// 바로 탈출
						break;
					}
				}
				if(continueFlag == true) {
					continue;
				}
				// 이전에 할당된 적이 없다면
				// 값 검사 반복문 탈출
				break;
			}
			// 중복이 아닌 랜덤값을 세팅해준다.
			madeLotto[i] = tempNum;
		}
		System.out.println("=====세팅 완료=====");
		for (int i : madeLotto) {
			System.out.println(i);
		}
		lotto = madeLotto;
	}
	
	/*
	 * - 1 ~ 45사이의 번호 중
	 * 중복되지 않는 6개의 번호를 선택하여 맞히는 게임입니다.
	 * - 로또번호 : 6개의 번호와 1개의 보너스 번호를 가집니다.
	 * - 보너스번호를 포함하여 각 번호는 중복되지 않습니다. 
	 * - 로또번호를 만들때에는 랜덤함수를 이용하여 만들어주세요. 
	 * - 게임유저는 6개의 번호를 선택합니다.
	 * - 유저가 선택한 각 번호는 중복되지 않습니다. 
	 * - 유저번호는 스캐너를 사용하여 직접입력하세요
	 * 
	 * 출력)
	 * 맞은 번호 : 1,2,3,4 등수 : 4등
	 * 
	 * 1등 : 6개 번호가 모두 맞았을 경우,
	 * 2등 : 5개의 번호가 맞고, 나머지 1개는 보너스번호랑 일치 할경우
	 * 3등 : 5개의 번호가 맞고, 나머지 1개는 보너스번호랑 일치하지 않을 경우 
	 * 4등 : 4개의 번호가 일치할 경우
	 * 5등 : 3개의 번호가 일치할 경우
	 * 꽝!
	 * 
	 */
}
