package ch06.sec08.exam03;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car(); //Car 객체 생성
		myCar.setGas(5); //주유
		System.out.println("현재 기름의 양: " + myCar.gas);

		//isLeftGas() 메소드를 호출해서 받은 리턴값이 true일 경우 if 블록 실행
		if(myCar.isLeftGas()) {
			System.out.println("출발합니다.");
			myCar.run();
		}

		System.out.println("기름을 주유하세요.");
	}
}