package Task1;

public class Queue {
    private Element first;

    public void add(int value){
        Element newElement = new Element(value);
        if (first == null){
            first = newElement;
        }else{
            Element currentElement = first;
            while (currentElement.getNext() != null){
                currentElement = currentElement.getNext();
            }
            currentElement.setNext(newElement);
        }
    }

    public Element getElement(){
        return first;
    }

    public void delete(){
        first = first.getNext();
    }


    public void print(){
        Element currentElement = first;
        while (currentElement != null){
            System.out.println(currentElement.toString());
            currentElement = currentElement.getNext();
        }
    }
}
