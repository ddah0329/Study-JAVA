package c_variable;

public class _01_variable {
	public static void main(String[] args) {
		
		// 정수형 변수 생성 후 값 저장
		int a;
		a = 3;
		System.out.println(a);
		
		// 선언과 동시에 초기화
		String name = "ddah";
		System.out.println(name);
	
		// 변수의 사용 방식 2가지
		int num = 10; // 저장공간으로 사용
		System.out.println(num); // 값으로 사용됨
		
		int b= num; // c는 저장공간, num은 값
		System.out.println(b);
		System.out.println(b+5);
	}
}
