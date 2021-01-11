package Jihe.src;

import java.util.ArrayList;
import java.util.List;

public class Jihe {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add(77);
        list.add("水电站");
        list.add(186f);
        list.add(77);
        System.out.println("当前集合元素的个数："+list.size());
        System.out.println("List集合内的元素：");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
