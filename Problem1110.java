package problem1110;

import java.util.Scanner;

public class Problem1110 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int cnt = 0;
		int tmp = x;
		
		boolean run = true;
		while(run) {
			int a = tmp/10;
			int b = tmp%10;
			
			if(a+b<10) {
				tmp = 10*b + a+b;
			}else {
				tmp = 10*b + (a+b)%10;
			}
			cnt +=1;
			
			if(tmp==x) {
				break;
			}
		}
			System.out.println(cnt);	
	}
}
