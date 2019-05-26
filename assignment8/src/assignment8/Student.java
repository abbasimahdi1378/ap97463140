/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment8;

/**
 *
 * @author Mahdi
 */
public abstract class Student implements Comparable<Student>
{
    
    public String Name;
    public String Family;
    public int ID;
    public String Type;//Graduated - Graduating
    public final int compareTo(Student std)
    {
        Integer a=new Integer(this.ID);
        Integer b=new Integer(std.ID);
        return(a.compareTo(b));
    }
}
