package c_static;

public class _01_static {

	public static void main(String[] args) {
		Person KimCS = new Person();
		KimCS.name = "김철수";
		KimCS.age = 18;
		KimCS.nation = "대한민국";
		
		Person KillianMF = new Person();
		KillianMF.name = "킬리안 머피";
		KillianMF.age = 20;
		KillianMF.nation = "아일랜드";
		
		System.out.println(Person.nation);

//		KimCS.nation처럼 인스턴스를 통해 접근이 가능하지만 권장하지 않는다. 
//		클래스에 소속된 하나의 저장공간이므로 클래스 이름으로 접근하느 것을 권장한다.
		Person.nation = "한국";
		KimCS.displayInfo();
		KillianMF.displayInfo();
		
		

	}
	
}
