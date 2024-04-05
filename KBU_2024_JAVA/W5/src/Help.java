import java.util.Scanner;

public class Help {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String select;

        System.out.println("1. if");
        System.out.println("2. switch");
        System.out.println("3. for");
        System.out.println("4. while");
        System.out.println("5. do-while");
        System.out.println("q. quit");

        boolean close = true;

        while(close) { // 항상 반복
            System.out.print("번호를 선택하세요: ");
            select = sc.nextLine();

            switch (select) {
                case "1" -> System.out.println("if문은 조건에 따라 프로그램의 실행 흐름을 제어하는 구조이다. ");
                case "2" -> System.out.println("switch문은 특정 변수나 표현식의 여러 가능한 값을 기반으로 다양한 동작을 수행할 때 사용되는 제어 구조이다.");
                case "3" -> System.out.println("for문은 초기화, 조건 검사, 증감식으로 구성된 루프 구조이다.");
                case "4" -> System.out.println("while문은 주어진 조건이 참인 동안 반복해서 코드 블록을 실행하는 루프 구조이다. ");
                case "5" -> System.out.println("do-while문은 코드 블록을 실행한 후 조건을 조건을 검사하는 루프 구조이다.");
                case "q" -> {
                    System.out.println("exit...");
                    close = false;
                }
                default -> System.out.println("잘못 입력하셨습니다.");
            }
        }
    }
}