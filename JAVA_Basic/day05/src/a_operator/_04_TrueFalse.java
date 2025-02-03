package a_operator;

import java.util.Scanner;

public class _04_TrueFalse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// String이 여러 줄이기 때문에 변수로 생성하여서 만들기
		String quizMsg = 
			"다음 중 음식이 아닌 것은? \n"
			+ "1. 피자 \n"
			+ "2. 케이크 \n"
			+ "3. 불고기 \n"
			+ "4. 자바 \n"
			+ "-------------------\n"
			+ "입력 >> ";
		
		final int ANSWER = 4;
		
		System.out.print(quizMsg);
		int choice = sc.nextInt();
		
		String resultMsg = 
				choice == ANSWER ? "정답!" : 
					1<= choice && choice <= 4 ? "오답!" : "잘못 입력하셨습니다. 다시 입력해주세요.";
		
		System.out.println(resultMsg);

	}
}
