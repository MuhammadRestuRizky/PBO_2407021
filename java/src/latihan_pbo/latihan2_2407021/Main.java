package latihan_pbo.latihan2_2407021;

public class Main {    
  public static void main(String[] args) {
      Coba pp1 = new Coba();
      System.out.print("panjangnya adalah: " + pp1.getPanjang());
      pp1.setPanjang(10);
      pp1.setLebar(5);
      pp1.cetakLuas();
      System.out.println("Luasnya adalah: " + pp1.hitungLuas());
  }
}