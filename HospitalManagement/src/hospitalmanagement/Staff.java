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
public class Staff 
{
    int id;
    String Name;
    String Family;
    Gender gender;
    String Work;
    Date BirthDate,EnterDate;
    public Staff(String name,String family,Gender GENDER,String work,Date birthdate,Date enterdate)
    {
        Name=name;
        //id=Id;
        Family=family;
        gender=GENDER;
        Work=work;
        BirthDate=birthdate;
        EnterDate=enterdate;
    }
    public String get_Name()
    {
        return Name;
    }
    public String get_Family()
    {
        return Family;
    }
    public String get_Work()
    {
        return Work;
    }
    public int get_id()
    {
        return id;
    }
    public Gender get_Gender()
    {
        return gender;
    }
    public Date get_BirthDate()
    {
        return BirthDate;
    }
    public Date get_EnterDate()
    {
        return EnterDate;
    }
    public String to_String()
    {
        String g="";
        if(gender==Gender.Male)
        {
            g="Male";
        }
        else
        {
            g="Female";
        }
        return String.valueOf(id)+"\t"+Name+"\t"+Family+"\t"+g+"\t"+Work+"\t"+String.valueOf(BirthDate.Year)+"\t"+String.valueOf(BirthDate.Month)+"\t"+String.valueOf(BirthDate.Day)+"\t"+String.valueOf(EnterDate.Year)+"\t"+String.valueOf(EnterDate.Month)+"\t"+String.valueOf(EnterDate.Day);
    }
     public String to_String2()
     {
        String g="";
        if(gender==Gender.Male)
        {
            g="Male";
        }
        else
        {
            g="Female";
        }
        return Name+"    "+Family+"    "+g+"    "+Work+"    "+String.valueOf(BirthDate.Year)+"/"+String.valueOf(BirthDate.Month)+"/"+String.valueOf(BirthDate.Day)+"    "+String.valueOf(EnterDate.Year)+"/"+String.valueOf(EnterDate.Month)+"/"+String.valueOf(EnterDate.Day);
    }
}
