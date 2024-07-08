package ch13.sec02.exam02;

public class GenericExample {
    public static void main(String[] args) {
        Rentable<Home> homeAgency = new HomeAgency();
        Home home = homeAgency.rent();
        home.turnOnLight();

        Rentable<Car> carAgency = new CarAgency();
        Car car = carAgency.rent();
        car.run();
    }
}
