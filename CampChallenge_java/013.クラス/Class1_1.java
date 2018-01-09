/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sitak
 */
public class Class1_1 {
    
    public String name;
    public int age;
    


    public void setClass1_1(String n,int a){

       this.name=n;
       this.age=a;

    }
    
    public void print(){
    
       System.out.println("私の名前は"+this.name+"で、年齢は"+this.age+"です！");
        
    }
    
    public static void main(String[] args){
    
     Class1_1 aisatu=new Class1_1();
    aisatu.setClass1_1("片桐",27);
    aisatu.print();
    }
    
} //このクラスファイルを実際に、インスタンスして使用するには、別のクラスdddddddddddddddgファイルを使えばいいのかな？

