package singleton;

public class LoggingClassTest {

    public static void main(String[] args) {

        LoggingClass instance1 = LoggingClass.getInstance();
        LoggingClass instance2 = LoggingClass.getInstance();
        System.out.println(instance1);
        System.out.println(instance2);

        if (instance1 == instance2){
            System.out.println("\nThese two objects point to the same memory location");
        } else {
            System.out.println("\nThese two objects do not point to the same memory location");
        }
    }
}