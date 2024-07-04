package testCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Task1002 {

	final static int X = 0;
	final static int Y = 1;
	final static int T = 2;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] inputStrs = sc.nextLine().split(" ");
		int[] jo = { Integer.parseInt(inputStrs[0]), Integer.parseInt(inputStrs[1]), Integer.parseInt(inputStrs[2]) };
		int[] baek = { Integer.parseInt(inputStrs[3]), Integer.parseInt(inputStrs[4]), Integer.parseInt(inputStrs[5]) };

		HashSet<int[]> joCases = new HashSet<int[]>();
		
		int index = 0;
		while(true) {
			boolean alreadyInput = false;
			if(jo[T]-(jo[X]-index) == (jo[Y] + index)) {
				alreadyInput = joCases.add(new int[]{jo[X], jo[Y]});
			}
			if(alreadyInput) break;
		}
		
		
		
		
		
	}
	
	public static HashSet<int[]> func(int[] target, HashSet<int[]> targetSet){
		int index = 0;
		while(true) {
			boolean alreadyInput = false;
			if(target[T]-(target[X]+index) == (target[Y] - index)) {
				alreadyInput = targetSet.add(new int[]{target[X], target[Y]});
			}
			if(alreadyInput) break;
		}
		
		return targetSet;
	}
}
