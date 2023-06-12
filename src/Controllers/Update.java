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

public class Update {
    public static void updateData(String nama, int jumlah) throws SQLException {
        DataBarang dataBarang = new DataBarang(nama, jumlah);
        Connection connect = Connect.connection();
        try {
            Statement statement = connect.createStatement();
            statement.executeUpdate(String.format("UPDATE `tabel_produk` SET `jumlah_produk` = %d WHERE `nama_produk` = '%s'", dataBarang.getJumlahProduk(), dataBarang.getNamaProduk()));
            System.out.println("Data berhasil di Update");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Data Tidak Ditemukan");
        }
        connect.close();
    }

    public static void updateData(String nama, int harga, int jumlah) throws SQLException {
        DataBarang dataBarang = new DataBarang(nama, harga, jumlah);
        Connection connect = Connect.connection();
        try {
            Statement statement = connect.createStatement();
            statement.executeUpdate(String.format("UPDATE `tabel_produk` SET `jumlah_produk` = %d, `harga_produk` = %d WHERE `nama_produk` = '%s'", dataBarang.getJumlahProduk(), dataBarang.getHargaProduk(), dataBarang.getNamaProduk()));
            System.out.println("Data berhasil di Update");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Data Tidak Ditemukan");
        }
        connect.close();
    }

}
