package ch02.sec01;

public class VariableInitializationExample {
	public static void main(String[] args) {
		//변수 선언(메모리에 값이 할당 X)
		int age;

		age = 20; //메모리에 값이 할당된다

		//변수 선언과 동시에 메모리에 값 할당
		double score = 90.22;

		System.out.println("age 값: " + age); //ctrl + d:라인복사
		System.out.println("score 값: " + score);
	}
}