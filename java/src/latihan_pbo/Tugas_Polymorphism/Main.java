package latihan_pbo.Tugas_Polymorphism;

public class Main {
    public static void main(String[] args) {

        // Polymorphism (1 tipe, banyak bentuk)
        BangunDatar bd;

        bd = new Persegi(5);
        bd.tampilkan();

        bd = new PersegiPanjang(6, 4);
        bd.tampilkan();

        bd = new Segitiga(8, 3);
        bd.tampilkan();
    }
}