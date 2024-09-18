package com.avi;

public class TimeComplexity {
    public static void main(String[] args) {
        double now =System.currentTimeMillis();

        TimeComplexity demo =new TimeComplexity();
        System.out.println(demo.finSum(99999));

        System.out.println("Time Taken -" +(System.currentTimeMillis()-now)+"millisecs");
    }
    public int finSum(int n){
        return n*(n+1)/2;
    }
//    public int finSum(int n){
//        int sum=0;
//        for (int i = 1; i <n ; i++) {
//            sum=sum+1;
//
//        }
//        return sum;
//    }
}
