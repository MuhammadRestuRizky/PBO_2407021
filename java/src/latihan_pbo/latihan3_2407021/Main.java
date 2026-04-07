package latihan_pbo.latihan3_2407021;

import latihan_pbo.latihan3_2407021.coba.Coba;

public class Main {
    public static void main(String[] args) {
        Coba tes = new Coba();



        tes.setPanjang(5);
        System.out.println("Panjangnya adalah : "+ tes.getPanjang());
        tes.setLebar(2);
        tes.cetakluas();
        System.out.println("Luasnya adalah : "+ tes.hitungluas());
    }
}