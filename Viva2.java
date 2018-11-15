/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viva2;

import java.util.Scanner;

/**
 *
 * @author wie180020
 */
public class Viva2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.print("Enter N: ");
        int n=input.nextInt();
        System.out.print("Enter R: ");
        int r=input.nextInt();
        if(check(n,r)){
            int[]arr=calculate(n,r);
            System.out.print("Yes."+r+" = ");
            for(int i=0;i<n-1;i++){
                System.out.print(arr[i]+" + ");
            }
            System.out.println(arr[n-1]);
        }else
            System.out.println("No summation of subsequent number");
 
    }
    public static boolean check(int  n, int r){
        int sum=0;
        int count=0;
        boolean pass=false;
        for(int i=0;i<r/2;i++){
            for(int j=i;count<n;j++){
                sum+=j;
                count++;
            }
            if(sum==r)
                pass=true;
            sum=0;
            count=0;
        }
        return pass;
    }
    public static int[] calculate(int n, int r){
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            r-=i;
        }
        r/=n;
        for(int i=0;i<n;i++){
            arr[i]=r+i;
        }
        return arr;
    }
}
