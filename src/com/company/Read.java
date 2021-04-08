package com.company;
import java.io.BufferedReader;
import java.io.InputStreamReader;

abstract class Read {

    static int Int(){

        int i = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите целочисленное значение:");
        try{
            i = Integer.parseInt(br.readLine());
        }catch(Exception ex){
            System.err.println("Ошибка");
        }

        return i;
    }

    static double Double(){

        double d = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите значение c точкой:");
        try{
            d = Double.parseDouble(br.readLine());
        }catch(Exception ex){
            System.err.println("Ошибка");
        }

        return d;
    }

    static String String(){

        String s = "";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите строку:");
        try{
            s = br.readLine();
        }catch(Exception ex){
            System.err.println("Ошибка");
        }

        return s;
    }

}