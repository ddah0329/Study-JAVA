	/*
     * 사용자에게 퀴즈를 내고 정답인지 확인하는 프로그램
     * (삼항 연산자를 사용)
     * 
     * 입력 예시
     * 다음 중 음식이 아닌 것은?
     * 1. 피자
     * 2. 케이크
     * 3. 불고기
     * 4. 자바
     * 입력 >> 4
     * 
     * 출력 예시
     * 정답! (틀렸으면 오답!)
     */

package a_if;

import java.util.Scanner;

public class _09_food {
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String quizMsg = "다음 중 음식이 아닌 것은?\n"
          + "1. 피자\n"
          + "2. 케이크\n"
          + "3. 불고기\n"
          + "4. 자바\n"
          + "입력 >> ";
    
    final int ANSWER = 4;
    
    System.out.print(quizMsg);
    int choice = sc.nextInt();
    
    if(choice == ANSWER) {
    	System.out.println("정답!");
    } else if (1<= choice && choice <= 4){
    	System.out.println("오답!");
    } else {
    	System.out.println("잘 못 입력");
    }
}
}
