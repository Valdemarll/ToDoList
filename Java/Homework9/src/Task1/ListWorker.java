package Task1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListWorker {
    List list;

    ListWorker(List list){
        this.list = list;
    }

    public List getList() {
        return list;
    }
    public void setList(List list) {
        this.list = list;
    }

    public String toString(){
        String result = "[";
        for (int i = 0; i < this.list.size(); i++){
            result += list.get(i) + ", ";
        }
        result += "]";
        return result;
    }

    public Object getRepeatedElement(){
        Set set = this.getUniqueList();
        for (int i = 0; i < set.size(); i++){
            if (set.toArray()[i] != this.list.get(i)) {
                return this.list.get(i);
            }
        }
        return this.getTheLastElement();
    }

    private Object getTheLastElement(){
        int index = 0;
        for (int i = 0; i < this.list.size(); i++){
            index = i;
        }
        return this.list.get(index);
    }

    private Set getUniqueList() {
        Set<Object> set = new HashSet<>();
        for (Object element : this.list){
            set.add(element);
        }
        return set;
    }

}
