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
public enum Gender 
{
    Male,Female;
    public String tostring()
    {
        String s="";
        switch(this)
        {
            case Male:
                s="مرد";
                break;
            case Female:
                s="زن";
                break;
                  
        }
        return s;
    }
}
