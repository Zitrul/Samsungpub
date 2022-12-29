package com.example.samsung.myapplication;

import java.util.ArrayList;

public class Base {
    public static ArrayList number = new ArrayList<>();
    public static ArrayList cost = new ArrayList<>();
    public static ArrayList name = new ArrayList<>();
    public static ArrayList data = new ArrayList<>();

    public static int findnumber(String name1) {
        int n = -1;
        String[] array = new String[name.size()];
        name.toArray(array);

        for (int i = 0; i < name.size(); i++) {
            if (array[i] == name1) {
                n = i;
            }
        }
        if (n == -1) {
            return -1;
        }
        Integer[] array1 = new Integer[number.size()];
        number.toArray(array);

        return array1[n];
    }

    public static int findcost(String name1) {
        int n = -1;
        String[] array = new String[name.size()];
        name.toArray(array);

        for (int i = 0; i < name.size(); i++) {
            if (array[i] == name1) {
                n = i;
            }
        }
        if (n == -1) {
            return -1;
        }
        Integer[] array1 = new Integer[cost.size()];
        cost.toArray(array);

        return array1[n];
    }

    public static String finddata(String name1) {
        int n = -1;
        String[] array = new String[name.size()];
        name.toArray(array);

        for (int i = 0; i < name.size(); i++) {
            System.out.println(array[i]+name1);
            System.out.println(name1.getClass().getName());
            String a = array[i];

            if (a.equals(name1)) {
                System.out.println("HELLO");
                n = i;
            }
        }

        if (n == -1) {
            return "-1";
        }
        String[] array1 = new String[data.size()];
        cost.toArray(array);

        return array1[n];
    }

    public static void add1(int number1, int cost1, String name1, String data1) {
        number.add(number1);
        cost.add(cost1);
        name.add(name1);
        data.add(data1);

    }

}
