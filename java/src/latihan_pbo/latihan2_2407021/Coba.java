package latihan_pbo.latihan2_2407021;

public class Coba {
    protected double panjang;
    protected double lebar;
    protected double sisi;

    // setter
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    // getter
    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public double getSisi() {
        return sisi;
    }

    // method cetak luas persegi panjang
    public void cetakLuas() {
        System.out.println("Luasnya adalah : " + (panjang * lebar));
    }

    // method hitung luas persegi panjang
    public double hitungLuas() {
        double luas = panjang * lebar;
        return luas;
    }

    // method hitung luas persegi (pakai sisi)
    public double hitungLuasPersegi() {
        return sisi * sisi;
    }
}
