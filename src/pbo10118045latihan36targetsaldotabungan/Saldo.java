/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10118045latihan36targetsaldotabungan;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author Ilham
 */
public class Saldo {
    private int hitungSaldo(int saldo, double bunga){
        int hitungBunga = (int)(saldo*bunga);
        return saldo + hitungBunga;
    } 
    public void tampilSaldo (int saldo, int target, double bunga){
        int i = 1;
        NumberFormat nf = NumberFormat.getInstance(Locale.ITALY);
        do{
            saldo=hitungSaldo(saldo,bunga);
            System.out.println("Saldo di bulan ke-"+i+" Rp. "+nf.format(saldo));
            i++;
    }while(saldo < target);
    }
}
