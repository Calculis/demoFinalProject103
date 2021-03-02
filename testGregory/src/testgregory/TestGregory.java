/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testgregory;
import java.util.GregorianCalendar;
import java.time.*;

/**
 *
 * @author phunon
 */
public class TestGregory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     LocalDateTime a=LocalDateTime.now();
        System.out.printf("%d-%d-%d %d:%d \n",a.getDayOfMonth(),a.getMonthValue(),a.getYear(),a.getHour(),a.getMinute());
        
        LocalDate ld=LocalDate.of(2001, 1, 10);
        System.out.println(ld);
       
    }
    
}
