package Task2;

public class Element {
    private int value;
    private Element previous;

    public Element(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }
    public void setValue(int value){
        this.value = value;
    }

    public Element getPrevious() {
        return previous;
    }
    public void setPrevious(Element previous) {
        this.previous = previous;
    }

    public String toString(){
        return value + "";
    }
}
