package c_loop;

import java.util.Scanner;

public class _01_for {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("-----------");
		for (int i = 0; i < 3; i++) {
			System.out.println(i);
		}
		
		System.out.println("-----------");
		for (int i =0; i < 10; i++) {
			if (i < 5) {
				System.out.println(i + "는 5 미만이다. ");
			} else if (i ==5) {
				System.out.println("5에요");
			} else {
				System.out.println(i + "는 5 이상이다. ");				
			}
		}
		
		System.out.println("-----------");

		for (int i = 0; i < 5; i++) {
			System.out.print(i + "번째 입력 >> ");
			String input = sc.next();
			
			System.out.println("출력 >> " + input);
		}
	}
}
