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
public class VeryLongInteger  implements DataSet{

    ArrayList<Integer> veryLongInteger=new ArrayList<>();

    public VeryLongInteger(String number) {
        setArray(number);
    }
    
    
    @Override
    public VeryLongInteger sum(Object numSet) {
        VeryLongInteger numSet2=(VeryLongInteger) numSet;
        boolean exceed=false;
        trim(numSet2);
        ArrayList<Integer> result=zeroArray(this.veryLongInteger.size());
        int buffer=0;
        
        for(int i=(this.veryLongInteger.size()-1);i>=0;i--){ // biggest loop
            //condition
             buffer=this.veryLongInteger.get(i)+numSet2.veryLongInteger.get(i);
             if(i==0&& (buffer>=10||(buffer+1>=10&& exceed))){
                 if(exceed){
                     result.set(i,buffer-10+1);
                     result.add(0,1);
                 }
                 else{
                     result.set(i, buffer-10);
                     result.add(0,1);
                 }
             }
             else if(buffer+1>=10 && exceed){
               result.set(i, buffer-10+1);
               exceed=true;
               
            }
           else if(buffer+1<10 && exceed){
               result.set(i, buffer+1);
               exceed=false;
           }
           else if(buffer<10 && !exceed){
               result.set(i, buffer);
               exceed=false;
           }
           else if(buffer>=10){
               result.set(i,buffer-10);
               exceed=true;
           }
            
            
        }
        
      String temp="";
      for(int a:result){
          temp+= String.valueOf(a);
      }
      VeryLongInteger v=new VeryLongInteger(temp);
      v.trimOut(v);
       
       return v;
    }

    @Override
    public VeryLongInteger minus(Object numSet) {
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
//        trimOut(this);
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
       if(e.getVeryLongInteger().size()==this.veryLongInteger.size()) return;
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
    public void trimOut(VeryLongInteger e){
        
        int terminate=0;
        
        for(int i=0;i<e.veryLongInteger.size();i++){
            if(e.veryLongInteger.get(i)!=0){
                terminate=i;
                break;
            }
            
        }
        for(int k=0;k<terminate;k++){
            e.veryLongInteger.remove(k);
      }
    }
    
}

    