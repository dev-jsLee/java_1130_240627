package testCode;

import java.util.stream.IntStream;

public class TestTrans {

	public static void main(String[] args) {
		double strToDouble = Double.parseDouble("3");
		System.out.println(strToDouble);
		
		char strToChar = "?".charAt(0);
		IntStream strToCharArr = "1234".chars();
		strToCharArr.forEach((e)->{System.out.print((char)e + " ");});
	}

}
