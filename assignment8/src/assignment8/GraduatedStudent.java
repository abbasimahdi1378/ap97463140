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
public class GraduatedStudent extends Student
{
    public int GraduationYear;
    public GraduatedStudent(int id,String name,String family,int year)
    {
        if(year>=1300&&year<=2300)
        {   
            this.ID=id;
            this.Name=name;
            this.Family=family;
            this.GraduationYear=year;
            this.Type="Graduated";
        }
        else 
        {
            System.out.print("\nError\n");
            this.Name="ERROR";
        }
    }

    @Override
    public String toString()
    {
         String s=String.valueOf(this.ID)+"\t"+this.Name+"\t"+this.Family+"\t"+this.Type+"\t"+String.valueOf(this.GraduationYear);
         return s;
    }
}
