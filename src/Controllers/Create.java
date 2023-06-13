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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static Controllers.Update.updateData;

public class Create {
    public static void insertData(String nama, int harga, int jumlah) throws SQLException {
        DataBarang dataBarang = new DataBarang(nama, harga, jumlah);
        Connection connect = Connect.connection();
        try {
            String querycheck = String.format("SELECT * FROM tabel_produk WHERE nama_produk = '%s'", dataBarang.getNamaProduk());
            Statement statement = connect.createStatement();
            ResultSet resultSet = statement.executeQuery(querycheck);
            if (resultSet.next()){
                updateData(dataBarang.getNamaProduk(),dataBarang.getHargaProduk(),dataBarang.getJumlahProduk());
            } else {
                statement.executeUpdate("INSERT INTO `tabel_produk` (`nama_produk`, `harga_produk`, `jumlah_produk`) VALUES ('" + dataBarang.getNamaProduk() + "'," + dataBarang.getHargaProduk() + "," + dataBarang.getJumlahProduk() + ")");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        connect.close();
    }
}

