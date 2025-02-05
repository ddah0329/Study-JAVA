package b_multiOperator;

public class _01_multiOpertor {
	public static void main(String[] args) {
//		----------------------------------------------------------------------------
		int money = 10000;
		
//		money = money - 1000;
		money -= 1000;
		
		System.out.println(money);
		
		money += 200;
		
		System.out.println(money);
		
//		----------------------------------------------------------------------------
		int data = 10;
		
		// data = data + 1;
		// data += 1;
		data++;
		
		System.out.println(data);
		
//		----------------------------------------------------------------------------
		int num = 1;
		
		System.out.println(++num); // 사용 전 +1 증가 후 출력 >> 2
		
		System.out.println(num++); // 사용 후에 증가이므로 이때는 >> 1
		System.out.println(num); // 증가된 이후에 출력이므로 >> 2
	}
}
