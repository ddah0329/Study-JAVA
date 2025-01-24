package b_datatype;

public class _01_datatype {
	public static void main(String[] args) {
		// 정수형
		System.out.println("int : " + 10);
		System.out.println("long : " + 3L); // long을 표시하기 위해 L을 붙임
		
		// 실수형
		System.out.println("double : " +  3.14);
		System.out.println("float : " +  0.02F); // flaot을 표시하기 위해 F을 붙임
		
		// 논리형
		System.out.println("논리형 T : " + true);
		System.out.println("논리형 F : " + false);
		
		// 문자형
		System.out.println("문자형 : " + 'a');
		System.out.println("문자형 : " + '김');
		System.out.println("문자형 : " + '3'); // 문자 3임
		System.out.println("문자형 : " + ' '); // '' 공백은 에러 발생 (스페이스 하나라도 있어야함)
		
		// 문자열
		System.out.println("문자열 : " + "ddah");
		
		// 문자형과 문자열의 차이
		//System.out.println("문자형 : " + '');  ' ' 작은 따옴표 안에 공백일 시 에러 발생
		System.out.println("문자열 : " + "");  // 따옴표 안에 공백이 있어도 가능 = 빈 문자열
	}
}
