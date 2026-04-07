package latihan_pbo.Tugas_pbo;

public class BangunDatar {
    private double panjang;
    private double lebar;

    public BangunDatar(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double hitungLuas() {
        return panjang * lebar;
    }
}