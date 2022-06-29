package com.Faraz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListAC {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<String> listS = new ArrayList<String>();
        ArrayList<Boolean> listN = new ArrayList<Boolean>();
        list.add(1);
        list.add(2);
        list.add(3);
        //System.out.println(Arrays.toString(list.toArray()));
        System.out.println(list);
        System.out.println(list.get(0));

        list.add(1,9);
        System.out.println(list);
        list.add(3,9);
        System.out.println(list);

        list.remove(1);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);

        list.set(0,3);
        System.out.println(list);
        list.set(2,1);
        System.out.println(list);
        System.out.println("Size: "+list.size());

        System.out.println("Printing through loop: ");
        for(int i=0; i<list.size();i++){
            System.out.print(list.get(i)+"\t");
        }
        System.out.println("\nSorting: ");
        Collections.sort(list);
        System.out.println(list);


    }
}
