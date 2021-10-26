package Task5;

import java.util.*;

public class DownSorting {
    private ArrayList<Integer> list;

    public DownSorting(){
    }

    public ArrayList<Integer> getList() {
        return list;
    }
    public void setList(ArrayList<Integer> list) {
        this.list = list;
    }

    public void fillNumbers(){
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++){
            System.out.println("Введите число");
            list.add(scanner.nextInt());
        }
    }

    public ArrayList sorting() {
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 > o2 ? -1 : 1;
            }
        });
        return list;
    }

    public String toString(){
        String result = "[";
        for (int i = 0; i < list.size(); i++){
            result += list.get(i) + ", ";
        }
        result += "]";
        return result;
    }
}
