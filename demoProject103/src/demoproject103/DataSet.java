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
public interface  DataSet<E>  {
    
   public abstract E  sum(E numSet);
   public abstract E  minus(E numSet);
   public abstract E  multple(E numSet);
   public abstract E  divided(E numSet,int by);
   public abstract E  power(E numSet,int raise);
   public abstract void setArray(String number);
   @Override
   public abstract String toString();
}
