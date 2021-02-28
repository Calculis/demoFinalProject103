/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoproject103;
import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author phunon
 */
public class DemoProject103 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     VeryLongInteger b1=new VeryLongInteger("30000000");
     VeryLongInteger b2=new VeryLongInteger("1200000000000000");
    
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b1.sum(b2));
        System.out.println(b2.sum(b1));
      
       
    }
    
}
