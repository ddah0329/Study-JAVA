package c_loop;

public class _02_practice {
	public static void main(String[] args) {
		System.out.println("실습 1번");
		
		for (int i = 1; i < 101; i++) {
			System.out.print(i+ " ");
			if (i % 10 == 0) {
				System.out.println("");
			}
		}
		
		System.out.println("\n실습 2번");
		
		int count = 0;
		
		for (int i = 100; i > 0; i--) {
		    System.out.print(i + " ");
		    count ++;
		    
		    if (count == 10) {
		    	System.out.println("");
		    	count = 0; // 초기화
		    }
		}
		
		System.out.println("\n실습 3번");
		
		for (int i = 0; i < 101; i+=2) {
			System.out.print(i+ " ");
			count ++;
		    
		    if (count == 10) {
		    	System.out.println("");
		    	count = 0; // 초기화
		    }
		}
		
		System.out.println("\n\n실습 4번");
		int j = 0;
		for (int i = 0; i <= 10; i++) {
			j += i;
		}
		System.out.println(j);
		
		
		System.out.println("\n실습 5번");	
		int p =0;
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 1) {
				p += i;
			}
		}
		System.out.println(p);
	}
}
