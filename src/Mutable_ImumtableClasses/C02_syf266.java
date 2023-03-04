package Mutable_ImumtableClasses;

import java.util.ArrayList;
import java.util.List;

public class C02_syf266 {
    public static void main(String[] args) {
       List<String> list=new ArrayList<>();
       list.add("one");
       list.add("two");
       // list.add(7);
       for (String s:list) System.out.print(s); // onetwo
    }
}
