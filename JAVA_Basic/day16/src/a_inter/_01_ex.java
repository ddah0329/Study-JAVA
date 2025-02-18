package a_inter;

public class _01_ex {
	public static void main(String[] args) {
		ClassC classC = new CalssC();
		classC.method1();
		classC.method2();
		
		InterA.method2();
		
		InterB interB = new ClassC();
		interB.method3();
		
		InterC interC = new ClassC();
		interC.method1();
		interC.method4();
	}
}
