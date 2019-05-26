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
public class Circle extends Shape 
{
    int radius;
    String name;
    public Circle(int radius)
    {
        this.radius=radius;
        name="Circle";
    }
    public double GetS()
    {
        return radius*radius*Math.PI;
    }
    public double GetP()
    {
        return 2*radius*Math.PI;
    }
     public void tostring()
    {
        System.out.println(this.name+"\t"+radius+"\t"+GetS()+"\t"+GetP());
    }
}
