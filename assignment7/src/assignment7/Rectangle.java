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
public class Rectangle extends Shape
{
    int width,height;
    String name;
    public Rectangle(int width,int height)
    {
        this.width=width;
        this.height=height;
        name="Rectangle";
    }
    public double GetS()
    {
        return width*height;
    }
    public double GetP()
    {
        return 2*(width+height);
    }
     public void tostring()
    {
        System.out.println(this.name+"\t"+width+"\t"+height+"\t"+GetS()+"\t"+GetP());
    }
}
