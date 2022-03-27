package com;

public class numberloop {

    public static void main(String[] args) {

        // create an array
        int[] number = new int[10];




        for (int i = 0; i < number.length; i++) {
            number[i] =number.length-1-i;}
        for (int c:number)
            System.out.println("arrary[]" + c +":" +number[c]);

        }

    }
