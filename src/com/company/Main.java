package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int tab[][] = new int[3][3];
        int a = 0;
        int x = 0;
        int y = 0;

        for (int i = 0; i < tab.length; i++) {            // wypelnianie tablicy
            for (int i1 = 0; i1 < tab.length; i1++) {
                tab[i][i1]= a;
                a++;
            }
        }
        tab[0][1] = 3;  // zmiana jednego elementu ktory powinien wyjsc w porowniniu

//        for (int i = 0; i < tab.length; i++) {            // porownoje wszystko co sie da wiec nie ejst zle ale trzeba jeszcze wylapac powtarzzanie z samym sobą i nie wiem jak
//            for (int i1 = 0; i1 < tab.length; i1++) {
//                x = tab[i][i1];
//                for (int i2 = 0; i2 < tab.length; i2++) {
//                    for (int i3 = 0; i3 < tab.length; i3++) {
//                        y = tab[i2][i3];
//                        System.out.print("("+x+" "+y+")");
//                    }
//                    System.out.println("");
//                }
//                System.out.println("");
//            }
//        }

        for (int k = 0; k < 3; k++) {                    //nie porownoje wszystkich kombinacji
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.println(tab[k][i] +" "+ tab[k][j]);
                    if (tab[k][i] == tab[k][j] ){
                        //System.out.println(tab[k][i] +" "+ tab[k][j]);
                    }
                }
            }
        }

        for (int i = 0; i < tab.length; i++) {        // wyswietlanie tablicy
            for (int i1 = 0; i1 < tab.length; i1++) {
                System.out.print(tab[i][i1]);
            }
            System.out.println("");
        }
    }
}
