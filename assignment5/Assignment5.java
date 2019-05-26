/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5;

/**
 *
 * @author Mahdi
 */
public class Assignment5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long ST=System.currentTimeMillis();
        //
          double fxy=0,fmax=0,fmin=0;
          for(int i=-1000;i<=1000;i++)
          {
              for(int j=-1000;j<=1000;j++)
              {
                  fxy=(Math.sqrt(i*i+j*j))/(i*Math.sin(i+j)+j*Math.cos(i+j));
                  if(fxy>fmax)
                  {
                      fmax=fxy;
                  }
                  if(fxy<fmin)
                  {
                      fmin=fxy;
                  }
              }
              
          }
          System.out.print("Max : ");
          System.out.print(fmax);
          System.out.print("\nMin : ");
          System.out.print(fmin);
          System.out.print("\n");
          System.out.println(System.currentTimeMillis()-ST+" ms");
          java.util.Scanner a=new java.util.Scanner(System.in);
          System.out.print("Please Press Enter Key.");
          a.nextLine();
        //
        
        // TODO code application logic here
    }
    
}
