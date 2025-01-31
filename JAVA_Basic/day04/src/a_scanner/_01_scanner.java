package a_scanner;

import java.util.Scanner;

public class _01_scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("입력 >> ");
        String input = sc.next();  // 사용자 입력 받기
        System.out.print(input + " ( " + input.getClass().getName() + " )");
    }
}
