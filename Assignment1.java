/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;
/**
 *
 * @author Mahdi
 */
public class Assignment1 {

    /**
     * @param args the command line arguments
     */
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
    public static void main(String[] args) {
        for(int i=0;i<7;i++)
        {
            for(int j=0;j<7;j++)
            {
                if(abs(i-3)+abs(j-3)<=3)
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
