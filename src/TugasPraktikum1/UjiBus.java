/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum1;

import latihan4.*;

/**
 *
 * @author lenovo
 */
public class UjiBus {
    public static void main (String[] arg){
    Bus Bus = new Bus(5);
    Bus.getpenumpang(17);
    Bus.getpenumpang(24);
    Bus.cetak();
    
    Bus.addpenumpang(2);
    Bus.cetak();
    
    Bus.addpenumpang(1);
    Bus.cetak();
    
    
    Bus.addpenumpang(2);
    Bus.cetak();
    
    
    Bus.addpenumpang(2);
    Bus.cetak();
    System.out.println("Rata-rata Penumpang : "+Bus.getAverage());	
    }
}
