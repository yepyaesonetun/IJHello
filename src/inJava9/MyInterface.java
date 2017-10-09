package inJava9;

public interface MyInterface {
    public abstract void method1();

    public default void mehtod2(){
        method4();  // private default inside - rule no.1
        method5();  // static method inside other non-static method
    }

    public static void method3(){
        method5();  // static method inside other static method
        System.out.println("static method");
    }

    private void method4(){
        System.out.println("private method");
    }

    private static void method5(){
        System.out.println("private static method");
    }
}
