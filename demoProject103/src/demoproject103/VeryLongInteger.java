/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoproject103;
import java.util.ArrayList;
/**
 *
 * @author phunon
 */
public class VeryLongInteger implements DataSet{

    ArrayList<Integer> veryLongInteger=new ArrayList<>();

    public VeryLongInteger(String number) {
        setArray(number);
    }
    
    
    @Override
    public Object sum(Object numSet) {
        VeryLongInteger numSet2=(VeryLongInteger) numSet;
        trim(numSet2);
        
      
       
       return 1;
    }

    @Override
    public Object minus(Object numSet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object multple(Object numSet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object divided(Object numSet ,int by) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object power(Object numSet,int raise) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        String temp="";
        for(int a:veryLongInteger){
            temp+=a;
        }
        return temp;
    }  

    @Override
    public void setArray(String number) {
        int temp;
        this.veryLongInteger.clear();
        for(int i=0;i<number.length();i++){
            temp=Integer.parseInt(String.valueOf(number.charAt(i))); 
            this.veryLongInteger.add(temp);
        }
       
    }
   public int grabIndex(int index){
       return this.veryLongInteger.get(index);
   }
               
    public ArrayList<Integer> getVeryLongInteger() {
        return veryLongInteger;
    }
    public void trim(VeryLongInteger e){
       
            while(e.getVeryLongInteger().size()>this.veryLongInteger.size()){
                this.veryLongInteger.add(0,0);
            }
            while(e.getVeryLongInteger().size()<this.veryLongInteger.size()){
                e.getVeryLongInteger().add(0,0);
            }
        e.getVeryLongInteger().add(0,0);
        this.veryLongInteger.add(0,0);
    }
    public ArrayList<Integer> zeroArray(int size){
        ArrayList<Integer> temp=new ArrayList<>();
        for(int i=0;i<size;i++){
            temp.add(0);
        }
        return temp;
    }
    public VeryLongInteger castFromObj (Object temp){
       VeryLongInteger a=(VeryLongInteger) temp;
         return a;
       
    }
    
}

    