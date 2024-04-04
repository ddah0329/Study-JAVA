class TH_test extends Thread{
    public void run(){
        for(int i = 0; i < 5; i++)
            System.out.println("Th_Test");
    }
}


public class test_main {
    public static void main(String[] args)
    {
        TH_test TH_print = new TH_test();
        TH_print.start();
        for(int i = 0; i < 5; i++)
            System.out.println("Test_Main");
    }
}


