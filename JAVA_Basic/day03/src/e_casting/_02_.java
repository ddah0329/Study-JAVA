package e_casting;

public class _02_ {
	public static void main(String[] args) {
		
		// 같은 자료형의 변수를 생성할 때는 콤마(,)를 사용하여 한 줄로 선언 가능
		int num1 = 10, num2 = 20;
		String number1 = "10", number2 = "20";
		
		System.out.println(num1 + num2); // 30  (덧셈 연산)
		System.out.println(number1 + number2); // 1020 (문자열 연결)
		
		System.out.println(num1 + number1); // 1010 (문자열 연결 => 연결의 결과는 항상 문자열!)
		System.out.println((num1 + number1).getClass().getName()); // String (변수 타입 확인)
		
		// 변수를 print 할 때
		System.out.println("내 나이는 " + num1 + "살 입니다.");
		System.out.println("두 수의 합은 " + num1 + num2 + "입니다."); // 두 수의 합은 1020입니다. (문자열 연결)
		System.out.println("두 수의 합은 " + (num1 + num2) + "입니다."); // 괄호 사용하여 연산 우선순위 정해주기
		
		
		// 형변환시 주의할 점
		// 대문자 자료형 (String) 과 소문자 자료형 (int, double....)은 서로간의 형변환이 어렵다.
		String number3 = 3 + ""; // 빈문자열을 이용하여 int를 String으로 변환
		System.out.println(number3); // 3
		
		// 기본 자료형 -> String 변환
		String str1 = 3 + "";
		String str2 = 'a' + "";
		String str3 = true + "";
		
		System.out.println(str1); // 3
		System.out.println(str1.getClass().getName()); // String (변수 타입 확인)
		System.out.println(str2); // a
		System.out.println(str2.getClass().getName()); // String (변수 타입 확인)
		System.out.println(str3); // true
		
		
		
		// String -> 기본 자료형 변환
		int num6 = Integer.parseInt(str1); // Integer 메소드 안에 있는 parseInt 기능
		System.out.println(num6); // String (변수 타입 확인)
//		System.out.println(num6.getClass().getName()); //에러 발생: 기본 자료형에는 getClass() 사용 불가
		
	}
}
