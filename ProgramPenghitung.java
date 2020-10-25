/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hp Pavillion 14
 */
public class ProgramPenghitung {
    public static void main(String [] Args){
        
        int Penjumlahan;
        int Pengurangan;
        int Perkalian;
        int Pembagian;
        
        Kalkulator Penghitung = new Kalkulator();
        Penjumlahan = Kalkulator.getPenjumlahan(8, 8);
        Pengurangan = Kalkulator.getPengurangan(10, 6);
        Perkalian = Kalkulator.getPerkalian(2, 4);
        Pembagian = Kalkulator.getPembagian(8, 2);
        
        System.out.println("Hasil Penjumlahan adalah"+Penjumlahan);
        System.out.println("Hasil Pengurangan adalah"+Pengurangan);
        System.out.println("Hasil Perkalian adalah"+Perkalian);
        System.out.println("Hasil Pembagian adalah"+Pembagian);
    }

}
