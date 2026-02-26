package latihan_pbo.latihan3_2407021.coba;

public class Coba {
    protected double panjang;
    protected double lebar;

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double getPanjang() {
        return panjang;
    }

    public void cetakLuas() {
        System.out.println("Luasnya adalah : " + (panjang * lebar));
    }

    public double hitungLuas() {
        return panjang * lebar;
    }
}