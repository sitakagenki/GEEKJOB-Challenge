/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time;
import java.util.Calendar;
import java.util.Date;
/**
 *
 * @author sitak
 */
public class Time4 {
    public static void main(String[] args){
    
    Calendar a=Calendar.getInstance();
    Calendar b=Calendar.getInstance();
    
    
    a.set(2015,0,1,0,0,0);
    b.set(2015,11,31,23,59,59);
    
    
    Date d=a.getTime();
    Date e=b.getTime();
    
    long l=e.getTime()-d.getTime();
    Date sa=new Date(l);
    System.out.println("2015年1月1日0時0分0秒と2015年12月31日23時59分59秒の差は、" +sa + "です。");
    
    
    }
    
}
