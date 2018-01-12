package BlackJack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//import java.io.IOException;
//import java.io.PrintWriter;
import BlackJack.Dealer1;
import BlackJack.User;
//import static java.sql.DriverManager.println;
import java.util.ArrayList;
/**
 *
 * @author sitak
 */
public class BlackJack {
    public static void main(String[]args){
//        PrintWriter pw=new PrintWriter();
//        ArrayList<Integer> DealerCard = new ArrayList<Integer>();
//        ArrayList<Integer> UserCard = new ArrayList<Integer>();
        Dealer1 Dealer = new Dealer1();
        User User = new User();

//        Integer.parseInt("123");
//        String.valueOf(23);
        Dealer.setCard(Dealer.deal());
        User.setCard(Dealer.deal());

//        Dealer.open();
//        User.open();

//        boolean hitDealer = Dealer.checkSum();
//        boolean hitUser = User.checkSum();

        while (Dealer.checkSum() == true){
            Dealer.setCard(Dealer.hit());
          } 
        
        while ( User.checkSum() == true) {
            User.setCard(Dealer.hit());
        }
       
        if(Dealer.open() >= 22&&User.open()>=22) {
            System.out.println("両者BUSTしました。"+"引き分けです。");
        } else if (Dealer.open() >= 22&&User.open()<=21) {
            System.out.println("ディーラーがBUSTしました。あなたの勝ちです");
        } else if (User.open() >= 22&&Dealer.open()<=21) {
            System.out.println("BUSTしました。あなたの負けです。");
        } else if (Dealer.open() > User.open()) {
            System.out.println("ディーラーの手札の合計値は" + Dealer.open() + "で、あなたの手札の合計値は" + User.open() + "です。");
            System.out.println("あなたの負けです。");
        } else if (Dealer.open() < User.open()) {
            System.out.println("ディーラーの手札の合計値は" + Dealer.open() + "で、あなたの手札の合計値は" + User.open() + "です。");
            System.out.println("あなたの勝ちです。");
        } else if (Dealer.open() == User.open()) {
            System.out.println("ディーラーの手札の合計値は" + Dealer.open() + "で、あなたの手札の合計値は" + User.open() + "です。");
            System.out.println("引き分けです。");
        }
    }
}
