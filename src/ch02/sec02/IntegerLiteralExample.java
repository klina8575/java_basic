package ch02.sec02;

public class IntegerLiteralExample {
	public static void main(String[] args) {
		//2진수(0과 1로 작성): 1011 => 0b를 붙여서 작성
		int var1 = 0b1011; //2진수

		//8진수(0~7사이의 숫자로 작성): 206 =-> 0을 붙여서 작성
		int var2 = 0206; //8진수

		int var3 = 365; //10진수

		//16진수(0~9사이의 숫자와 a~f까지의 문자로 작성): B3 => 0x를 붙여서 작성
		int var4 = 0xB3; //16진수

		System.out.println("var1: " + var1);
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
	}
}