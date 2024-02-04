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

        System.out.print("int형 숫자 입력: ");
        int inputInt = scanner.nextInt();
        System.out.println(inputInt);

        System.out.print("Double형 입력: ");
        Double inputDouble = scanner.nextDouble();
        System.out.println(inputDouble);

        System.out.print("boolean형 입력: ");
        Boolean inputBoolean = scanner.nextBoolean();
        System.out.println(inputBoolean);

    }
}
