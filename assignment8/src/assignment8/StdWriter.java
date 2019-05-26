/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment8;

import java.io.IOException;

/**
 *
 * @author Mahdi
 */
public class StdWriter 
{
   public static void Write(java.util.ArrayList<Student> students,String file) throws IOException
   {
       java.io.File f=new java.io.File(file);
       java.io.PrintWriter pw=new java.io.PrintWriter(f);
       for(int i=0;i<students.size();i++)
       {
           pw.println(students.get(i).toString());
       }
       pw.close();
   }
}
