/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagement;

/**
 *
 * @author 1
 */
public class Date 
{
    int Year,Month,Day;
    public Date(int year,int month,int day)
    {
        Year=year;
        Month=month;
        Day=day;
    }
    public String show()
    {
        return String.valueOf(Day)+" / "+String.valueOf(Month)+" / "+String.valueOf(Year);
    }
    public int getYear()
    {
        return Year;
    }
    public int getMonth()
    {
        return Month;
    }
    public int getDay()
    {
        return Day;
    }
}
