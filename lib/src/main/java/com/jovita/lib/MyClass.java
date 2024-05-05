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
        //findFromString();

        //Reverse a String
       // reverseString();

        //Multiplication of corresponding elements in two arrays
       // multiplyTwoArray();

        //find even and odd from integer array
       // findEvenOddFromArray();

        //Number pyramid
        //numberPyramid();

        //Add two matrices
       // addTwoMatrices();

        //calculate array average
        calculateArrayAverage();


    }

    private static void calculateArrayAverage() {

        System.out.println("Enter number of elements :");
        int n = scn.nextInt();
        int[] arr = new int[n];
        int sum =0;
        System.out.println("Enter elements : ");
        for(int i =0;i<n;i++){
            arr[i] = scn.nextInt();
            sum += arr[i];
        }
        double avg = (double) sum /n;
        System.out.println("Average : "+avg);
    }

    private static void addTwoMatrices() {
        int rows,colunms;
        System.out.println("Enter no:of rows :");
        rows = scn.nextInt();
        System.out.println("Enter no:of columns :");
        colunms = scn.nextInt();

        int[][] mat1 = new int[rows][colunms];
        int[][] mat2 = new int[rows][colunms];
        int[][] sum = new int[rows][colunms];

        System.out.println("Enter first matrix:");

        for(int i=0;i<rows;i++){
            for(int j =0;j<colunms;j++){
                mat1[i][j]=scn.nextInt();
            }
        }

        System.out.println("Enter second matrix:");

        for(int i=0;i<rows;i++){
            for(int j =0;j<colunms;j++){
                mat2[i][j]=scn.nextInt();
                sum[i][j] = mat1[i][j]+mat2[i][j];
            }
        }

        System.out.println("Sum Matrix : ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<colunms;j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }



    }

    private static void numberPyramid() {
        System.out.println("Enter a number: ");

        int n = scn.nextInt();
        for(int i=1;i<=n;i++){
            int gap = n-i;

            for(int k=0;k<gap;k++){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.print("\n");
        }
    }

    private static void findEvenOddFromArray() {

        System.out.println("Enter array length:");
        int length = scn.nextInt();
        int[] arr = new int[length];
        int even=0,odd=0;
        System.out.println("Enter array elements separated with space :");
        for(int i=0;i<length;i++){
            arr[i] = scn.nextInt();
            if(arr[i]%2 == 0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("no of even no: "+even + "\nNunmber of odd no: "+odd);

    }

    private static void multiplyTwoArray() {

        System.out.println("Enter array length :");
        int length = scn.nextInt();

        System.out.println("Enter first array elements separated by space:");
        ArrayList<Integer> arr1 = new ArrayList<>();
       for(int i=0;i<length;i++){
           arr1.add(scn.nextInt());
       }

        System.out.println("Enter second array elements separated by space");
        ArrayList<Integer> arr2 = new ArrayList<>();
        for(int i=0;i<length;i++){
            arr2.add(scn.nextInt());
        }

        for(int i =0 ;i<arr1.size();i++){
            System.out.print(arr1.get(i)*arr2.get(i)+" ");
        }

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

    public static void reverseString(){
        System.out.println("Enter a string to reverse :");
        String s = scn.nextLine();

        char[] strChar = s.toCharArray();

        for(int i=strChar.length-1;i>=0;i--){
            System.out.print(strChar[i]);
        }
    }
}