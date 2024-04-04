import java.util.Scanner;

public class InputFtoC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("화씨 온도 입력 : ");
        float input = sc.nextFloat();
        System.out.println("화씨 온도 : " + input);

        float cel = (5.0f) / (9.0f) * (input - 32);
        System.out.println("섭씨 온도 : " + cel);

        sc.close();
    }
}