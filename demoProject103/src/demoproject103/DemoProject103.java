/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoproject103;

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
       VeryLongInteger v1=new VeryLongInteger("123123123345454545");
         VeryLongInteger v2=new VeryLongInteger("1");
         v1.trim(v2);
         System.out.println(v1);
         System.out.println(v2);
    }
    
}
