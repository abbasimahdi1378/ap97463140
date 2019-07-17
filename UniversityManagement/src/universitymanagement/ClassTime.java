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
public class ClassTime 
{
    int hour1;
    int hour2;
    int min1;
    int min2;
    String Place;
    Weekday weekday;
    public ClassTime(int h1,int m1,int h2,int m2,String place,Weekday wd)
    {
        hour1=h1;
        hour2=h2;
        min1=m1;
        min2=m2;
        Place=place;
        weekday=wd;
    }
    public String tostring()
    {
        return String.valueOf(hour1)+":"+String.valueOf(min1)+"  "+"تا"+"  "+String.valueOf(hour2)+":"+String.valueOf(min2)+"  "+weekday.tostring_persian()+"    "+"مکان"+":"+Place;
    }
}
