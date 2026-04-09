package latihan_pbo.Tugas_pbo;

public class BangunRuang extends BangunDatar {
    private double tinggi;

    public BangunRuang(double panjang, double lebar, double tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override 
    public double hitungluas() {
        return panjang * lebar * 2;
    } 

 
    public double hitungVolume() {
        return super.hitungLuas() * tinggi;
    }

//class child
    public double hitungVolume2() {
        return hitungLuas() * tinggi * 2;
    }
}