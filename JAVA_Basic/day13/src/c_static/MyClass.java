package c_static;

public class MyClass {
	int instanceVar;
	static int staticVar;
	
	void instanceMethod1() {
		instanceVar = 10;
		staticVar = 20;
		
		instanceMethod2();
		staticMethod2();
	}

	void instanceMethod2() {
		
	}
	
//	static 매서드는 스태틱 멤버만 접근 가능하다. 
	static void staticMethod1() {
//		instanceMethod2(); // 오류
		staticMethod2();
	}

	static void staticMethod2() {
		
	}
	
}
