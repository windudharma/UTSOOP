/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utsoop;

import java.util.Scanner;

/**
 *
 * @author windudharma
 * TGL 10 MEI 2025
 */
public class Utsoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DataManagementApp app = new DataManagementApp(100); // Maksimal 10 data
        
       while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Tampilkan Barang");
            System.out.println("3. Ubah Barang");
            System.out.println("4. Hapus Barang");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi (1-5): ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Untuk membaca newline

            switch (choice) {
                case 1: // Menambah barang
                    System.out.print("Masukkan nama barang: ");
                    String namaBarang = scanner.nextLine();
                    System.out.print("Masukkan harga barang: ");
                    double hargaBarang = scanner.nextDouble();
                    app.addData(namaBarang, hargaBarang);
                    break;
                case 2: // Menampilkan barang
                    app.display();
                    break;
                case 3: // Mengubah barang
                    System.out.print("Masukkan nomor barang yang ingin diubah: ");
                    int updateIndex = scanner.nextInt() - 1; // Index dimulai dari 0
                    scanner.nextLine(); // Untuk membaca newline
                    System.out.print("Masukkan nama barang baru: ");
                    String newNamaBarang = scanner.nextLine();
                    System.out.print("Masukkan harga barang baru: ");
                    double newHargaBarang = scanner.nextDouble();
                    app.updateData(updateIndex, newNamaBarang, newHargaBarang);
                    break;
                case 4: // Menghapus barang
                    System.out.print("Masukkan nomor barang yang ingin dihapus: ");
                    int deleteIndex = scanner.nextInt() - 1; // Index dimulai dari 0
                    app.deleteData(deleteIndex);
                    break;
                case 5: // Keluar
                    System.out.println("Terima kasih telah menggunakan aplikasi.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opsi tidak valid.");
            }
        }
    }
}