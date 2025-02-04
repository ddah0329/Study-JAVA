package a_if;

public class _05_elseif {
	public static void main(String[] args) {
		
		// 위의 조건이 모두 거짓이고, 자신의 조건이 참일 때 실행한다.
		if(false) {
			System.out.println("if 영역");
		} else if(true) {
			System.err.println("else if 영역");
		}
		
		// else if는 몇번이든 반복적으로 사용 가능하다.
		if (false) {
			System.out.println(1);
		} else if (false) {
			System.out.println(2);			
		} else if (false) {
			System.out.println(3);
		} else if (true) {
			System.out.println(4);			
		}	
		
		// if, else if, else 한 번에 사용하기
		int num1 = 1, num2 = 2;
		
		 if (num1> num2) {
			 System.out.println("num1이 크다");
		 } else if (num1 == num2) {
			 System.out.println("num1은 num2와 같다.");
		 } else {
			 System.out.println("num2가 크다.");
		 }
		
	}
}
