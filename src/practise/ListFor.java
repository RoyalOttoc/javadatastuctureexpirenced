package practise;

import java.util.ArrayList;
import java.util.List;

public class ListFor {
    public static void main(String[] args){
        List<Integer> temp=new ArrayList<>();
        temp.add(1);
        temp.add(2);
        temp.add(3);
        temp.add(4);
        temp.add(5);
        temp.add(6);
        System.out.println("The list size is " + temp.size());
        for(Integer a:temp){
            System.out.println(a);
        }

    }
}
