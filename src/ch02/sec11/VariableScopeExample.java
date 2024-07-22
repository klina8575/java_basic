package ch02.sec11;

public class VariableScopeExample {
	public static void main(String[] args) {
		int v1 = 15;
		if(v1 > 10) {
			int v2 = v1 - 10; //v1은 main 블록범위 안에 존재
		}
		int v3 = v1 + v2 + 5; //블록 내부에 선언된 v2 변수를 사용할 수 없기 때문에 컴파일 에러 발생
	}
}