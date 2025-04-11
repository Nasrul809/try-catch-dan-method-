/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul2;

import javax.swing.JOptionPane;

public class modul2no3 {
    public double luas_persegipanjang(int panjang, int lebar){
        int total = panjang * lebar;
        return total;
    }
    public double luas_segitiga(int alas, int tinggi){
        int total = (alas * tinggi)/2;
        return total;
    }
    public double luas_lingkaran(int diameter){
        int jari_jari = diameter / 2;
        double total = Math.PI * Math.pow(jari_jari, 2);
        return total;
    }
    public static void main(String[] args) {
        modul2no3 count = new modul2no3();
        try {
            double total = 0;
            String jenis = "";
            int pilihan = Integer.parseInt(JOptionPane.showInputDialog("Pilihan : \n"
                    + "1. Luas Persegi Panjang\n"
                    + "2. Luas Segitiga\n"
                    + "3. Luas Lingkaran\n"));
            
            if (pilihan == 1){
                int panjang = Integer.parseInt(JOptionPane.showInputDialog("Masukkan panjang"));
                int lebar = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Lebar"));
                total = count.luas_persegipanjang(panjang, lebar);
                jenis = "Persegi Panjang";
                
            } else if (pilihan == 2){
                int alas = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Alas"));
                int tinggi = Integer.parseInt(JOptionPane.showInputDialog("Masukkan tinggi"));
                total = count.luas_segitiga(alas, tinggi);
                jenis = "Segitiga";
                
            } else if (pilihan == 3){
                int diameter = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Diameter"));
                total = count.luas_lingkaran(diameter);
                jenis = "Lingkaran";
                
            } else {
                
                JOptionPane.showMessageDialog(null, "Input-an tidak valid");
            }
            
            JOptionPane.showMessageDialog(null, "luas" + jenis + " = " + total);
            System.out.println("luas" + jenis + " = " + total);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Input-an tidak valid");
            System.out.println("Input-an tidak valid");
        }
    }
}    
