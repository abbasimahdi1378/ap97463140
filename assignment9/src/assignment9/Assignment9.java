/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment9;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mahdi
 */
public class Assignment9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Long st=System.currentTimeMillis();
        
        System.out.println("Please Enter the acsess level number : ");
        int al;
        java.util.Scanner sc=new java.util.Scanner(System.in);
        al=sc.nextInt();
        System.out.println("Please enter the path : ");
        String path=sc.next();
        System.out.println("Please enter search word : ");
        String search=sc.next();
        java.util.ArrayList<String> ls=new java.util.ArrayList<>();
        
        java.io.File f1=new java.io.File(path);
        java.io.File f2=new java.io.File("f1.txt");
        java.io.PrintWriter pw=new java.io.PrintWriter(f2);
        String sn="";
        if(f1.isDirectory())
        {
            sn=f1.getName();
            path=f1.getPath();
            explore(path,al,ls);
           ls.stream().filter(s->s.contains(search)).forEach(System.out::println);
           ls.stream().filter(s->s.contains(search)).forEach(pw::println);
            pw.close();
        }
        else
        {
            System.out.println("Wrong Path!");
        }
        System.out.println((System.currentTimeMillis()-st)+" ms");
    }
    public static void explore(String Path,int level,java.util.ArrayList<String> list)
    {
        if(level!=0)
        {
            File a=new File(Path);
            File[] ff=a.listFiles();
            for(int i=0;i<ff.length;i++)
            {
                if(ff[i].canRead()&&ff[i].isHidden()==false)
                {
                    if(ff[i].isDirectory())
                    {
                        list.add(ff[i].getPath());                      
                        explore(ff[i].getPath(),level-1,list);
                    }
                    else
                    {
                        //System.out.println(ff[i].getPath());
                         list.add(ff[i].getPath());
                     
                    }
                }
            }
        }
        else
        {
        }
    }
    
}
