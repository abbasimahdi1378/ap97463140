/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7;

/**
 *
 * @author Mahdi
 */

public class Assignment7 {


    public static void main(String[] args) {
       Shape[] shapeArray=new Shape[10];
       java.util.Random r=new java.util.Random();
       for(int i=0;i<10;i++)
       {
           
           int s=Math.abs(r.nextInt())%3;
           if(s==0)
           {
               shapeArray[i]=new Circle(Math.abs(r.nextInt(98)+2));
           }
           else if(s==1)
           {
               shapeArray[i]=new Squre(Math.abs(r.nextInt(98)+2));
           }
           else if(s==2)
           {
               shapeArray[i]=new Rectangle(Math.abs(r.nextInt(99)+2),Math.abs(r.nextInt(99)+2));
           }
           shapeArray[i].tostring();
           
           
           
          // S
       }
       System.out.println("\nNOW Sorted List By P :\n");
       Arrays a=new Arrays();
       a.sortByP(shapeArray);
       for(int i=0;i<10;i++)
       {
           shapeArray[i].tostring();
       }
        // TODO code application logic here
    }
    
    
}
