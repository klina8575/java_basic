package ch04.sec03;

public class SwitchNoBreakCaseExample {
	public static void main(String[] args) {
		int time = (int)(Math.random()*4) + 8;  //8~11시 랜덤한 시간
		System.out.println("[현재시간: " + time + " 시]");
		
		switch(time) { //switch(값) => 실수형, boolean 사용X
			case 8:
				System.out.println("출근합니다.");
			case 9:
				System.out.println("회의를 합니다.");
			case 10:
				System.out.println("업무를 봅니다.");
			default:
				System.out.println("외근을 나갑니다.");
		}
	}
}