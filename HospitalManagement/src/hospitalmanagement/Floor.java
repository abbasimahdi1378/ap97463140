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
public class Floor 
{
    int Floor_id;
    java.util.ArrayList<Room> Rooms;
    java.util.ArrayList<Room> ICU_Rooms;
    java.util.ArrayList<Room> Emergency_Rooms;
    java.util.ArrayList<Room> Strilized_Rooms;
    public Floor(int floor_id,java.util.ArrayList<Room> rooms)
    {
        Floor_id=floor_id;
        Rooms=rooms;
    }
    public int get_Floor_id()
    {
        return Floor_id;
    }
    /*public java.util.ArrayList<Room> get_Rooms()
    {
    
    }*/
    /*public java.util.ArrayList<Room> get_Rooms_By_Type(RoomType Room_Type)
    {
    }*/
}
