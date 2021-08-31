package Proje3;

import java.util.Scanner;

public class SubtractionSquare {

    /*

     /*

    Given one method name is substSquare

    This method get two ints as parameter

    return type is int

    Get  square of the sum of the numbers using getSumOfSquares method ,

    Parameter 1 square of the sum + Parameter 2 square of the sum  = your result

    for example:
    int 1 = 10

    int 2 = 5;

    3025 + 225 = 3250

    return 3250

     */




    /*
   substSquare isminde bir method verildiğinde
   bu method parametre olara iki int alır
   return tipi int olur
   Parametresi iki tane int ve return tipi int olan substSquare methodu oluşturun
   getSumOfSquares methodunu kullanarak


Parameter 1 toplamin karesi+Parameter 1 toplamin karesi= sonuc


   Örnek:

    int 1 = 10;              yazacağınız method 10 u kullanarak 3250 sonucu verir

    int 2 = 5;                yazacağınız method 5 i kullanarak 225 sonucu verir

    3025 + 225 = 3250

    return 3250
    */


    /*


    Create one method name is getSumOfSquares
    This method get one int as parameter
    Return type is int

    Find the sum of the numbers from 1 to your number
    Then find the square of the sum



    Parametresi bir tane int ve return tipi int olan getSumOfSquares methodu oluşturun.
    1 den girdiğiniz sayıya kadar olan sayıların toplamını bulun
    Sonra toplamın karesini bulun.



    for example:

    int is 10
     (1+2+...+10)²=55²=3025
     return 3025

     */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Birinci sayıyı giriniz :");
        int sayi1 =scan.nextInt();

        System.out.println("İkinci sayıyı giriniz :");
        int sayi2 =scan.nextInt();

        System.out.println(substSquare(sayi1,sayi2));


    }

    public static int substSquare(int s1,int s2){

        int kare1 = getSumOfSquares(s1);
        int kare2 = getSumOfSquares(s2);

        return kare1+kare2;
    }

    public static int getSumOfSquares(int s1){
        int tplm=0;

        for (int i = 1; i <= s1 ; i++) {
            tplm+=i;
        }

        return tplm*tplm;

    }










        /*
        Scanner sc= new Scanner(System.in);

        System.out.print("1.sayiyi giriniz: ");
        int sayi1 =sc.nextInt();

        System.out.print("2.sayiyi giriniz: ");
        int sayi2 =sc.nextInt();


        System.out.println(substSquare(sayi1,sayi2));
    }
    public static int substSquare(int s1,int s2){

        int kare1= getSumOfSquares(s1);
        int kare2= getSumOfSquares(s2);

        return kare1+kare2;
    }
    public static int getSumOfSquares(int s1){

        int tplm=0;

        for (int i=1; i<=s1; i ++){

            tplm+=i;

        }
        return tplm*tplm;

    }
*/


}
