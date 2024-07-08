package ch02.plus.scanner;

import java.util.Scanner;

public class ScannerExamplePlus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("nextLine() 입력: ");
        String inputNextLine = scanner.nextLine();
        System.out.println(inputNextLine);

        System.out.print("next() 입력: ");
        String inputNext = scanner.next();
        System.out.println(inputNext);

        System.out.print("int형 숫자 입력: "); //int타입으로 값을 입력 받음
        int inputInt = scanner.nextInt();
        System.out.println(inputInt);

        System.out.print("Double형 입력: "); //double타입으로 값을 입력 받음
        Double inputDouble = scanner.nextDouble();
        System.out.println(inputDouble);

        System.out.print("boolean형 입력: ");
        Boolean inputBoolean = scanner.nextBoolean(); //boolean 타입으로 입력받음
        System.out.println(inputBoolean);

    }
}
