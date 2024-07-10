package testCode;

import java.util.Scanner;
import java.util.stream.IntStream;

public class GugudanEnhanced {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start=0, end=0;
		while(true) {
			start = sc.nextInt(); end = sc.nextInt();
			if(start<2||start>9||end<2||end>9) {
				continue;
			}
			break;
		}
		if(start<end) {
			IntStream.rangeClosed(start, end);
		}else {
			IntStream.rangeClosed(start, end).sorted();
		}
		
	}

}
