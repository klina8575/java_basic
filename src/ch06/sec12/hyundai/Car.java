package ch06.sec12.hyundai;

//import 문으로 다른 패키지 클래스 사용을 명시
import ch06.sec12.hankook.SnowTire;
import ch06.sec12.kumho.AllSeasonTire;
import ch06.sec12.kumho.RainTire;
import ch06.sec12.kumho.project.Test;

public class Car {

	//컨트롤 + 스페이스바: 패키지 선택
	Test t = new Test();

	ch06.sec12.hankook.Tire tire1 = new ch06.sec12.hankook.Tire();
	ch06.sec12.kumho.Tire tire2 = new ch06.sec12.kumho.Tire();

	//컨트롤 + 스페이스바

	SnowTire tire3 = new SnowTire();
	AllSeasonTire tire4 = new AllSeasonTire();
	RainTire tire5 = new RainTire();
}