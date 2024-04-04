import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 스캐너 클래스 선언

        System.out.print("숫자 입력: ");
        String input = sc.nextLine(); // input 변수에 스캐너 사용하여 사용자입력 받기 scanf

        System.out.println("input : " + input);

        sc.close(); //스캐너 닫기
    }
}
