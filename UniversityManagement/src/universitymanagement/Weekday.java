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
public enum Weekday 
{
    Saturday,Sunday,Monday,Tuesday,Wednesday,Thursday,Friday;
    public String tostring_persian()
    {
        String s="";
        switch(this)
        {
            case Saturday:
               s="شتبه";
                break;
            case Sunday:
               s="یکشنبه";
                break;
            case Monday:
               s="دوشنبه";
                break;
            case Tuesday:
               s="سه شتبه";
                break;
            case Wednesday:
               s="چهارشنبه";
                break;
            case Thursday:
               s="پنجشنبه";
                break;
            case Friday:
               s="جمعه";
                break;
                
                
               
        }
        return s;
    }
}
