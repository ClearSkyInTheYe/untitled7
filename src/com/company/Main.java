package com.company;

public class Main {
   // + = - * / != == < > <= >= % && ||
    //++ -- !
    public static void main(String[] args) {

       int[] a = new int[20];

        for (int i = 0; i <20 ; i++) {

            a[i] = i;

        }

        arrayOut(a);

        System.out.println( arrayMax(a));











    }


    static void arrayOut(int[] a) {

        for (int i = 0; i < a.length; i++) {


            if (i == a.length - 1) {

                System.out.print(a[i]);

            } else {

                System.out.print(a[i] + ",");

            }


        }


    }


    static int arrayMax(int[] a){

        int  b = a[0];

        for (int i = 0; i <a.length ; i++) {

          if(b < a[i]){

              b = a[i];
          }


        }

        return b;

    }


}


