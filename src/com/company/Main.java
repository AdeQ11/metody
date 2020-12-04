package com.company;

public class Main {

    static int znajdzMin(int tab[], int od) {

        int min = od;
        for (int i = od; i < tab.length; i++) {
            if (tab[min] > tab[i]) {
                min = i;
            }
        }
        return min;
    }


    public static void main(String[] args) {
        int tab[] = {2, 5, 0, 1, 6};
        System.out.print(znajdzMin(tab, 0));
    }
}


