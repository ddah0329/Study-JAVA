public class VariableSwap {
    public static void main(String[] args) {
        int a = 50;
        int b = 70;

        System.out.println("origin : a = " + a + ", b = " + b);

        int swap = b;
        b = a;
        a = swap;

        System.out.println("result : a = " + a + ", b = " + b);
    }
}
