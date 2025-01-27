package d_print;

public class _02_printf {
	public static void main(String[] args) {
		int myAge = 10;
		
		System.out.println("내 나이는 myAge살 입니다.");
		
		// 변수가 가진 값을 문자열 내부에 포함하고 싶다면 printf와 서식 문자를 사용
		System.out.printf("내 나이는 %d살 입니다.\n", myAge);
		
		System.out.printf("원주율 : %f\n", 3.14);
		System.out.printf("원주율 : %.2f\n", 3.14);
		
		
	}
}
