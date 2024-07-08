package testCode;

public class Test504 {

	public static void main(String[] args) {
		new Test504().count(1, 1000);
	}
    static int count[] = new int[10];
    public void countNumbers(int n){
        int num  = n % 10;
        count[num] +=1;
        System.out.println("count[" + num + "]: " + count[num]);
        while(n > 10){
            n = n / 10 ;
            count[n%10] += 1;
            System.out.println("count[" + n%10 + "]: " + count[n%10]);
        }
    }

    public void count(int n, int m){
        for(int i = n ;  i<=m ;i++){
        	System.out.println(i);
            countNumbers(i);
        }
        for(int i = 0 ; i < 10 ;i++){
            System.out.print(i + ": " + count[i] +"개, \n" );
        }

    }

}
