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
public class Course 
{
    String Title;
    ClassTime classtime;
    int units;
    int Teacher_id;
    public java.util.ArrayList<Student> Students;
    java.util.ArrayList<Float> Scores;
    int id;
    University u;
    public Course(int id,String title,ClassTime _classtime,int _units,int teacher_id,University u)
    {
        this.id=id;
        Title=title;
        classtime=_classtime;
        units=_units;
        Teacher_id=teacher_id;
        Students=new java.util.ArrayList<>();
        this.Scores=new java.util.ArrayList<>();
        this.u=u;
       
    }
    public void set_score(int student_id,float score)
    {
       for(int i=0;i<Students.size();i++)
       {
           if(Students.get(i).Student_id==student_id)
           {
               Scores.set(i,score);
           }
       }
    }
    public void add_student(Student student)
    {
        this.Students.add(student);
        this.Scores.add(Float.valueOf(-1));
    }
    public void del_student(int student_id)
    {
        int c=-1;
        for(int i=0;i<this.Students.size();i++)
        {
            if(this.Students.get(i).Student_id==student_id)
            {
                c=i;
            }
        }
        if(c!=-1)
        {
            this.Scores.remove(c);
            this.Students.remove(c);
        }
    }
    public String tostring()
    {
       return "شماره درس"+":"+String.valueOf(id)+"    "+"نام درس"+":"+this.Title+"    "+"تعداد واحد"+":"+String.valueOf(this.units)+"    "+"زمان و مکان کلاس ها"+":"+this.classtime.tostring()+"    "+"نام استاد درس"+":"+u.find_Teacher_by_id(this.Teacher_id).Full_Name();
    }
    public Student get_Student_By_Student_id(int student_id)
    {
        int c=-1;
        for(int i=0;i<this.Students.size();i++)
        {
            if(this.Students.get(i).Student_id==student_id)
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
            return this.Students.get(c);
        }
    }
}
