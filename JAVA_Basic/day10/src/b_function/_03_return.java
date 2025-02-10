package b_function;

public class _03_return {
	public static void main(String[] args) {
		addNumber1(10, 20);
		System.out.println(addNumber2(10, 20));
		
		int save = addNumber2(10, 20);
		System.out.println(save);
	}
	
	static void addNumber1(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	
	// return이 있다면 값으로 사용할 수 있다.
	static int addNumber2(int num1, int num2) {
		return num1 + num2;
	}
}
