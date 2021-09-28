package Task2;

public class Stack {
    private Element last;

    public void add(int value){
        Element newElement = new Element(value);
        newElement.setPrevious(last);
        last = newElement;
    }

    public Element getElement(){
        return last;
    }

    public void delete(){
        last = last.getPrevious();
    }

    public void print(){
        Element currentElement = last;
        while (currentElement != null){
            System.out.println(currentElement.toString());
            currentElement = currentElement.getPrevious();
        }
    }
}
