import java.util.Random;

class Dice {
    final int MIN_VALUE = 1;
    final int MAX_VALUE = 6;

    int faceValue = 0;

    public void roll(){
        Random rand = new Random();

        faceValue = (rand.nextInt(1000) % MAX_VALUE) + 1;
//        int temp = (rand.nextInt(1000) % MAX_VALUE) + 1;
//        if(MIN_VALUE <= faceValue && MAX_VALUE >= faceValue){
//            faceValue = temp;
//        }
    }
}


class DiceDemo {
    public static void main(String[] args) {
        Dice dice1= new Dice();
        Dice dice2= new Dice();
//        Dice[] dices = new Dice[10];

        System.out.println(dice1.MAX_VALUE + "," + dice1.MIN_VALUE);
        System.out.println(dice2.MAX_VALUE + "," + dice1.MIN_VALUE);

        dice1.roll();
        dice2.roll();

//        System.out.println(dice1.faceValue);
        System.out.println(dice2.faceValue);

    }
}
