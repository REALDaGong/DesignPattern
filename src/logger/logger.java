package logger;

public class logger {
    public static void println(String log,String patternName){

        String ClassName=Thread.currentThread().getStackTrace()[2].getClassName();
        String MethodName=Thread.currentThread().getStackTrace()[2].getMethodName();
        System.out.println(ClassName+":"+MethodName+":"+"[LOG]"+log+" [PATTERN]"+patternName);
    }
    public static void println(String log){
        String ClassName=Thread.currentThread().getStackTrace()[2].getClassName();
        String MethodName=Thread.currentThread().getStackTrace()[2].getMethodName();
        System.out.println(ClassName+":"+MethodName+":"+"[LOG]"+log);
    }
    public static void println(int log){
        String ClassName=Thread.currentThread().getStackTrace()[2].getClassName();
        String MethodName=Thread.currentThread().getStackTrace()[2].getMethodName();
        System.out.println(ClassName+":"+MethodName+":"+"[LOG]"+log);
    }
}
