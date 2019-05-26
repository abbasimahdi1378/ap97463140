/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment8;

import java.io.FileNotFoundException;

/**
 *
 * @author Mahdi
 */
public class StdReader
{
    public static java.util.ArrayList<Student> Read(String file) throws FileNotFoundException
    {
        java.io.File f=new java.io.File(file);
        java.util.ArrayList<Student> students=new java.util.ArrayList<Student>();
        java.util.Scanner sc=new java.util.Scanner(f);
        while(sc.hasNext())
        {
            String buf=sc.nextLine();
            Student std;
            String[] m=buf.split("\t");
            if(m[3].equals("Graduating"))
            {
                std=new GraduatingStudent(Integer.parseInt(m[0]),m[1],m[2],Integer.parseInt(m[4]));
                students.add(std);
            }
            else if(m[3].equals("Graduated"))
            {
                std=new GraduatedStudent(Integer.parseInt(m[0]),m[1],m[2],Integer.parseInt(m[4]));
                students.add(std);
            }
            
        }
        return students;
        
        
    }
}
