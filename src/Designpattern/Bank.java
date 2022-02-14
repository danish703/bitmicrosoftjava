/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Designpattern;

/**
 *
 * @author Dipendra
 */
public class Bank {
    protected static Bank  bank = new Bank();
    private Bank(){
        
    }
    public static Bank getBank(){
        return bank;
    }
}
