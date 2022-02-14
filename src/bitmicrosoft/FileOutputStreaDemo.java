/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bitmicrosoft;

import java.io.FileOutputStream;

/**
 *
 * @author Dipendra
 */
public class FileOutputStreaDemo {
    public static void main(String[] args){
      try{
         FileOutputStream fout = new FileOutputStream("F:\\abc.txt");
         String s = "Hello java programmer";
         byte[] mybyte = s.getBytes();
         fout.write(mybyte);
         fout.close();
      }catch(Exception e){
        System.out.println(e);
      }
    }
}
