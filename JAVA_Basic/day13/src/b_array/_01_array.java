package b_array;

public class _01_array {

	public static void main(String[] args) {
		Member m1 = new Member(1,"김", 22, "서울");
		Member m2 = new Member(2,"박", 20, "경기");
		Member m3 = new Member(3,"이", 31, "제주");

//		객체 배열
//		객체의 주소를 저장한 배열을 의미
		Member[] members = {m1, m2, m3};
		
		Member[] members02 = {
			new Member(1, "김", 22, "서울"),
			new Member(2, "박", 20, "경기"),
			new Member(3, "이", 31, "제주")
		}
	}

}
