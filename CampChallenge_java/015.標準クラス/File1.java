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
public class File1 {
    public static void main(String[] args) throws IOException{
    
    File fp=new File("JavaTest.txt");
    
    FileWriter fw = new FileWriter(fp);
    
    fw.write("私の名前は志鷹元気です。");
    fw.write("富山県出身です。");
    
    fw.close();
    
    }
    
}
