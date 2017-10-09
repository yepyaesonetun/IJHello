package inJava7;

public class MainClass implements MyInterface {

    @Override
    public void method() {
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        MyInterface instance = new MainClass();
        instance.method();
    }
}
