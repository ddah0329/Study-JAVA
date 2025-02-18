package a_inter;

public class _02_ex {
	public static void main(String[] args) {
		
		// Animal 타입의 객체 주소를 저장하는 배열을 선언한 후 자식 객체들의 주소를 저장하였다 (업 캐스팅)
		Animal[] animals = {
				new Dog("바둑", 3),
				new Cat("나비", 1),
				new Dog("순딩", 7)
		};
		
		for (int i = 0; i<animals.length; i++) {
			animalBehavior(animals[i]);
			System.out.println();
		}
		// 변수를 받을 어쩌구 : 반복이 가능한 개체
		for (Animal animal : animals ) {
			animalBehavior(animal);
			System.out.println();
		}
		
	}

	private static void animalBehavior(Animal animal) {
		animal.makeSound();
		animal.eat();
	}

	public static void tryToWalk(Walkable walkable) {
		// 매개변수로 Walkable만 허용하기 때문에
		// instanceof로 타입을 체크하고 다운캐스팅할 필요가 없다. 
		
		walkable.walk();
	}
	
}
