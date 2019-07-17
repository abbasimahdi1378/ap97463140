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
public class University 
{
    public java.util.ArrayList<Teacher> Teachers;
    public java.util.ArrayList<Student> Students;
    public java.util.ArrayList<Course> Courses;
    public University()
    {
        Teachers=new java.util.ArrayList<>();
        Students=new java.util.ArrayList<>();
        Courses=new java.util.ArrayList<>();
    }
    public Student find_Student_by_Student_id(int student_id)
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
    public Student find_Student_by_UserName(String username)
    {
        int c=-1;
        for(int i=0;i<this.Students.size();i++)
        {
            if(this.Students.get(i).UserName.equals(username)&&!username.equals(""))
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
    public Teacher find_Teacher_by_id(int teacher_id)
    {
        int c=-1;
        for(int i=0;i<this.Teachers.size();i++)
        {
            if(this.Teachers.get(i).id==teacher_id)
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
            return this.Teachers.get(c);
        }
    }
}
