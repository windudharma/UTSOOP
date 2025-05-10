package utsoop;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author windudharma
 * TGL 10 MEI 2025
 */
public class DataManagementApp extends Barang {
    private Barang[] data;
    private int dataCount;

    // Constructor untuk inisialisasi objek dengan kapasitas array
    public DataManagementApp(int capacity) {
        super("", 0);  // Memanggil constructor kelas induk (Barang)
        data = new Barang[capacity];
        dataCount = 0;
    }

    // Method untuk menambah barang dengan dua parameter
    public void addData(String nama, double hargaBarang) {
        if (dataCount < data.length) {
            data[dataCount] = new Barang(nama, hargaBarang);
            dataCount++;
            System.out.println("Barang berhasil ditambahkan.");
        } else {
            System.out.println("Array penuh, tidak dapat menambah barang.");
        }
    }

    // Overloading: Method untuk menambah barang dengan harga sebagai String
    public void addData(String nama, String hargaBarang) {
        try {
            double harga = Double.parseDouble(hargaBarang); // Mengonversi harga dari String ke double
            addData(nama, harga); // Memanggil metode addData yang menerima harga sebagai double
        } catch (NumberFormatException e) {
            System.out.println("Harga tidak valid.");
        }
    }

    // Method untuk menampilkan semua data barang (mengoverride display())
    @Override
    public void display() {
        if (dataCount == 0) {
            System.out.println("Tidak ada barang yang tersedia.");
        } else {
            System.out.println("Daftar Barang:");
            for (int i = 0; i < dataCount; i++) {
                System.out.print((i + 1) + ". ");
                data[i].display(); // Memanggil display() dari objek Barang
            }
        }
    }

    // Method untuk mengupdate data barang
    public void updateData(int index, String nama, double hargaBarang) {
        if (isIndexValid(index)) {
            data[index].setNama(nama);
            data[index].setHarga(hargaBarang);
            System.out.println("Barang berhasil diubah.");
        } else {
            System.out.println("Index tidak valid.");
        }
    }

    // Method untuk menghapus data barang
    public void deleteData(int index) {
        if (isIndexValid(index)) {
            for (int i = index; i < dataCount - 1; i++) {
                data[i] = data[i + 1];
            }
            dataCount--;
            System.out.println("Barang berhasil dihapus.");
        } else {
            System.out.println("Index tidak valid.");
        }
    }

    // Method untuk mengecek apakah index valid
    private boolean isIndexValid(int index) {
        return index >= 0 && index < dataCount;
    }
}