package Jihe.src;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDom {
    public static void main(String[] args) {
        Set set=new HashSet();
        set.add(77);
        set.add("阿猫阿狗");
        set.add(180f);
        set.add(false);
        set.add(77);
        System.out.println("size的长度:"+set.size());
        Iterator integer=set.iterator();
        System.out.println("Set集合内的元素：");
        while(integer.hasNext()){
            System.out.println(integer.next());
        }
    }
}
