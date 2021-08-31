package Proje3;

import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {



    /*
       First letter to upper case
        parameter is one String
        return type is String
        words are delimited by a space.
        All the words first letter should be camel case

       For Example:

            my family live in united states

      Result should be

            My Family Live In United States

     */

    /*
           camelcase adında Kendisine gönderilen bir cümledeki kelimelerin ilk karakterlerini
           büyük harfe çevirip geri döndüren metodun yazınız.

           Örnek:  bugün hava çok güzel    Result : Bugün Hava Çok Güzel

     */


        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();

        System.out.println(camelcase(text));

    }

    public static String camelcase(String str){

        String [] kelimeler =str.split(" ");
        String mesaj="";

        for (int i = 0; i < kelimeler.length; i++) {
            kelimeler[i]=kelimeler[i].substring(0,1).toUpperCase()+kelimeler[i].substring(1);
        }

        for (int i = 0; i <kelimeler.length ; i++) {

            mesaj+=kelimeler[i];

            if(i< kelimeler.length-1)
                mesaj+=" ";
        }

        return mesaj;



    }





}




























        /*
        Scanner sc= new Scanner(System.in);
        String text = sc.nextLine();

        System.out.println(camelcase(text));


    }
        public static String camelcase (String str){

            String[] kelimeler = str.split(" ");
            String mesaj = "";

            for (int i = 0; i < kelimeler.length; i++) {

                kelimeler[i] = kelimeler[i].substring(0, 1).toUpperCase() + kelimeler[i].substring(1);

            }

            for (int i = 0; i < kelimeler.length; i++) {
                mesaj += kelimeler[i];

                if (i < kelimeler.length - 1)
                    mesaj += " ";
            }

            return mesaj;
        }

*/
