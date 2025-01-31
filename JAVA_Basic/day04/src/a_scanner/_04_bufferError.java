package a_scanner;

import java.util.Scanner;

public class _04_bufferError {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("좋아하는 숫자 >> ");
		int number = sc.nextInt();
		
		sc.nextLine(); // 찌꺼기 제거 (출력버퍼 해결)
		
		System.out.print("좋아하는 동물 >> ");
		String animal = sc.next();
		
		System.out.println("내가 좋아하는 숫자는 " + number + "이고, 좋아하는 동물은 " + animal + " 이다.");
	}
}
