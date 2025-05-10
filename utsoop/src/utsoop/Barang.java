/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utsoop;

/**
 *
 * @author windudharma
 */
public class Barang {
    private String nama;
    private double harga;

    // Constructor
    public Barang(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    // Metode untuk menampilkan informasi barang (akan di-override di subclass)
    public void display() {
        System.out.println("Nama Barang: " + nama + ", Harga: " + harga);
    }
}
