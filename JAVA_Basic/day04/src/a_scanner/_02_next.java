package a_scanner;

import java.util.Scanner;

public class _02_next {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 >> ");
		String name = sc.next();
		
		System.out.print("나이 >> ");
		int age = sc.nextInt();
		
		
		System.out.println(name + "님의 나이는 " + age + "살 입니다.");
	}
	 
}
