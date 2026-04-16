package latihan_pbo.Tugas_Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Daftar menu
        Menu[] daftarMenu = {
            new Menu("Nasi Goreng", 15000),
            new Menu("Mie Ayam", 12000),
            new Menu("Es Teh", 5000)
        };

        ArrayList<MenuItem> pesanan = new ArrayList<>();

        int pilihan;
        
        do {
            System.out.println("\n=== DAFTAR MENU ===");
            for (int i = 0; i < daftarMenu.length; i++) {
                System.out.println((i + 1) + ". " + 
                    daftarMenu[i].getNama() + 
                    " - " + daftarMenu[i].getHarga());
            }
            System.out.println("0. Selesai");

            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();

            if (pilihan > 0 && pilihan <= daftarMenu.length) {
                System.out.print("Masukkan jumlah: ");
                int jumlah = input.nextInt();

                MenuItem item = new MenuItem(daftarMenu[pilihan - 1], jumlah);
                pesanan.add(item);

                System.out.println("✔ Pesanan ditambahkan!");
            }

        } while (pilihan != 0);

        // Tampilkan semua pesanan
        System.out.println("\n=== STRUK PESANAN ===");
        double total = 0;

        for (MenuItem item : pesanan) {
            item.tampilkan();
            total += item.getTotal();
        }

        System.out.println("TOTAL BAYAR = " + total);
    }
}