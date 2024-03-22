public class W3_examples {
    public static void main(String[] args) {
//      - ch3-1
//      float result = 1.2 + 3.4; double 자료형 연산인데 변수를 float로 처리해서 에러
        float result = 1.2f+ 3.4f;
        System.out.println(result);

//      - ch3-2
        int a = 10;
        double b = 20.0;
        int c = (int) (a + b); //이거는 왜 에러나는거지?

//      - ch3-3
        int d = 10;
        int e = 3;
//      (실제 계산기 값) d/e => 10/3 => 3.333333
//      double f = d/e; 이렇게 하면 d/e => 정수인 값 '3'이 나오기 때문에 float 자로형으로 강제 형변환을 해주어야 한다.
        double f = (double) d/e;
        System.out.println(f);

//      - ch3-4


    }
}