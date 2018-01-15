/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time;

import java.util.Date;
import java.text.SimpleDateFormat;
/**
 *
 * @author sitak
 */
public class Time2 {
    public static void main(String[] args){
    
        Date now=new Date();
        SimpleDateFormat f=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        
        String s=f.format(now);
        System.out.println(s);
    
    
    }
    
}
