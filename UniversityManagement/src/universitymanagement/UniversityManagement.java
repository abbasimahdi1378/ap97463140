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
public class UniversityManagement {

    /**
     * @param args the command line arguments
     */
    public static University university;
    public static Manager manager;
    public static void main(String[] args) 
    {
        // TODO code application logic here
        //Course Sample
            university=new University();
            manager=new Manager("مهدی","عباسی");
            Teacher t1=new universitymanagement.Teacher(0,"داریوش","نجفی",Gender.Male, university);
            university.Teachers.add(t1);
            Course c1=new universitymanagement.Course(0,"مبانی کامپیوتر و برنامه سازی",new ClassTime(9,30,11,0,"کلاس 104 برق",Weekday.Saturday),3,0,university);
            for(int i=0;i<university.Teachers.size();i++)
            {
                if(university.Teachers.get(i).id==c1.Teacher_id)
                {
                    university.Teachers.get(i).Courses.add(c1);
                }
            }
            university.Courses.add(c1);
            Student s1=new universitymanagement.Student(970,"مهدی","عباسی","0022705872","مهندسی کامپیوتر",Gender.Male,new Date(1378,9,4), university);
            university.Students.add(s1);
            MainForm mf=new MainForm();
        
    }
    
}
