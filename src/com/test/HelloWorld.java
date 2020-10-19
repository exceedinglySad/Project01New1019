package com.test;

import java.util.LinkedList;
import java.util.List;

public class HelloWorld {

    public static final int INITAL_SIZE = 10;

    public HelloWorld() {
    }

    public static void main(String[] args) {
        String[] list = new String[]{"Lilei","Haimeimei","Liuruifang"};
        for (int i = 0; i < list.length; i++) {
            String s = list[i];
            System.out.println(s);
        }

        List<String> namelist = new LinkedList<String>();
        for (int i = 0; i < list.length; i++) {
            namelist.add(list[i]);
        }

        for (int i = namelist.size() - 1; i >= 0; i--) {
            System.out.println(namelist.get(i));
        }

        if (namelist == null) {
            System.out.println();
        }
        if (namelist != null) {
            System.out.println("哈哈哈");
        }

        if (namelist != null) {

        }
    }

    public void method() {
        System.out.println("HelloWorld.method");
    }
}
