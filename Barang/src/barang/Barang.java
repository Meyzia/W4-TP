/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barang;

/**
 *
 * @author lenovo
 */
public class Barang {
    private String kode_barang;
    private String nama_barang;
    private int stok;
    
//    public Barang(String kode, String nama, int stk) { 
//        kode_barang = kode;
//        nama_barang = nama; 
//        stok = stk;
//    }
    
    void setKode_barang(String _kode_barang){
        this.kode_barang=_kode_barang;
    }
    String getKode_barang(){
        return this.kode_barang;
    }
    void setNama_barang(String _nama_barang){
        this.nama_barang=_nama_barang;
    }
    String getNama_barang(){
        return this.nama_barang;
    }
    void setStok(int _stok){
        this.stok=_stok;
    }
    int getStok(){
        return this.stok;
    }
    int addStok(int add){
        if(add<0){
            return stok;
        }else{
            return stok+add;
        }
    }
}
