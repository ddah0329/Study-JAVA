package a_switch;

import java.util.Scanner;

public class _01_switch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~4 사이의 정수 입력 >> ");
		int insert = sc.nextInt();
		
		switch(insert) {
			case 1, 3:
				System.out.println("홀수");
				break;
			case 2: case 4:
				System.out.println("짝수");
				break;
			default :
				System.out.println("잘못 입력!");
		}
	}
}
