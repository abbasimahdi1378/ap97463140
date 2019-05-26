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
public class Bed 
{
    int Bed_id;
    int Room_id;
    boolean Has_Sick;
    Sick sick;
    public Bed(int bed_id,int room_id,boolean has_sick)
    {
        Bed_id=bed_id;
        Room_id=room_id;
        Has_Sick=has_sick;
    }
    public int get_Bed_id()
    {
        return Bed_id;
    }
    public int get_Room_id()
    {
        return Room_id;
    }
    /*    public Room get_Room()
    {
    return HospitalManagement.hospital.get(Room_id);
    }*/
    public Sick get_Sick()
    {       
        return sick;
    }
    public void Add_Sick(Sick SICK)
    {
        this.Has_Sick=true;
        sick=SICK;
    }
    public void Release_Sick()
    {
        this.Has_Sick=false;
    }
}
