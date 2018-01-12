package BlackJack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;
/**
 *
 * @author sitak
 */
public class Dealer1 extends Human {

    static ArrayList<Integer> Cards = new ArrayList<Integer>();
    static ArrayList<Integer> myCard = new ArrayList<Integer>();

    public Dealer1() {

        for (int j = 1; j <= 4; j++) {
            for (int i = 1; i <= 10; i++) {

                Cards.add(i);
                Cards.add(10);
                Cards.add(10);
                Cards.add(10);

            }
        }

    }

    public int open() {

        int Sum = 0;

        for (int i = 0; i <= myCard.size()-1; i++) {
            Sum += myCard.get(i);
        }
        return Sum;
    }

    public void setCard(ArrayList<Integer> a) {

        for (int i = 0; i <= a.size()-1; i++) {
            myCard.add(a.get(i));
        }

    }

    public boolean checkSum() {

        if (open() <= 16) {
            return true;
        } else {
            return false;
        }

    }

    public  ArrayList<Integer> deal() {
        Random select = new Random();

        ArrayList<Integer> a = new ArrayList<Integer>();

        Integer index = select.nextInt(Cards.size());
        a.add(Cards.get(index));
        Integer index1 = select.nextInt(Cards.size());
        a.add(Cards.get(index1));

        Cards.remove(index);
        Cards.remove(index1);

        return a;
//       Collections.shuffle(Cards);
//       Integer a=0;
//       
//       for(Integer i=1;i<=2;++i) { 
//         a = Cards.get(i);
//       }
//       for(i=1;i<=2;++i){ 
//           
//           int a=select.nextInt(cards,size());

    }

    public ArrayList<Integer> hit() {
        Random select = new Random();

        ArrayList<Integer> a = new ArrayList<Integer>();

        Integer index = select.nextInt(Cards.size());

        a.add(Cards.get(index));

        return a;

//       Collections.shuffle(Cards);
//       ArrayList<Integer> a=new ArrayList<Integer>();
//       
//       Cards.get(0);
//   
//       return a;
    }

}
