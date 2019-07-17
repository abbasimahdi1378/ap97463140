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
public class Date {
    int Year;
    int Month;
    int Day;
    public Date(int year,int month,int day)
    {
        Year=year;
        Month=month;
        Day=day;
    }
    public String tostring()
    {
        return String.valueOf(Year)+"/"+String.valueOf(Month)+"/"+String.valueOf(Day);
    }
}
