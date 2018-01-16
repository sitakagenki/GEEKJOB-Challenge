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
public class File3 {
    public static void main(String[] args) throws FileNotFoundException,IOException{
    
        File fp =new File("Class_setumei.txt");
        
        FileWriter fw=new FileWriter(fp);
        
        fw.write("Mathクラスについて…");
        fw.write("指数関数・対数関数・平方根・三角関数などの基本的な数値処理を行うためのメソッドを含んでいる。");
        fw.write("Mathクラスのメソッドは、すべて静的メソッドなので、インスタンス生成する必要がない。");
        
        fw.write("<開始>　　doble a = Math.sqrt(2); // aには２の２乗が代入される　　<終了>");
        
        fw.close();
        
        FileReader fr=new FileReader(fp);
        BufferedReader br=new BufferedReader(fr);
        
        System.out.println(br.readLine());
        
        fw.close();
    } 
    
}
