package Task2;

public class NewQueueElement<T> {
    private T value;
    private NewQueueElement next;

    public NewQueueElement(T value){
        this.value = value;
    }

    public T getValue(){
        return value;
    }
    public void setValue(T value){
        this.value = value;
    }

    public NewQueueElement getNext() {
        return next;
    }
    public void setNext(NewQueueElement next) {
        this.next = next;
    }

    public String toString(){
        return value + "";
    }
}