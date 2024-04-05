public class FakeCoin {
    public static void main(String[] args) {

        int coinA = 10, coinB = 10, coinD = 10, coinC = 10, coinF = 10, coinG = 10,  coinE = 10;
        int coinH = 11; // 가짜코인

        if((coinA + coinB + coinC + coinD) > (coinE + coinF + coinG + coinH)){
            if ((coinA + coinB) > (coinC + coinD)){
                if(coinA > coinB){
                    System.out.println("가짜 코인은 A 입니다");
                } else{
                    System.out.println("가짜 코인은 B 입니다");
                }
            } else {
                if(coinC > coinD) {
                    System.out.println("가짜 코인은 C 입니다");
                } else{
                    System.out.println("가짜 코인은 D 입니다");
                }
            }
        } else {
            if ((coinE + coinF) > (coinG + coinH)){
                if (coinE > coinF){
                    System.out.println("가짜 코인은 E 입니다");
                } else{
                    System.out.println("가짜 코인은 F 입니다");
                }
            } else{
                if (coinG > coinH){
                    System.out.println("가짜 코인은 G 입니다");
                } else{
                    System.out.println("가짜 코인은 H 입니다");
                }
            }
        }
    }
}
