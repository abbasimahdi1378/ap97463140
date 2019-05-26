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
import java.io.IOException;
import java.util.*;
public class Assignment8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException
    {
        // TODO code application logic here
        System.out.print("Please enter students informations . If your work finished,Type exit and press Enter key.\n");
        String kw="";
        int n=0;
        java.util.ArrayList<GraduatedStudent> Graduateds=new java.util.ArrayList<GraduatedStudent>();
        java.util.ArrayList<GraduatingStudent> Graduatings=new java.util.ArrayList<GraduatingStudent>();
        java.util.ArrayList<Student> Students=new java.util.ArrayList<Student>();
        Scanner sc=new java.util.Scanner(System.in);
        while(kw.equals("exit")==false)
        {
            int err=0;
            System.out.print("Student Number "+(n+1));
            System.out.print("\n\tStudent ID :\n");
            int sid=sc.nextInt();
            System.out.print("\tName :\n");
            String name=sc.next();
            System.out.print("\tFamily:\n");
            String family=sc.next();
            System.out.print("\tStudent State (Graduated,Graduating):\n");
            String st=sc.next();
            if(st.equals("Graduated"))
            {
                System.out.print("\tGraduationYear:\n");
                int gy=sc.nextInt();
                GraduatedStudent gus=new GraduatedStudent(sid,name,family,gy);
                
                if(gus.Name.equals("ERROR"))
                {
                    err=1;
                }
                else
                {
                    err=0;
                    Graduateds.add(gus);
                    Students.add(gus);
                }
            }
            else
            {
                System.out.print("\tPassedUnit:\n");
                int pu=sc.nextInt();
                GraduatingStudent gus=new GraduatingStudent(sid,name,family,pu);
                if(gus.Name.equals("ERROR"))
                {
                    err=1;
                }
                else
                {
                    err=0;
                                    Graduatings.add(gus);
                Students.add(gus);
                }
            }
            if(err==0)
            {
                 System.out.print("\n"+Students.get(n).toString());
                 n++;
            
            }
            System.out.print("(Press Type C and press Enter to Continue   Or    Type exit adn press Enter to exit):\n");
            kw=sc.next();
        }
        StdWriter.Write(Students,"Students.txt"); 
        java.util.ArrayList<Student> stds=StdReader.Read("Students.txt");
        Student[] sts=new Student[stds.size()];
        for(int i=0;i<stds.size();i++)
        {
            sts[i]=stds.get(i);
        }
        System.out.println("\nReaded Information from file before sort :");
        for(int i=0;i<sts.length;i++)
        {
            System.out.println(sts[i].toString());
        }
        Arrays.sort(sts);
        System.out.println("\nReaded Information from file after sort by StudentID :");
         for(int i=0;i<sts.length;i++)
        {
            System.out.println(sts[i].toString());
        }
        
    }
    
}
