package ch12.sec12;

public class Service {

    @PrintAnnotation
    public void method1() {}

    @PrintAnnotation(value = "*")
    public void method2() {}

    @PrintAnnotation(number = 20, value = "#")
    public void method3() {}
}
