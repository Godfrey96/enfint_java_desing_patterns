package singleton;

public class LoggingClass {

    private static LoggingClass instance;
    private LoggingClass(){}

    public static LoggingClass getInstance(){
        if (instance == null){
            instance = new LoggingClass();
        }
        return instance;
    }

}
