package Task2;

public class Iterator {
    private List list;
    private int index = 0;


    public Iterator(List list){
        this.list = list;
    }
    public boolean hasNext(){
        if (list.getElement(index).getNext() != null){
            return true;
        } else{
            return false;
        }
    }

    public Object getElement(){
        return list.getElement(index);
    }
    public void next(){
        this.index += 1;
    }


    public String circle(int max){
        String result = "";
        while (index < max){
            result += getElement() + "\n";
            if (hasNext()){
                next();
            } else{
                break;
            }
        }
        return result;
    }



    public int getIndex() {
        return index;
    }
    public void setIndex(int index) {
        this.index = index;
    }
}
