package Proje3;

import java.util.Scanner;

public class ThreeEvenOdd {

    /*

    Given an int array as a parameter
    return true if the array contains either 3 even or 3 odd values .

    for Example:

    intArray([2, 1, 3, 5]) result should be true
    intArray([2, 1, 2, 5]) result should be  false
    intArray([2, 4, 2, 5]) result should be  true

     */


    /*

   Parametre int array olan threeEvenOrOdd methodu oluşturun.
   arrayiniz 3 tane çift veya 3 tane  tek değer içeriyorsa method  true değerini döndürür.


   Örnek:

   intArray([2, 1, 3, 5]) sonuc  true olmalı 2 1 3 5
   intArray([2, 1, 2, 5]) sonuc   false olmalı 2 1 2 5
   intArray([2, 4, 2, 5]) sonuc   true olmalı

    */
    public static void main(String[] args) {


        Scanner scan =new Scanner(System.in);
        System.out.println("Bir sayı dizisi giriniz.");
        String strSayi = scan.nextLine();

        String [] strDizi =strSayi.split(" ");
        int [] intDizi = new int[strDizi.length];

        for (int i = 0; i < strDizi.length; i++) {

            intDizi[i]=Integer.parseInt(strDizi[i]);

        }

        System.out.println(threeEvenOrOdd(intDizi));

    }


    public static boolean threeEvenOrOdd(int [] array){

        int tekSayi =0;
        int ciftSayi =0;


        for (int i = 0; i < array.length; i++) {

            if (array[i]%2==0)
                ciftSayi+=1;
            else tekSayi+=1;


        }
      //  System.out.println(ciftSayi);
       // System.out.println(tekSayi);


        if ((ciftSayi==3)||(tekSayi==3))
            return true;
        else return false;

    }

}
















        /*
        Scanner sc= new Scanner(System.in);
        System.out.print("Sayi dizisi giriniz: ");
        String strSayi=sc.nextLine();

        String [] strDizi= strSayi.split(" ");
        int[] intDizi=new int[strDizi.length];

        for(int i=0; i<strDizi.length;i++){

            intDizi[i]=Integer.parseInt(strDizi[i]);

        }

        System.out.println(threeEvenOrOdd(intDizi));
    }

    public static boolean threeEvenOrOdd(int[] array){

        int tekSayi=0;
        int ciftSayi=0;
        for(int i=0; i<array.length;i++){

            if(array[i]%2==0)
                ciftSayi+=1;
            else tekSayi+=1;

        }
        System.out.println(ciftSayi);
        System.out.println(tekSayi);

        if ((ciftSayi==3)||(tekSayi==3))
            return   true;
        else return false;


    }

}
*/