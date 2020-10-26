package it.arteprogrammazione.prove;

public class Main {

    public static void main(String[] args) throws Exception {

        //------------------------------------------------------------------------

        System.out.println("################# ARRAY 1 ################");
        int[] array1 = new int[5];
        ArrayUtil.primoTipoDiInizializzazione(array1);
        ArrayUtil.stampaArray(array1);

        //------------------------------------------------------------------------

        System.out.println("################# ARRAY 2 ################");
        int[] array2 = ArrayUtil.secondoTipoDiInizializzazione();
        ArrayUtil.stampaArray(array2);

//        //------------------------------------------------------------------------
//
        System.out.println("################# ARRAY 3 ################");
        int[] array3 = ArrayUtil.tipoDiInizializzazioneRandom(10);
//        ArrayUtil.stampaArray(array3);

        ArrayUtil.stampaMinimoArray(array3);
//
        //------------------------------------------------------------------------
        System.out.println("------------------------------------------------------------------------");


        System.out.println("################# MATRICE 1 ################");
        int[][] matrice1 = new int[2][2];
        ArrayUtil.primoTipoDiInizializzazioneMatrice(matrice1);
        ArrayUtil.stampaMatrice(matrice1);

        //------------------------------------------------------------------------

        System.out.println("################# MATRICE 2 ################");
        int[][] matrice2 = ArrayUtil.secondoTipoDiInizializzazioneMatrice();
        ArrayUtil.stampaMatrice(matrice2);

        //------------------------------------------------------------------------

        System.out.println("################# MATRICE 3 ################");
        int[][] matrice3 = ArrayUtil.tipoDiInizioalizzazioneMatriceRandom(8,5);
        ArrayUtil.stampaMatrice(matrice3);
        System.out.println("------------------------------------------------------------------------");
        ArrayUtil.stampaCorniceMatrice(matrice3);

        //------------------------------------------------------------------------





    }









}
