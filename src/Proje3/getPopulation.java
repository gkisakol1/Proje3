package Proje3;

import java.lang.reflect.Array;
import java.util.Scanner;

public class getPopulation {
    public static void main(String[] args) {



    /*
        Method name is populationOfCountry

        This method will get 1 String array(countryNames) 1 int array (countryPopulations) and 1 String (str)

        countryNames is Country names

        countryPopulations is Country population

        if str is contained in the countryNames return the population


        For example:

        countryNames = {"USA" ,"Mexico" ,"Canada"}

        countryPopulations = {100000 , 120000 , 130000}

        str = "Mexico"

        return should be 120000

        NOTE : if str is not in the countryNames array return -1






     */


    /*
    Method adı populationOfCountry
    Bu method 1 String array(countryNames) , 1 int array (countryPopulations) ve  1 String (str) alacak

     countryNames Ülke isimleri

     countryPopulations Ülke nüfusları

      Eğer str Ülke isimleri içeriyorsa  Ülke nüfusunu return et

      Ornegin;

        countryNames = {"USA" ,"Mexico" ,"Canada"}

        countryPopulations = {100000 , 120000 , 130000}

        str = "Mexico"

        return 120000 olmali

        NOT : eger str icin verilen ulke countryNames icinde yoksa return -1 olmali


     */

        String[] countryNames = {"USA", "Mexico", "Canada"};
        int[] countryPopulations = {100000, 120000, 130000};

        Scanner scan = new Scanner(System.in);
        String country = scan.nextLine();

        System.out.println(populationOfCountry(countryNames, countryPopulations, country));


    }



  public static int populationOfCountry(String [] str, int [] num, String ulkeler){

         int nufus =0;

            for (int i = 0; i < str.length; i++) {

                if (str[i].equalsIgnoreCase(ulkeler))
                    nufus =num[i];
            }

            if (nufus<1){
                nufus=-1;
            }

      return nufus;
        }














    }
/*
    public static int populationOfCountry(String[] str, int[] sayilar, String country) {
        int nufus = 0;

        for (int i = 0; i < str.length; i++) {

            if (str[i].toLowerCase().contains(country))
                nufus = sayilar[i];

        }

        if (nufus<1) { nufus=-1;}

        return nufus;
    }

/*

        String[] countryNames = {"USA", "Mexico", "Canada"};

        int[] countryPopulations = {100000, 120000, 130000};

        Scanner sc = new Scanner(System.in);
        String country = sc.nextLine();

        System.out.println(populationOfCountry(countryNames, countryPopulations, country));
 */
