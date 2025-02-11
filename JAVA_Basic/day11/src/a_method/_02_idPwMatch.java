// 아이디 비밀번호를 넘겨받아 일치하는지 확인하는 메서드
// id는 admin인지, pw는 1234인지 확인하기

package a_method;

public class _02_idPwMatch {
	public static void main(String[] args) {
		login("admin", 1234);
	}
	
	static void login (String id, int pw) {
		/*
		if (id.equals("admin") && pw == 1234) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}
		*/
		
		if (id.equals("admin") && pw == 1234) {
			System.out.println("로그인 성공");
			return;
		} 
		System.out.println();
		
	}
}
