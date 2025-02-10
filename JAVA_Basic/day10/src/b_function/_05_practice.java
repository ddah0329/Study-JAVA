package b_function;

import java.util.Scanner;

public class _05_practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] qList = {
			"0. 정수를 넘겨받아 음수면 양수로, 양수면 음수로 바꿔서 반환하는 메서드",
			"\n1. 이름과 정수를 넘겨받아 정수만큼 이름 출력하는 메서드\n"
			+ "ex) 홍길동, 8 >> 홀길동 8번 출력",
			"\n2. 정수를 넘겨받아 10 이하의 숫자는 1로 10을 초과하는 숫자는 100으로 바꿔서 반환하는 메서드",
			"\n3. 5개의 정수를 넘겨받아 평균 값을 반환하는 메서드 (매개변수 5개 활용, 반환 값은 실수로 반환)"
			};
		
		System.out.println(qList[0]); // 문제 배열 출력
		System.out.print("정수 입력 >> ");
		System.out.println(q0_makeMinusPlus(sc.nextInt()));
		
		
		
		System.out.println(qList[1]); // 문제 배열 출력
		
		
		
		
		
		System.out.println(qList[2]); // 문제 배열 출력
		
		sc.close();
	}
	
	static int q0_makeMinusPlus(int q0_num) {
		return -q0_num;
	}
	
	static void q1_printName(String q1_string) {
	}
}
