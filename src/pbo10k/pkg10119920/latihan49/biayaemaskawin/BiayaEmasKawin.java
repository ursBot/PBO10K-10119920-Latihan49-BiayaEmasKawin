/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119920.latihan49.biayaemaskawin;

/**
 *
 * @author 
 * NAMA     : Umar Said Adi Pranoto
 * KELAS    : IF10K
 * NIM      : 10119920
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * jenis-jenis tipe data bilangan bulat
 * 
 */

class Emas {
    
    private double beratEmas;
    private double hargaEmas;
    
    public double getBeratEmas() {
        return beratEmas;
    }
    public void setBeratEmas(double beratEmas) {
        this.beratEmas = beratEmas;
    }
    
    public double getHargaEmas() {
        return hargaEmas;
    }
    public void setHargaEmas(double hargaEmas) {
        this.hargaEmas = hargaEmas;
    }
    
    public double totalBayar(double beratEmas, double hargaEmas) {
        return beratEmas * hargaEmas;
    }
    
}

public class BiayaEmasKawin {
    
    public static void main(String[] args) {
        
        Emas e = new Emas();
        double totalBayar;
        
        e.setBeratEmas(15.7);
        e.setHargaEmas(570000);
        totalBayar = e.totalBayar(e.getBeratEmas(), e.getHargaEmas());
        
        System.out.println();
        System.out.println("--Pembelian Emas--");
        System.out.println("Berat Emas Kawin \t\t : Rp. " + e.getBeratEmas());
        System.out.println("Harga 1gram Emas per Oktober \t : Rp. " + e.getHargaEmas());
        System.out.println();
        System.out.println("Total Bayar \t\t\t : Rp. " + totalBayar);
    }
    
}