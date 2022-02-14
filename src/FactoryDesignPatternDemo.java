/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dipendra
 */
public class FactoryDesignPatternDemo {
    public static void main(String[] args) {
       Bank a = BankFactory.getBank("everest");
        a.createBank();
        
    }
}
