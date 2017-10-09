package inJava9;

public class MainClass implements MyInterface{

    @Override
    public void method1() {
        System.out.println("abstract method");
    }

    public static void main(String[] args) {
        MyInterface instance = new MainClass();
        instance.method1();
        instance.mehtod2();
        MyInterface.method3();
    }
}
