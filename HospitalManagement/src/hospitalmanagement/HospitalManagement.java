/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagement;

import java.io.FileNotFoundException;

/**
 *
 * @author 1
 */
public class HospitalManagement {

    /**
     * @param args the command line arguments
     */
    static Hospital hospital;
    public static Hospital geth()
    {
        return hospital;
    }
    public static void seth(java.util.ArrayList<Floor> floors)
    {
        hospital=new Hospital(floors);
    }
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        // p=new Paziresh();
        java.io.File f1=new java.io.File("Sicks.txt");
        java.io.File f2=new java.io.File("Hospital.txt");
        if(f1.exists()==false)
        {
            Start1_HospitalSetter hs=new Start1_HospitalSetter();
        }
        else
        {
            Start2 st2=new Start2();
        }
    }
    
}
