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
public class Student 
{
    String Name;
    String Family;
    int Student_id;
    String National_code;
    String Reshteh;
    Gender gender;
    Date Birth_Date;
    String UserName;
    String Password;
    University u;
    public Student(int student_id,String name,String family,String national_code,String reshteh,Gender _gender,Date birthdate,University u)
    {
        Student_id=student_id;
        Name=name;
        Family=family;
        National_code=national_code;
        Reshteh=reshteh;
        gender=_gender;
        Birth_Date=birthdate;
        this.u=u;
        this.UserName="";
        this.Password="";
        
    }
    public void set_UserName_Password(String username,String password)
    {
        this.UserName=username;
        this.Password=password;
    }
    public java.util.ArrayList<Course> get_Courses()
    {
        java.util.ArrayList<Course> l=new java.util.ArrayList<>();
        for(int i=0;i<u.Teachers.size();i++)
        {
            for(int j=0;j<u.Teachers.get(i).Courses.size();j++)
            {
                for(int k=0;k<u.Teachers.get(i).Courses.get(j).Students.size();k++)
                {
                    if(u.Teachers.get(i).Courses.get(j).Students.get(k).Student_id==this.Student_id)
                    {
                        l.add(u.Teachers.get(i).Courses.get(j));
                        break;
                    }
                }
            }
        }
        return l;
    }
    public float get_Score(int Course_id)
    {
        float a=-2;
        for(int i=0;i<u.Teachers.size();i++)
        {
          
            for(int j=0;j<u.Teachers.get(i).Courses.size();j++)
            {
                if(u.Teachers.get(i).Courses.get(j).id==Course_id)
                {
                    for(int k=0;k<u.Teachers.get(i).Courses.get(j).Students.size();k++)
                    {
                        if(u.Teachers.get(i).Courses.get(j).Students.get(k).Student_id==this.Student_id)
                        {
                           a=u.Teachers.get(i).Courses.get(j).Scores.get(k);
                        }
                    }
                }
            }
        }
        return a;
    }
    public String tostring()
    {
        return "شماره دانشجویی"+":"+String.valueOf(this.Student_id)+"    "+"نام"+":"+this.Name+"    "+"فامیلی"+":"+this.Family+"    "+"رشته"+":"+this.Reshteh+"    "+"جنسیت"+":"+this.gender.tostring()+"    "+"تاریخ تولد"+":"+this.Birth_Date.tostring();
    }
}
