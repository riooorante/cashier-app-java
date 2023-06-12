/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

/**
 * @author ASUS
 */

import Config.Connect;
import Model.DataBarang;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Create {
    public static void insertData(String nama, int harga, int jumlah) throws SQLException {
        DataBarang dataBarang = new DataBarang(nama, harga, jumlah);
        Connection connect = Connect.connection();
        try {
            Statement statement = connect.createStatement();
            System.out.println();
            statement.executeUpdate("INSERT INTO `tabel_produk` (`nama_produk`, `harga_produk`, `jumlah_produk`) VALUES ('" + dataBarang.getNamaProduk() + "'," + dataBarang.getHargaProduk() + "," + dataBarang.getJumlahProduk() + ")");
            System.out.println();
            System.out.println("Data berhasil di simpan");
        } catch (Exception e) {
            e.printStackTrace();
        }
        connect.close();
    }
}

