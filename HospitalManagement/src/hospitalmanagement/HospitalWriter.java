/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagement;

import java.io.FileNotFoundException;

/**
 *
 * @author Varghaie
 */
public class HospitalWriter 
{
    static void WriteHospital(Hospital hospital) throws FileNotFoundException
    {
        java.io.File f=new java.io.File("Sicks.txt");
        java.io.PrintWriter pw=new java.io.PrintWriter(f);
        for(int i=0;i<hospital.get_Sicks().size();i++)
        {
            pw.println(hospital.get_Sicks().get(i).to_String());
        }
        pw.close();
        java.io.File f2=new java.io.File("Staffs.txt");
        java.io.PrintWriter pw2=new java.io.PrintWriter(f2);
        for(int i=0;i<hospital.Staffs.size();i++)
        {
            pw2.println(hospital.Staffs.get(i).to_String());
        }
        pw2.close();
    }
}
