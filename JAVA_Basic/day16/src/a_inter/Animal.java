package a_inter;

// 필요한 동물 타입은 애완 동물이다.
// 각각의 이름과 나이가 있다. => 필드 필요, 인터페이스는 상수만 가능 => 클래스
// 모든 동물은 울고, 밥을 먹는다 => 공통되는 메서드이므로 Animal에 정의
// 동물이 우는 방식은 모두 다르다. => 추상 메서드
// 동물이 밥을 먹는 기능은 모두 같다. => 일반 메서드
public abstract class Animal {
	
	public abstract void makeSound();
	
}
