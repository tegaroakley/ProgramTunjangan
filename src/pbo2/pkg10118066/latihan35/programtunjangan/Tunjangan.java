/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118066.latihan35.programtunjangan;

/**
 *
 * @author DRAGON
 */
public class Tunjangan {
   public double tunjangan;
   public double gapok;
   public String status;
   
   public String cekStatus(){
       return status = "Menikah";
   }
   public double hasilTunjangan(){
       return tunjangan =(status.equals("Menikah"))?0.35*gapok:0;
   }
   public double totalGaji(){
       return tunjangan + gapok ;
   }
       
}
