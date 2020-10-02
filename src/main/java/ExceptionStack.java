public class ExceptionStack {

    public static void main(String[] args) throws Exception {
        try {
            exceptionMethod1();
        }catch (Exception e) {
            e.printStackTrace();
            StackTraceElement [] ste = e.getStackTrace();
            System.out.println("STE trace");
            for(int i =0;i<ste.length;i++){
                System.out.println("STE"+ste[i]);
            }
            throw e;
        }
    }

    public static void exceptionMethod1() throws Exception {
        System.out.println("method1");
        try {
            exceptionMethod2();
        } catch (Exception e) {
            e.getMessage();
            throw e;
        }
    }

    public static void exceptionMethod2() throws Exception {
        System.out.println("method1");
        try {
            exceptionMethod3();
        } catch (Exception e) {
            e.getMessage();
            throw e;
        }
    }

    public static void exceptionMethod3() throws Exception {
        System.out.println("method1");
        try {
            exceptionMethod4();
        } catch (Exception e) {
            e.getMessage();
            throw e;
        }
    }
    public static void exceptionMethod4() throws Exception {
        System.out.println("method1");
        throw new Exception("exception from method 4");
    }
}
