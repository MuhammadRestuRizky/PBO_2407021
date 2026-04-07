package latihan_pbo.latihan3_2407021.coba;

public class Coba {
    protected double panjang;
    protected double lebar;
    protected double sisi;
    
    //method
    // setter
    public void setPanjang(double panjang){
        this.panjang = panjang;
    }

    //getter
    public double getPanjang(){
        return panjang;
    }

    public void setLebar(double lebar){
        this.lebar = lebar;
    }

    public void cetakluas(){
        System.out.println("Luasnya adalah : " + (panjang * lebar));
    }

    public double hitungluas(){
        double Luas = panjang * lebar;
        return Luas;
    }
}