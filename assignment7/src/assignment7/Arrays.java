/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7;

/**
 *
 * @author Varghaie
 */
public class Arrays implements Comparable{

    @Override
    public void sortByP(Shape[] shapeArray) {
        for(int i=0;i<shapeArray.length;i++)
        {
            double k=shapeArray[i].GetP();
            int kp=i;
            for(int j=i;j<shapeArray.length;j++)
            {
                if(shapeArray[j].GetP()<k)
                {
                    k=shapeArray[j].GetP();
                    kp=j;
                   
                }
            }
            Shape a=shapeArray[i];
            shapeArray[i]=shapeArray[kp];
            shapeArray[kp]=a;
        }
    }
    public Arrays()
    {
    }
    
}
