package ch04.sec04;

public class SumFrom1To100Example {
	public static void main(String[] args) {
		//1~100 까지의 합계 구하기
		int sum = 0;
		int i;
			
		for(i=1; i<=100; i++) {
			sum += i;
		}
			
		System.out.println("1~" + (i-1) + " 합 : " + sum);
	}
 }