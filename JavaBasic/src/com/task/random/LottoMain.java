package com.task.random;

public class LottoMain {

	public static void main(String[] args) {
		Lotto l = new Lotto();
		
		// 랜덤값으로 6자리가 중복X 세팅된 숫자 배열
		int[] randomLotto = Lotto.noDuplicate(true);
		// static이니까 클래스.메서드() 방식으로 메서드 사용 가능
		// 사용자의 입력을 받아 6자리 중복X 숫자 배열 세팅
		int[] inputLotto = Lotto.noDuplicate(false); 
		int dang = 0;
		
		// 로또 번호를 반복
		for (int i = 0; i < randomLotto.length; i++) {
			// 입력받은 로또번호와 로또당첨번호의 일치를 검사하는 구문
			for (int e : inputLotto) {
				// 입력받은 로또번호와 같으면
				if(randomLotto[i] == e) {
					dang++; // 당첨번호 개수 증가
					break; // 당첨번호가 같은 게 확인 됐으므로
					// 나머지 숫자와 동일 여부를 검사할 필요가 없다
				}
			}
		}
		// 당첨번호 개수를 마지막에 확인
		System.out.println(dang);
		// 1위는 6개
		// 2위 5개
		// 3위 4
		//....
		// 당첨번호 개수가 3개 이상일 경우 당첨
		if(dang >= 3) {
			// 순위 숫자와 당첨번호 개수의 합이 7이므로
			// 7에서 당첨번호 개수를 뺀 값이 등수다
			System.out.println(7-dang+"등 당첨");
		}
	}
}





