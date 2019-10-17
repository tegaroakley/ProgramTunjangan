/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118066.latihan35.programtunjangan;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA    : Tegar Lucky'q Oakley
 * KELAS   : IF 2
 * NIM     : 10118066
 */
public class PBO210118066Latihan35ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Tunjangan tunjangan = new Tunjangan();
        System.out.println("============Program Tunjangan============");
        System.out.print("Berapa Gaji Pokok Anda Perbulan? = Rp. " );
        tunjangan.gapok = scanner.nextDouble();
        System.out.print("Staus Anda? (Menikah/Belum)      = ");
        tunjangan.status = scanner.next();
        System.out.println(" ");
        System.out.println("=======Hasil Perhitungan Gaji Anda=======");
        System.out.println("Gaji Pokok\t = " +tunjangan.gapok);
        System.out.println("Tunjangan\t = " +tunjangan.hasilTunjangan());
        System.out.println("Total Gaji\t = " +tunjangan.totalGaji());
        System.out.println("Developed by : Tegar Lucky'q Oakley");
                
    }
    
}
