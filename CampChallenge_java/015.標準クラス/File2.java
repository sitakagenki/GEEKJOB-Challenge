/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HyoujunnClass;
import java.io.*;
/**
 *
 * @author sitak
 */
public class File2 {
    public static void main(String[] args) throws FileNotFoundException, IOException{
    
    File fp = new File("JavaTest.txt");
    FileReader fr=new FileReader(fp);
    
    BufferedReader br=new BufferedReader(fr);
    
    
     System.out.println(br.readLine());
     
     fr.close();
    }
    
}
