package practice02;

import java.util.Random;
import java.util.Scanner;

public class Prob05 {


	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int k = r.nextInt(100) + 1;
			int cnt = 1;
			int start = 1;
			int end = 100;
			
			System.out.println("수를 결정하였습니다. 맞추어 보세요.");
			
			while(true) {
				int val = 0;
				System.out.println(start+"-"+end);
				System.out.print(cnt+">>");
				val = sc.nextInt();
				if(k<val) {
					end = val;
					System.out.println("더 낮게");
					cnt ++;
				}
				else if(k>val) {
					start = val;
					System.out.println("더 높게");
					cnt ++;
				}
				else {
					System.out.println("맞았습니다.");
					break;
				}
			}
			System.out.print("다시하시겠습니까?(y/n)>>");
			String s = sc.next();
			if(s.equals("n")) {
				break;
			}
			System.out.println();
		}
	}

}
