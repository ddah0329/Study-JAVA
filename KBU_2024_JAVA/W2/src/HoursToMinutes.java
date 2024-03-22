public class HoursToMinutes {
    public static void main(String[] args) {
        final int HOUR_TO_SEC = 60;

        int TimeforMIN1 = 3 * HOUR_TO_SEC + 10;
        int TimeforMIN2 = 9 *  HOUR_TO_SEC + 2;


        System.out.println( "3시간 10분");
        System.out.println( "총 " + TimeforMIN1 + "분" );
        System.out.println( "9시간 2분");
        System.out.println( "총 " + TimeforMIN2 + "분" );
    }
}
