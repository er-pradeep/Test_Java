package exception;

public class ParentClass {

    public static void main(String[] args) {
        ChildClass cc = new ChildClass();
        try {
            cc.throwException();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


class ChildClass{

    public void throwException() throws Exception{
        try{
            int x = 5/0;
        }catch(Exception e) {
            //e.printStackTrace();
            throw new Exception();
        }
    }
}