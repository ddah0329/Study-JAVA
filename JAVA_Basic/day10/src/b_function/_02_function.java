// 학생 관리 프로그램
// 상황에 따라 다양한 이름을 출력하려면 어떻게 해야할까?

package b_function;

public class _02_function {
	public static void main(String[] args) {
		printName("홍길동");
		printName("김철수");
		
	// 반환이 있는 메서드는 자신을 호출한 위치에 해당 값을 되돌려준다.
	// 즉, returnTen()은 10과 동일하다.
	// 그러므로 반환값이 존재하는 메서드를 호출하면 값으로 본다.
		returnTen(); // 출력 안됨.
		System.out.println(returnTen());
	//	값으로 저장이 가능하다.
		int result = returnTen();
		System.out.println(result);
		
	}
	
	static void printName(String name) {
		System.out.println(name);
	}
	
	// void 대신 리턴되는 타입을 입력해야 한다. 
	static int returnTen() {
		return 10;
	}
}


