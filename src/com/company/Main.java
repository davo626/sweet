package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int  []a= new int[n];
        double  []b= new double[n];
        for (int i = 0; i <n ; i++) {
           a[i]= sc.nextInt();
        }
        for (int i = 1; i <n-1 ; i++) {
            b[i]=0.5*a[i-1]+0.5*a[i+1];
        }
        b[0]=0.5*a[n-1]+0.5*a[1];
        b[n-1]=0.5*a[n-2]+0.5*a[0];
        for (int i = 0; i <n ; i++) {
            System.out.println(b[i]);
        }
    }
}
