/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

/**
 *
 * @author Varghaie
 */
public class Assignment3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.util.Scanner s=new java.util.Scanner(System.in);
        int n=s.nextInt();
        int[][] ar=new int[n][n];
        java.util.Random rn=new java.util.Random();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                ar[i][j]=rn.nextInt(100);
                System.out.printf("%4d",ar[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        int x=0,y=0;
        while(true)
        {
            System.out.print(ar[y][x]);
            System.out.print(" ");
            if(x==n-1&&y==n-1)
            {
                break;
            }
            x-=1;
            y+=1;
            if(x<0)
            {
                if(y>=n)
                {
                    x=n-1;
                    y=1;
                }
                else
                {
                    x=y;
                    y=0;
                }
            }
            if(y>=n)
            {
                y=x+2;
                x=n-1;
            }
            
        }
        // TODO code application logic here
        java.util.Scanner c=new java.util.Scanner(System.in);
        System.out.println("Please Press Enter Key");
        c.nextLine();
    }
    
}
