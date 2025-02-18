package b_inter;

public interface interA {
	default void method1() {
		System.out.println("디폴트 메서드!");
	}
	
	static void method2() {
		System.out.println("스태틱 메서드!");
	}
	
	private void method3() {
		System.out.println("private 메서드!");
	}
}
