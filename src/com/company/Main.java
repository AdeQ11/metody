package com.company;

public class Main {


    public static void Zamiana(int tablica[], int a, int b) {
        int c = tablica[a];
        tablica[a] = tablica[b];
        tablica[b] = c;

    }


    public static void wypisywanieElementu(int tablica[]){
        for(int i = 0; i < 5; ++i) {
            System.out.print(tablica[i]);
        }
    }

    public static void main(String[] args) {

        int tablica[] = {2, 6, 3, 7, 8};
        wypisywanieElementu(tablica);
        System.out.print(" ");
        Zamiana(tablica, 0, 3);
        wypisywanieElementu(tablica);
    }


}

