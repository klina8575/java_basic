package ch09.sec07.exam01;

public class Car {
    //필드에 tire객체 대입
    private Tire tire1 = new Tire();

    //필드에 금호타이어 객체 대입
    private Tire tire2 = new Tire() { //금호타이어 클래스(이름이 없는 클래스 이므로 객체도 이름이 X)
        @Override
        public void roll() {
            System.out.println("금호타이어가 회전합니다.");
        }
    };

    public void run1() {
        tire1.roll();
        tire2.roll();
    }

    public void run2() {
        Tire tire = new Tire() { //한국 타이어 클래스
            @Override
            public void roll() {
                System.out.println("한국타이어가 회전합니다.");
            }
        };

        tire.roll();
    }

    //메소드(매개변수로 익명객체를 넘겨줌)
    public void run3(Tire tire) {
        tire.roll();
    }

}
