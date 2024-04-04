import java.util.Scanner;

public class SimpleUserInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("[필수 정보 입력]");
        System.out.print("이름         : ");
        String name = sc.nextLine();
        System.out.print("나이         : ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("메일주소      : ");
        String email = sc.nextLine();


        System.out.println("[입력된 내용]");
        System.out.println("이름         : " + name);
        System.out.println("나이         : " + age);
        System.out.println("메일주소      : " + email);
    }
}