package Task4;

public class Writer<T extends Writable>{
    public String write(){
        return T.write();
    }

}
