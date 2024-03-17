public class Mars {
    public static void main(String[] args) {
        final int SPEED_OF_LIGHT = 186000; // mile per sec
        final int MIN_TO_SEC = 60;
        final int DISTANCE = 34000000; // mile

        int elapsedSec = DISTANCE / SPEED_OF_LIGHT; // 초당
        int elapsedMin = DISTANCE / SPEED_OF_LIGHT / MIN_TO_SEC; // 분당

        System.out.println("elapsed time(integer): " + elapsedSec + "(sec)");
        System.out.println("elapsed time(integer): " + elapsedMin + "(min)");
    }
}
