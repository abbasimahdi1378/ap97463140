/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author Mahdi
 */
public class Assignment2 {

     static int abs(int n)
    {
        if(n>=0)
        {
            return n;
        }
        else
        {
            return -1*n;
        }
    }
    public static void main(String[] args) 
    {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println("Please Enter An Odd Number : ");
        int n=sc.nextInt();
        if(n%2==0)
        {
           System.out.print("Error");
           return;
        }
        int c=n/2;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(abs(i-c)+abs(j-c)<=c)
                {
                    System.out.print("*");
                }
                else 
                {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        // TODO code application logic here
    }
    
}
