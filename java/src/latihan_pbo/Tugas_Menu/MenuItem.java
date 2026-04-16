package latihan_pbo.Tugas_Menu;

public class MenuItem {
    private Menu menu;
    private int jumlah;

    // Constructor
    public MenuItem(Menu menu, int jumlah) {
        this.menu = menu;
        this.jumlah = jumlah;
    }

    // Hitung total
    public double hitungTotal() {
        return menu.getHarga() * jumlah;
    }

    public double getTotal() {
        return hitungTotal();
    }

    // Tampilkan
    public void tampilkan() {
        menu.tampilkan();
        System.out.println("Jumlah    : " + jumlah);
        System.out.println("Total     : " + hitungTotal());
        System.out.println("---------------------------");
    }
}