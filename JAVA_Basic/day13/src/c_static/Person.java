package c_static;

public class Person {
	static String nation; // 정적 필드
	String name; // 인스턴스 필드
	int age; // 인스턴스 필드
	
	static void printHello() {
		System.out.println("Hello");
	}
}