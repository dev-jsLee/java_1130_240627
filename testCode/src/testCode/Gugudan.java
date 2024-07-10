package testCode;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start, end;
        while(true) {
        	start = sc.nextInt();
        	end = sc.nextInt();
        	if(start>9 || end > 9 || start < 2 || end < 2) {
        		System.out.println("INPUT ERROR!");
        		continue;
        	} else {
        		break;
        	}
        }
        boolean startIsSmall = start < end;
        int small = startIsSmall ? start : end;

        for(int j=0; j<9;j++){
            for(int i = start; startIsSmall ? i <= end : i >= end;){
                System.out.printf("%d * %d = %2d   ", i, j+1, i * (j+1));
                if(startIsSmall) {
                	i++;
                } else {
                	i--;
                }
            }
            System.out.println();
        }
    }

}
