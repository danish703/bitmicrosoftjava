/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dipendra
 */
public class BankFactory {
    
    public static Bank getBank(String bankName){
        if(bankName.equalsIgnoreCase("nic")){
            return new NicAsia();
        }else if(bankName.equalsIgnoreCase("nabil")){
            return new Nabil();
        }else if(bankName.equalsIgnoreCase("everest")){
            return new Everest();
        }
        return null;
    }
}
