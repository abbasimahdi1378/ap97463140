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
public class Sick 
{
    int Sick_id;
    int Bed_id;
    int Room_id;
    Gender Sick_Gender;
    String Name,Family;
    Date Enter_Date,Birth_Date;
    public Sick(int bed_id,int room_id,String name,String family,Gender gender,Date enter_date,Date birth_date)
    {
        Sick_id=room_id*10+bed_id;
        Bed_id=bed_id;
        Room_id=room_id;
        Sick_Gender=gender;
        Name=name;
        Family=family;
        Enter_Date=enter_date;
        Birth_Date=birth_date;
        
    }
    public int get_Room_id()
    {
        return Room_id;
    }
    /*    public Room get_Room()
    {
    return HospitalManagement.hospital.Rooms.get(Room_id);
    }*/
    public int get_Bed_id()
    {
        return Bed_id;
    }
    /*  public Bed get_Bed()
    {
    return HospitalManagement.hospital.Rooms.get(Room_id).Beds.get(Bed_id);
    }*/
    public int get_id()
    {
        return Sick_id;
    }
    public String get_Name()
    {
        return Name;
    }
    public String get_Family()
    {
        return Family;
    }
    public Gender get_Gender()
    {
        return Sick_Gender;
    }
    public Date get_Birth_Date()
    {
        return Birth_Date;
    }
    public Date get_Enter_Date()
    {
        return Enter_Date;
    }
    public String to_String()
    {
        String g="";
        if(this.Sick_Gender==Gender.Male)
        {
            g="Male";
        }
        else if(this.Sick_Gender==Gender.Female)
        {
            g="Female";
        }
        return Name+"\t"+Family+"\t"+g+"\t"+String.valueOf(this.Enter_Date.Year)+"\t"+String.valueOf(this.Enter_Date.Month)+"\t"+String.valueOf(this.Enter_Date.Day)+"\t"+String.valueOf(this.Birth_Date.Year)+"\t"+String.valueOf(this.Birth_Date.Month)+"\t"+String.valueOf(this.Birth_Date.Day)+"\t"+String.valueOf(this.Room_id)+"\t"+String.valueOf(this.Bed_id);
    }
    public String to_String2()
    {
        String g="";
        if(this.Sick_Gender==Gender.Male)
        {
            g="Male";
        }
        else if(this.Sick_Gender==Gender.Female)
        {
            g="Female";
        }
        return "نام:"+Name+"    نام خانوادگی:"+Family+"    جنسیت:"+g+"    تاریخ ورود:"+this.Enter_Date.show()+"    تاریخ تولد:"+this.Birth_Date.show()+"    شماره اتاق:"+String.valueOf(this.Room_id)+"    شماره تخت:"+String.valueOf(this.Bed_id);
    }
    /*public Nurse get_Nurse()
    {
    }*/
    
}
