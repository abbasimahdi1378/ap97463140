/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment6;

import java.util.ArrayList;
/**
 *
 * @author Mahdi
 */
public class Assignment6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        int x;
        java.util.Scanner sc=new java.util.Scanner(System.in);
        java.util.Random r=new java.util.Random();
        x=sc.nextInt();
        double maxm=0,minm=0,m=0;
        int kmax=0,kmin=0;
        java.util.ArrayList<ArrayList<Integer>> arrlist=new java.util.ArrayList<java.util.ArrayList<Integer>>();
        for(int i=0;i<x;i++)
        {
            int r1=r.nextInt(x)+1;
            java.util.ArrayList<Integer> il=new java.util.ArrayList<Integer>();
            m=0;
            for(int j=0;j<r1;j++)
            {
                
                int r2=r.nextInt(x);
                il.add(new Integer(r2));
                m+=r2;
                System.out.print(r2+"\t");
            }
            m/=r1;
            if(m>maxm)
            {
                maxm=m;
                kmax=i;
            }
            if(m<minm)
            {
                minm=m;
                kmin=i;
            }
            arrlist.add(il);
            System.out.print("\n");
        }
        System.out.println("Max average Row :");
        for(int i=0;i<arrlist.get(kmax).size();i++)
        {
            System.out.print(arrlist.get(kmax).get(i)+"\t");
        }
        System.out.println();
        System.out.println("Min average Row :");
        for(int i=0;i<arrlist.get(kmin).size();i++)
        {
            System.out.print(arrlist.get(kmin).get(i)+"\t");
        }
        sc.nextLine();
        System.out.print("\nPlease Press Enter to Exit.");
        sc.nextLine();
    }
    
}
