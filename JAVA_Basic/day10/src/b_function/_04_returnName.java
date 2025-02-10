package b_function;

public class _04_returnName {
	public static void main(String[] args) {
	
		printName("홍길동");	
	
	}
	
	static void printName(String name) {
		for(int i =1; i <= 5; i++) {
			System.out.println(i + "." + name);
		};
	}
	
}

