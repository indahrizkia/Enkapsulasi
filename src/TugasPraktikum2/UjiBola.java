/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum2;

/**
 *
 * @author lenovo
 */
public class UjiBola{
	public static void main(String[]args){
	double Jarijari=28;
		System.out.println("\n\n");
                System.out.println("            BOLA I");
		Bola objekbola=new Bola(14);
		objekbola.showDiameter();
		objekbola.showLuasPermukaan();
		objekbola.showVolume();
		System.out.println("\n\n");
                System.out.println("            BOLA II");
		objekbola.setJarijari(Jarijari); 
		objekbola.showDiameter();
		objekbola.showLuasPermukaan();			
		objekbola.showVolume();
                System.out.println("\n\n");
                System.out.println("            BOLA III");
		objekbola.setJarijari(7); 
		objekbola.showDiameter();
		objekbola.showLuasPermukaan();			
		objekbola.showVolume();
	}
}

