package Task3;

import Task1.Element;

public class List {
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

    public void reverse(){
        Element currentElement = first;
        if (first != null){
            Element prevEl = currentElement;
            Element nextEl;
            currentElement = currentElement.getNext();
            prevEl.setNext(null);
            while (currentElement != null){
                nextEl = currentElement.getNext();

                currentElement.setNext(prevEl);

                prevEl = currentElement;
                first = currentElement;
                currentElement = nextEl;
            }
        }
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
