package com.task.random;

public class LottoMain {

	public static void main(String[] args) {
		Lotto l = new Lotto();
		
		// static이니까 클래스.메서드() 방식으로 메서드 사용 가능
		Lotto.setLotto();
	}

}
