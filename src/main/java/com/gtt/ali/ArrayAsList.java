package com.gtt.ali;

import java.util.Arrays;
import java.util.List;

/**
 * Created by qumingyang on 2019/4/11.
 */
public class ArrayAsList {

    public static void main(String[] args) {
        String[] stringArray = new String[3];
        stringArray[0] = "one";
        stringArray[1] = "two";
        stringArray[2] = "three";

        List<String> stringList = Arrays.asList(stringArray);
//
//        stringList.set(0,"oneList");
//
//        System.out.println(stringArray[0]);

        stringList.add("four");


        stringList.remove(2);
        stringList.clear();


        System.out.println("1111");
    }
}
