/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

/**
 *
 * @author Varghaie
 */
public class Assignment4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int m,n;
        System.out.print("Enter 2 Number (m,n) : \n");
        java.util.Scanner s=new java.util.Scanner(System.in);
        m=s.nextInt();
        n=s.nextInt();
        int l[][]=new int[m][n];
        java.util.Random rand = new java.util.Random();
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                l[i][j]=rand.nextInt(100);
                System.out.printf("%4d",l[i][j]);
            }
            System.out.printf("\n");
        }
        System.out.printf("Enter Row id : ");
        int c,r;
        r=s.nextInt();
        for(int j=0;j<n;j++)
        {
            int min=l[r][j];
            int p=j;
            for(int k=j;k<n;k++)
            {
                if(l[r][k]<min)
                {
                    //swap
                    min=l[r][k];
                    p=k;
                }
            }
                    for(int i=0;i<m;i++)
                    {
                        if(i==r)
                        {
                        l[r][p]=l[r][j];
                        l[r][j]=min;
                        }
                        else
                        {
                           int t=l[i][j];
                           l[i][j]=l[i][p];
                           l[i][p]=t;
                        }
                    }
            
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.printf("%4d",l[i][j]);
            }
            System.out.printf("\n");
        }
        System.out.printf("Enter Coloumn id : ");
        c=s.nextInt();
        for(int i=0;i<m;i++)
        {
            int min=l[i][c];
            int p=i;
            for(int k=i;k<m;k++)
            {
                if(l[k][c]<min)
                {
                    //swap
                    min=l[k][c];
                    p=k;
                }
            }
                    for(int j=0;j<n;j++)
                    {
                        if(j==c)
                        {
                        l[p][c]=l[i][c];
                        l[i][c]=min;
                        }
                        else
                        {
                           int t=l[i][j];
                           l[i][j]=l[p][j];
                           l[p][j]=t;
                        }
                    }
            
        }
         for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.printf("%4d",l[i][j]);
            }
            System.out.printf("\n");
        }
         java.util.Scanner cc=new java.util.Scanner(System.in);
        System.out.println("Please Press Enter Key");
        cc.nextLine();
    }
    
}
