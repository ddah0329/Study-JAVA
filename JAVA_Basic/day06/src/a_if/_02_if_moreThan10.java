/*
 * 정수를 입력받아 정수가 10보다 큰 수인지, 작은 수인지 판별
 */

package a_if;

import java.util.Scanner;

public class _02_if_moreThan10 {
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	System.out.print("정수 입력 >>");
	int insert = sc.nextInt();
	
	int maxNum = 10;

	if( insert < maxNum) {
		System.out.println(insert + "는 " + maxNum + "보다 작다");
	}
	if( insert > maxNum) {
		System.out.println(insert + "는 " + maxNum + "보다 크다");
	}
	if( insert == maxNum) {
		System.out.println(insert + "는 " + maxNum + "과 같다");
	}
		
	}
}
