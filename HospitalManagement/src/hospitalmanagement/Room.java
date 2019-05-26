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
public class Room 
{
    int Room_id;
    RoomType Room_Type;
    java.util.ArrayList<Sick> Sicks=new java.util.ArrayList<Sick>();
    java.util.ArrayList<Bed> Beds=new java.util.ArrayList<Bed>();
    int Capacity;
    public Room(int room_id,RoomType room_type)
    {
        Room_id=room_id;
        Room_Type=room_type;
    }
    public int get_Room_id()
    {
        return Room_id;
    }
    public int get_Room_Capacity()
    {
        return this.Capacity;
    }
    public RoomType get_Room_Type()
    {
        return this.Room_Type;
    }
    /*    public java.util.ArrayList<Sick> get_Sicks()
    {
    }*/
    public java.util.ArrayList<Bed> get_Beds()
    {
        return this.Beds;
    }
}
