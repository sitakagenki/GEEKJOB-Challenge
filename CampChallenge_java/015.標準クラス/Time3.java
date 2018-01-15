/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
/**
 *
 * @author sitak
 */
public class Time3 {
    public static void main(String[] args){
    
//    Date ituka=new Date();
    Calendar c= Calendar.getInstance();
    SimpleDateFormat f=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    
    
    c.set(2016,10,4,10,0,0);
    Date d=c.getTime();
    String s=f.format(d);
    
    System.out.println(s);
    
    }
    
}
