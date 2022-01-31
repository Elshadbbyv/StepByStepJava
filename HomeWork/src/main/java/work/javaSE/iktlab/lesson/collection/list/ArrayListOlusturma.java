package work.javaSE.iktlab.lesson.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayListOlusturma {
    public static void main(String[] args) {
        ArrayList add = new ArrayList<>();
        add.add("Murad");
        add.add("Nurlan");
        add.add("Babek");
        add.add(0,"Cavid");
        // add.forEach(i-> System.out.println(i));
        Iterator iter = add.iterator();





        while (iter.hasNext()){
            System.out.println(iter.next());
        }
        LinkedList abc = new LinkedList();
        abc.add("Salam");
        abc.add(1,"Murad");
        abc.forEach(i-> System.out.println(i));
    }}
