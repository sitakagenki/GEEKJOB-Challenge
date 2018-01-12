package BlackJack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
/**
 *
 * @author sitak
 */
public class User extends Human {

    ArrayList<Integer> myCard = new ArrayList<Integer>();

    public int open() {

        int sum = 0;

        for (int i = 0; i <= myCard.size()-1; i++) {

            sum += myCard.get(i);
        }

        return sum;
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
}
