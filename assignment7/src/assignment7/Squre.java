/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7;

/**
 *
 * @author Varghaie
 */
public class Squre extends Shape
{
     int side;
     String name;
    public Squre(int side)
    {
        this.side=side;
        name="Squre";
    }
    public double GetS()
    {
        return side*side;
    }
    public double GetP()
    {
        return 4*side;
    }
      public void tostring()
    {
        System.out.println(this.name+"\t"+side+"\t"+GetS()+"\t"+GetP());
    }
}
