/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time;


import java.util.Date;
import java.util.Calendar;
/**
 *
 * @author sitak
 */
public class Time1 {
    public static void main(String[] args){
    
//        Date ituka = new Date();
    
        Calendar c=Calendar.getInstance();
        
        c.set(2016,0,1,0,0,0);
        
        Date d=c.getTime();
        
        System.out.println(d);
        System.out.println(d.getTime());
    }
}
