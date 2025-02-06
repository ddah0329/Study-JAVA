package a_switch;

import java.util.Scanner;

public class _02_switch_MBTI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String msg = """
			    당신의 mbti는?
			    1. ISFJ
			    2. INFJ
			    3. ESFP
			    4. ENTJ
			    선택 >> """;
		
		String isfj = "차분하고 인내심이 강하다", 
			    infj = "통찰력이 높고 사람들에게 영감을 준다",
			    esfp = "호기심이 많고 개발적이다",
			    entj = "철저히 준비하고 활동적이다",
			    errMsg = "잘못 입력하셨습니다";

		
		System.out.println(msg);
		int insert = sc.nextInt();
		
		switch (insert) {
			case 1: System.out.println(isfj); break;
			case 2: System.out.println(infj); break;
			case 3: System.out.println(esfp); break;
			case 4: System.out.println(entj); break;
			default: System.out.println(errMsg);
		}
	}
}