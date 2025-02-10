package b_function;

public class _01_function {
	public static void main(String[] args) {
		printHello();
		printGugudan();
	}
	
	// 메서드는 기본적으로 클래스 영역 안에서 만든다. 
	static void printHello() {
		System.out.println("hello");
	}
	
	// 구구단 함수 
	static void printGugudan() {
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i + "X" + j + "=" + i*j);
			}
		}
	}
}
