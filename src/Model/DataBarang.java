/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ASUS
 */
public class DataBarang {
    private  String namaProduk;
    private  int hargaProduk;
    private  int jumlahProduk;

    public DataBarang(String namaProduk){
        this.namaProduk = namaProduk;
    }

    public DataBarang(String namaProduk, int jumlahProduk){
        this.namaProduk = namaProduk;
        this.jumlahProduk = jumlahProduk;
    };

    public DataBarang(String namaProduk, int hargaProduk, int jumlahProduk) {
        this.namaProduk = namaProduk;
        this.hargaProduk = hargaProduk;
        this.jumlahProduk = jumlahProduk;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public int getHargaProduk() {
        return hargaProduk;
    }

    public void setHargaProduk(int hargaProduk) {
        this.hargaProduk = hargaProduk;
    }

    public int getJumlahProduk() {
        return jumlahProduk;
    }

    public void setJumlahProduk(int jumlahProduk) {
        this.jumlahProduk = jumlahProduk;
    }
}
