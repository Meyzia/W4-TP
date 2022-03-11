package barang;

public class Inventori {
    Barang[] barangs;
    
    void initBarang() {
        barangs = new Barang[2];
        barangs[0] = new Barang(); 
        barangs[1] = new Barang();
        
        barangs[0].setKode_barang("001");
        barangs[0].setNama_barang("Baju");
        barangs[0].setStok(10);
        barangs[1].setKode_barang("002");
        barangs[1].setNama_barang("Celana");
        barangs[1].setStok(20);
    }
    void showBarang() {
        System.out.println(barangs[0].getNama_barang() + "(" + barangs[0].getStok() + ")"); 
        System.out.println(barangs[1].getNama_barang() + "(" + barangs[1].getStok() + ")");
        System.out.println(barangs[1].addStok(5));
    }
    void pengadaan() {
        
        initBarang();
    
//        barangs[0].stok+=20;    //Bisa juga dikurangi dong? 
//        barangs[0].stok-=30;    //dikali juga bisa dong??
//        barangs[0].stok*=30;

        showBarang();
    }
    
    public static void main(String[] args) { 
        Inventori beli = new Inventori(); 
        beli.pengadaan();
    }
}