/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum1;

/**
 *
 * @author lenovo
 */
public class Bus {
    double penumpang;
    double maxPenumpang;
    double counter;
    double penumpangBaru;
      
    public Bus(int maxPenumpang){
        this.maxPenumpang = maxPenumpang;
        penumpang=0;
    }
    public void addpenumpang(double penumpang){
        double temp;
        temp = this.penumpang+penumpang;
        if(temp>=maxPenumpang){
            System.out.println("Penumpang melebihi kuota");
        }else{
            this.penumpang = temp;
            counter++;
        }
    }
    public void getpenumpang(double password){
        if(password==24)
        {
            System.out.println("Password Benar");
        }else
          {
            System.out.println("Password Salah");
        }  
        
}
     public double getAverage(){
		
		return penumpang/counter;
	}

        public void cetak(){
        System.out.println("Penumpang Bus sekarang adalah "+penumpang);
        System.out.println("Penumpang maksimum seharusnya adalah "+maxPenumpang);
    }
}
