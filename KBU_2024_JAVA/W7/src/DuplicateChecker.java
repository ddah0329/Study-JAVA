import java.util.Random;

public class DuplicateChecker {
    public static void main(String[] args) {
        int[] A = new int[50];
        int[] counter = new int[11];

        Random rand = new Random();

        for (int i = 0; i < 50; i++){
            A[i] = rand.nextInt(10) + 1;
        }

        for(int element : A){
            counter[A[element]]++;
        }

        System.out.println("중복된 숫자 갯수 출력");
        for(int i = 1; i <= 10; i++) {
            System.out.println("숫자 " + i + " : " + counter[i] + "개");
        }
    }
}
