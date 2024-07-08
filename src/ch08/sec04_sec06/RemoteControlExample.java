package ch08.sec04_sec06;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc;

        rc = new Television();
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();

        rc.setMute(true);
        rc.setMute(false);

        System.out.println();

        rc = new Audio();
        rc.turnOn();
        rc.setVolume(15);

        System.out.println();
        rc.setMute(true);
        rc.setMute(false);

        RemoteControl.changeBattery();
    }
}
