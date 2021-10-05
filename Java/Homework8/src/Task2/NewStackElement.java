package Task2;

public class NewStackElement<T> {
    private T value;
    private NewStackElement previous;

    public NewStackElement(T value){
        this.value = value;
    }

    public T getValue(){
        return value;
    }
    public void setValue(T value){
        this.value = value;
    }

    public NewStackElement getPrevious() {
        return previous;
    }
    public void setPrevious(NewStackElement previous) {
        this.previous = previous;
    }

    public String toString(){
        return value + "";
    }
}
