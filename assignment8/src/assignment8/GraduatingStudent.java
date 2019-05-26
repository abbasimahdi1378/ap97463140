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
public class GraduatingStudent extends Student
{
  public int PassedUnits;
  public GraduatingStudent(int id,String name,String family,int passedunits)
  {
      if(passedunits<=200&&passedunits>=0)
      {
        this.ID=id;
        this.Name=name;
        this.Family=family;
        this.PassedUnits=passedunits;
        this.Type="Graduating";
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
      String s=String.valueOf(this.ID)+"\t"+this.Name+"\t"+this.Family+"\t"+this.Type+"\t"+String.valueOf(this.PassedUnits);
      return s;
  }
}
