import java.util.Scanner;

public class Round {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final float PI = 3.14F;

        System.out.print("원의 반지름을 정수로 입력하세요 : ");
        int radius = sc.nextInt();
        System.out.println("당신이 입력한 반지름은 " + radius + "입니다.");

        float area = radius * radius * PI;
        double size = 2.0 * radius * PI;
        System.out.println("원의 넓이 : " + area);

        System.out.println("원의 둘레 : " + size);

        sc.close();
    }
}
