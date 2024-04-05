import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("for quit, press 0");
        System.out.println("I'm thinking of a letter a ~ z");

        char input, ch = 'k';
        do {
            System.out.print("Guess my letter: ");
            input = sc.next().charAt(0);

            if(input >= 'a' & input <= 'z'){
                if(input < ch) {
                    System.out.println("up");
                } else if(input > ch) {
                    System.out.println("down");
                } else if(input == ch){
                    System.out.println("Correct!");
                    break;
                } else {
                    //empty
                }
            } else {
                System.out.println("잘못된 값을 입력했습니다.");
            }

        } while (input != '0');
    }
}
