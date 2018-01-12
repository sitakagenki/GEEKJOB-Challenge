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
abstract public class Human {

    ArrayList myCard = new ArrayList<Integer>();

    abstract public int open();

    abstract public void setCard(ArrayList<Integer> a);

    abstract public boolean checkSum();

}
