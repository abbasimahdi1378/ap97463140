/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universitymanagement;

/**
 *
 * @author Mahdi
 */
public class Teacher 
{
    String Name;
    String Family;
    Gender gender;
    int id;
    University u;
    java.util.ArrayList<Course> Courses;
    public String UserName;
    public String Password;
    public Teacher(int id,String name,String family,Gender _gender,University u)
    {
        this.id=id;
        Name=name;
        Family=family;
        gender=_gender;
        Courses=new java.util.ArrayList<>();
        UserName="";
        Password="";
    }
    public String Full_Name()
    {
        return Name+" "+Family;
    }
    public Course get_Course_By_id(int course_id)
    {
        int c=-1;
        for(int i=0;i<this.Courses.size();i++)
        {
            if(this.Courses.get(i).id==course_id)
            {
                c=i;
            }
        }
        if(c==-1)
        {
            return null;
        }
        else
        {
            return this.Courses.get(c);
        }
    }
    public String tostring()
    {
        return "شماره استادی"+":"+String.valueOf(id)+"    "+"نام"+":"+this.Name+"    "+"نام خانوادگی"+":"+this.Family+"    "+"جنسیت"+":"+this.gender.tostring();
    }
}
