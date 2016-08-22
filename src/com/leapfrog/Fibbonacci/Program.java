/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.Fibbonacci;

/**
 *
 * @author Toshiba
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=0,b=1,sum;
        for(int i=0;i<10;i++){
            sum=a+b;
            a=b;
            b=sum;
            int total=sum;
            System.out.println(total);
        }
    }
    
}
