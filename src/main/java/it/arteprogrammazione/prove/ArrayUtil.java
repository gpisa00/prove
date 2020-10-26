package it.arteprogrammazione.prove;

import java.util.Random;

public final class ArrayUtil {

    public static void stampaArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void stampaMatrice(int[][] arr) {
        //Cycles through rows
        for (int row = 0; row < arr.length; row++) {
            //Cycles through columns
            for (int col = 0; col < arr[row].length; col++) {
                System.out.printf("%5d", arr[row][col]); //change the %5d to however much space you want
            }
            System.out.println(); //Makes a new row
        }
    }

    public static void primoTipoDiInizializzazione(int[] array1) {
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 5;
        array1[3] = 3;
        array1[4] = 4;
    }

    public static int[] secondoTipoDiInizializzazione() {
        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        return array2;
    }

    public static int[] tipoDiInizializzazioneRandom(int length) {
        int[] myints = new int[length];
        Random ran = new Random();
        for (int i = 0; i < myints.length; i++) {
            myints[i] = ran.nextInt(length);
            System.out.println(myints[i]);
        }
        return myints;
    }


    public static void primoTipoDiInizializzazioneMatrice(int[][] array1) {
        array1[0][0] = 1;
        array1[0][1] = 2;
        array1[1][0] = 5;
        array1[1][1] = 3;
    }

    public static int[][] secondoTipoDiInizializzazioneMatrice() {
        int[][] array2 = {{1, 2, 3}, {4, 5, 6,}, {7, 8, 9}, {10, 11, 12}};
        return array2;
    }

    public static int[][] tipoDiInizioalizzazioneMatriceRandom(int rowLength, int colLength) {
        int[][] myints = new int[rowLength][colLength];
        Random ran = new Random();
        //Cycles through rows
        for (int row = 0; row < myints.length; row++) {
            //Cycles through columns
            for (int col = 0; col < myints[0].length; col++) {
                myints[row][col] = ran.nextInt(10);
            }
        }
        return myints;
    }

    public static void stampaMinimoArray(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Minimo = " + min);
    }

    public static void stampaCorniceMatrice(int[][] matrice) {
        int n = matrice.length;
        int m = matrice[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == m - 1) {
                    System.out.printf("%5d", matrice[i][j]);
                } else {
                    System.out.printf("%5s"," ");
                }
            }
            System.out.println();
        }

    }

}


//public static void stampaDiagonaleMatrice(int length){}
//public static void stampaMassimoArray(int[] array){}

//livello superiore
//public static int[] ordinaArray(int[] array){}

