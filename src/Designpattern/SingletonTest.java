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
public class SingletonTest {
    public static void main(String[] args) {
        Bank bank = Bank.getBank();
        Bank bank2 = Bank.getBank();
        
        Bank bank3 = Bank.getBank();
    }
}
