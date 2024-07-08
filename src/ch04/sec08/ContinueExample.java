package ch04.sec08;

public class ContinueExample {
	public static void main(String[] args) throws Exception {
		for(int i=1; i<=10; i++) {
			if(i%2 != 0) { //홀수라면 for 반복문으로 되돌아가기
				continue;
			}
			System.out.print(i + " "); //짝수 출력
		}
	}
}