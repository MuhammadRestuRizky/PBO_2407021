package latihan_pbo.Tugas_pbo;

public class Main {
    public static void main(String[] args) {

        double panjang = 10;
        double lebar = 5;
        double tinggi = 4;

        BangunRuang br = new BangunRuang(panjang, lebar, tinggi);
        
        System.out.println("Panjang   : " + br.getPanjang());
        System.out.println("Lebar     : " + br.getLebar());
        System.out.println("Tinggi    : " + br.getTinggi());
        System.out.println("Luas Alas : " + br.hitungLuas());
        System.out.println("Volume dari class Parents  : " + br.hitungVolume());
        System.out.println("Volume dari class child   : " + br.hitungVolume2());
    }
}