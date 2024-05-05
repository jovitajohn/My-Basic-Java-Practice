package com.jovita.lib;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class MyClass {
   private static Scanner scn;

    public static void main(String[] args){

         scn = new Scanner(System.in);

        // print two numbers division and reminder
       // simpleArithematic();

        //read radius, print area and perimeter of a circle
        //areaOfCircle();

        //Convert decimal to binary
        //decimalToBinary();

        //find different types from a string
        findFromString();
    }

    public static void simpleArithematic(){
        System.out.println("Enter two numbers :");
        int a = scn.nextInt();
        int b = scn.nextInt();

        System.out.println(a+"/"+b +"="+a/b + "Reminder : "+ a%b);
    }

    public static void areaOfCircle(){
        System.out.println("Enter radius of the circle:");
        double radius = scn.nextInt();
        System.out.println("Area : "+radius * radius * Math.PI);
        System.out.println("Perimeter : "+ 2 * Math.PI * radius);
    }

    public static void decimalToBinary(){
        System.out.println("Enter a number:");
        int num = scn.nextInt();

        ArrayList<Integer> bi = new ArrayList<Integer>();
        while (num>0){
            bi.add( num % 2);
            num = num/2;
        }
        System.out.print("Binary : ");
        for(int i =bi.size()-1;i>=0;i--){
            System.out.print(bi.get(i));
        }
    }

    public static void findFromString(){
        System.out.println("Enter a String:");

        String line = scn.nextLine();
        char[] arr = line.toCharArray();
        int letter=0, digit =0, space = 0,other =0;
        for(int i=0;i<arr.length;i++){

            if(Character.isLetter( arr[i])){
                letter++;
            }else if(Character.isDigit(arr[i])){
                digit++;
            }else if(Character.isSpaceChar(arr[i])){
                space++;
            }else{
                other++;
            }
        }
        System.out.println("Letters : "+letter +"\nDigits : "+digit +"\nSpaces : "+space + "\nOthers : "+other);
    }
}