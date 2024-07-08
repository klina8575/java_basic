package ch04.sec03;

public class SwitchValueExample {
	public static void main(String[] args) {
		String grade = "B";
		
		//Java 11 이전 문법
		int score1 = 0;
		switch(grade) {
		    case "A":
		    	score1 = 100;
		    	break;
		    case "B":
		    	int result = 100 - 20;
		    	score1 = result;
		    	break;
		    default:
		    	score1 = 60;
		}
		System.out.println("score1: " + score1);
		
		//Java 12부터 가능
		int score2 = switch(grade) {
			case "A" -> 100;
			case "B" -> {
				int result = 100 - 20;
				yield result; //연산식이나 다른 코드 실행 후 값을 저장해야 할시 yield를 사용
			}
			default -> 60;
		};
		System.out.println("score2: " + score2);
	}
}