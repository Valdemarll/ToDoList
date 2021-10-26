package Task2;

public class List<T> {
    private Element first;

    public void add(T value){
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

    public Element getElement(int index){
        int i = 0;
        if (first != null){
            Element currentElement = first;
            while (currentElement != null){
                if (i == index){
                    return currentElement;
                }
                currentElement = currentElement.getNext();
                i += 1;
            }
        }
        return null;
    }


    public void print(){
        Element currentElement = first;
        System.out.println();
        while (currentElement != null){
            System.out.println(currentElement.toString());
            currentElement = currentElement.getNext();
        }
    }

}