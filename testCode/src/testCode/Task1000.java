package testCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1000 {
//	static int result;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// int a = Integer.parseInt(sc.next());
		// int b = Integer.parseInt(sc.next());
//        System.out.println(a+b);


//		Stream.of(sc.nextLine().split(" ")).forEach(null);
		List<String> inputStrs = new ArrayList<>(List.of(sc.nextLine().split(" ")));
		List<Integer> inpuNums = new ArrayList<>();
//		inputStrs.forEach((str)->{inpuNums.add(Integer.parseInt(str));});
		inputStrs.forEach((str)->{inpuNums.add(Integer.parseInt(str));});
		
		int result = 0;
		for (Integer integer : inpuNums) {
			result += integer;
		}
		System.out.println(result);
	}

}
