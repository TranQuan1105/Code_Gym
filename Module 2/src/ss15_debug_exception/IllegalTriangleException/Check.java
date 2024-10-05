package ss15_debug_exception.IllegalTriangleException;

public class Check extends Exception {
    public Check (){
        super("Loi");
    }
    public Check (String msg){
        super(msg);
    }

}