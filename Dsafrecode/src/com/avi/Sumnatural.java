package com.avi;

import java.util.Scanner;

public class Sumnatural {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n= read.nextInt();
        int result= suuum(n);
        System.out.println(result);
    }

    public static int suuum(int n){
        int sum=0;
        for (int i=0;i<=n;i++){
            sum =sum+i;
        }
        return sum;

    }

}
