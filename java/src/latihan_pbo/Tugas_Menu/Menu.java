package latihan_pbo.Tugas_Menu;

public class Menu {
    private String nama;
    private double harga;

    // Constructor
    public Menu(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    // Hitung total default
    public double hitungTotal() {
        return harga;
    }

    // Tampilkan
    public void tampilkan() {
        System.out.println("Nama Menu : " + nama);
        System.out.println("Harga     : " + harga);
    }
}