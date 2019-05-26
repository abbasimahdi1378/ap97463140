/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagement;

import java.io.FileNotFoundException;

public class HospitalReader 
{
    
public static Hospital read_Hospital() throws FileNotFoundException
    {
        String sad="";
        java.util.ArrayList<Floor> fs=new java.util.ArrayList<>();
        Hospital hospital=new Hospital(null);
        int EMERGENCY_ROOMS_CAPACITY=0;
        int ICU_ROOMS_CAPACITY=0;
        java.io.File f1=new java.io.File("Hospital.txt");
        java.util.Scanner sc=new java.util.Scanner(f1);
        String s1=sc.nextLine();
        String[] s2=s1.split("\t");
        //javax.swing.JOptionPane.showMessageDialog(rootPane,s1);
        EMERGENCY_ROOMS_CAPACITY=Integer.parseInt(s2[0]);
        ICU_ROOMS_CAPACITY=Integer.parseInt(s2[1]);
        int fid=0;
        while(sc.hasNextLine())
        {
            java.util.ArrayList<Room> rooms=new java.util.ArrayList<>();
            String ss=sc.nextLine();
            //javax.swing.JOptionPane.showMessageDialog(rootPane,ss);
            String[] ss2=ss.split("\t");
            int r1=Integer.parseInt(ss2[0]);
            int r2=Integer.parseInt(ss2[1]);
            int r3=Integer.parseInt(ss2[2]);
            int i=0;
            for(;i<r1;i++)
            {
                Room rr=new hospitalmanagement.Room(fid*100+i, RoomType.Emergency);
                rooms.add(rr);
                for(int j=0;j<EMERGENCY_ROOMS_CAPACITY;j++)
                {
                    Bed b=new hospitalmanagement.Bed(j,rr.Room_id,false);
                    rr.Beds.add(b);
                   
                }
            }
            for(;i<r2+r1;i++)
            {
                Room rr=new hospitalmanagement.Room(fid*100+i, RoomType.Strilized);
                rooms.add(rr);
                Bed b=new hospitalmanagement.Bed(0,rr.Room_id,false);
                rr.Beds.add(b);
            }
            for(;i<r3+r2+r1;i++)
            {
                Room rr=new hospitalmanagement.Room(fid*100+i, RoomType.ICU);
                rooms.add(rr);
                for(int j=0;j<ICU_ROOMS_CAPACITY;j++)
                {
                    Bed b=new hospitalmanagement.Bed(j,rr.Room_id,false);
                    rr.Beds.add(b);
                }
                
            }
            Floor f=new hospitalmanagement.Floor(fid,rooms);
            fs.add(f);
            //this.jTextField1.setText("adas");
            fid++;
        }
        sc.close();
        hospital=new Hospital(fs);
        java.io.File f2=new java.io.File("Sicks.txt");
        java.util.Scanner sc2=new java.util.Scanner(f2);
        while(sc2.hasNextLine())
        {
            String sss=sc2.nextLine();
            //0 Name
            //1 Family
            //2 Gender
            //3 Enter Date_Year
            //4 Enter Date_Month
            //5 Enter Date_Day
            //6 Birth Date_Year
            //7 Birth Date_Month
            //8 Birth Date_Day
            //9 Room_id
            //10 bed_id
            String[] sssa=sss.split("\t");
            String name=sssa[0];
            String family=sssa[1];
            Gender g=Gender.Male;
            if(sssa[2].equals("Male"))
            {
                g=Gender.Male;
            }
            else if(sssa[2].equals("Female"))
            {
                g=Gender.Female;
            }
            
            Gender gender=g;
            int enter_date_year=Integer.parseInt(sssa[3]);
            int enter_date_month=Integer.parseInt(sssa[4]);
            int enter_date_day=Integer.parseInt(sssa[5]);
            int birth_date_year=Integer.parseInt(sssa[6]);
            int birth_date_month=Integer.parseInt(sssa[7]);
            int birth_date_day=Integer.parseInt(sssa[8]);
            int room_id=Integer.parseInt(sssa[9]);
            int bed_id=Integer.parseInt(sssa[10]);
            Date enter_date=new Date(enter_date_year,enter_date_month,enter_date_day);
            Date birth_date=new Date(birth_date_year,birth_date_month,birth_date_day);
            Sick sick=new hospitalmanagement.Sick(bed_id,room_id, name, family,g,enter_date,birth_date);        
            hospital.Floors.get(room_id/100).Rooms.get(room_id%100).Beds.get(bed_id).Add_Sick(sick);
            
        }
        sc2.close();
        java.io.File f3=new java.io.File("Staffs.txt");
        java.util.Scanner sc3=new java.util.Scanner(f3);
        while(sc3.hasNextLine())
        {
            String ss01=sc3.nextLine();
            String[] ss02=ss01.split("\t");
            int id=Integer.parseInt(ss02[0]);
            String name=ss02[1];
            String family=ss02[2];
            String g=ss02[3];
            Gender gender=Gender.Male;
            if(g.equals("Male"))
            {
                gender=Gender.Male;
            }
            else
            {
                gender=Gender.Female;
            }
            String work=ss02[4];
            int yb=Integer.parseInt(ss02[5]);
            int mb=Integer.parseInt(ss02[6]);
            int db=Integer.parseInt(ss02[7]);
            int ye=Integer.parseInt(ss02[8]);
            int me=Integer.parseInt(ss02[9]);
            int de=Integer.parseInt(ss02[10]);
            Date birthdate=new Date(yb,mb,db);
            Date enterdate=new Date(ye,me,de);
            hospital.Staffs.add(new Staff(name,family,gender,work,birthdate,enterdate));
        }
        sc3.close();
        return hospital;
        
    }

}

