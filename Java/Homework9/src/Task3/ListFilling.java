package Task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListFilling {
    private int elementAmount;

    public ListFilling(){
    }

    public void setElementAmount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько должно быть элементов в списке?");

        this.elementAmount = scanner.nextInt();
    }

    public List fillUp(int max){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < max; i++){
            list.add(new Integer(i));
        }
        return list;
    }
}
