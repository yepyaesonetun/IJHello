package inJava8;

public interface MyInterface {
    public abstract void method1();

    public default void method2(){
        System.out.println("default method");
    }

    public static void method3(){
        System.out.println("static method");
    }
}
