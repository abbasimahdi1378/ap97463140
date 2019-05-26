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
public class Hospital 
{
    /*java.util.ArrayList<Sick> Sicks;
    java.util.ArrayList<Bed> Beds;
    java.util.ArrayList<Room> Rooms;*/
   java.util.ArrayList<Floor> Floors;
   java.util.ArrayList<Staff> Staffs;
   public static int ICU_ROOMS_CAPACITY;
   public static int EMERGENCY_ROOMS_CAPACITY;
   public Hospital(java.util.ArrayList<Floor> floors)
   {
       Floors=floors;
       Staffs=new java.util.ArrayList<>();
       
   } 
   public java.util.ArrayList<Floor> get_Floors()
   {
       return Floors;
   }
   public java.util.ArrayList<Bed> get_Empety_Beds()
   {
       java.util.ArrayList<Bed> b=new java.util.ArrayList<Bed>();
       for(int i=0;i<this.Floors.size();i++)
       {
          for(int j=0;j<this.Floors.get(i).Rooms.size();j++)
          {
              for(int k=0;k<this.Floors.get(i).Rooms.get(j).Beds.size();k++)
              {
                  if(this.Floors.get(i).Rooms.get(j).Beds.get(k).Has_Sick==false)
                  {
                      b.add(this.Floors.get(i).Rooms.get(j).Beds.get(k));
                  }
              }
          }
       }
       return b;
   }
   public java.util.ArrayList<Bed> get_Beds_Without_Sick_By_Room_Type(RoomType room_type)
   {
       java.util.ArrayList<Bed> b=new java.util.ArrayList<Bed>();
       for(int i=0;i<this.Floors.size();i++)
       {
          for(int j=0;j<this.Floors.get(i).Rooms.size();j++)
          {
              if(this.Floors.get(i).Rooms.get(j).get_Room_Type()==room_type)
              {
              for(int k=0;k<this.Floors.get(i).Rooms.get(j).Beds.size();k++)
              {
                  
                  if(this.Floors.get(i).Rooms.get(j).Beds.get(k).Has_Sick==false)
                  {
                      
                      b.add(this.Floors.get(i).Rooms.get(j).Beds.get(k));
                  }
                }
              }
          }
       }
       return b;
   }
   public java.util.ArrayList<Staff> get_Staffs()
   {
       return this.Staffs;
   }
   public java.util.ArrayList<Sick> get_Sicks()
   {
       java.util.ArrayList<Sick> b=new java.util.ArrayList<Sick>();
       for(int i=0;i<this.Floors.size();i++)
       {
          for(int j=0;j<this.Floors.get(i).Rooms.size();j++)
          {
              for(int k=0;k<this.Floors.get(i).Rooms.get(j).Beds.size();k++)
              {
                  if(this.Floors.get(i).Rooms.get(j).Beds.get(k).Has_Sick==true)
                  {
                       b.add(this.Floors.get(i).Rooms.get(j).Beds.get(k).sick);
                  }
                    
              }
          }
       }
       return b;
   }
}
