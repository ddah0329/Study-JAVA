package c_static;

public class _02_static {
	public static void main(String[] args) {
//		static 멤버는 프로그램 시작과 동시에 사용할 준비가 끝난다.
//		즉, static 변수는 프로그램 시작과 동시에 저장공간이 생성된다.
//		그러므로 인스턴스 없이 바로 사용이 가능한다.
		
		Person.nation = "대한민국"; 
		System.out.println(Person.nation);
		
		Person.printHello();
	}
}
