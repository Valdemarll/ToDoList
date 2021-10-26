package Task3;

import java.util.List;

public class Iterator {
    private List list;
    private int index = 0;
    private boolean needDelete = false;


    public Iterator(List list){
        this.list = list;
    }

    public Object getElement(){
        return list.get(index);
    }
    public void next(){
        this.index += 1;
    }


    public Object countingRhyme(){
        while (list.size() > 1) {
            while (index < list.size()) {
                if (needDelete) {
                    list.remove(index);
                } else {
                    next();
                }
                needDelete = !(needDelete);

            }
            index = 0;
        }
        return list.get(0);
    }

}
