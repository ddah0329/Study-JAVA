public class Age {
    public static void main(String[] args) {
        int age = 30;
        if(true){
            int result = age + 1;
            System.out.println("나이는 : " + result);
        }

        if(false){
            age = 40;
            int result = 40;
            System.out.println("나이는 : " + result);
        }

    }
}