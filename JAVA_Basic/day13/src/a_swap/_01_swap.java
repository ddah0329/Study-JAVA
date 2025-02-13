package a_swap;

public class _01_swap {

	public static void main(String[] args) {

//		a와 b의 값을 서로 바꾸려면 어떻게 해야할까?
		int a = 10, b = 20;

		int temp = a;
		a = b;
		b = temp;

		System.out.println(a); // 20
		System.out.println(b); // 10

//		swap을 기능으로 만들어보자 -> 기능 안되는 현상 발생
		int c = 10, d = 20;

		swap01(c, d);

		System.out.println(c); // 10
		System.out.println(d); // 20

//		arr 배열의 0번쨰와 1번째 값을 바꾸고 싶다. 
//		arr 배열은 주소값을 저장하고 있다. 
		int[] arr = { 10, 20 };

		swap02(arr);

		System.out.println(arr[0]);
		System.out.println(arr[1]);
	}

	static void swap01(int c, int d) {
		int temp1 = c;
		c = d;
		d = temp1;
	}

	static void swap02(int[] arr) {
		int tmp = arr[0];
		arr[0] = arr[1];
		arr[1] = tmp;
	}

}