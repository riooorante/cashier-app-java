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

import java.security.spec.RSAOtherPrimeInfo;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Read {
    public static ArrayList<DataBarang> getDatabase() throws SQLException {
        ArrayList<DataBarang> arrayList = new ArrayList<>();

        Connection conn = Connect.connection();
        try {
            Statement statement = conn.createStatement();
            ResultSet resultset = statement.executeQuery("SELECT * FROM tabel_produk");
            if (resultset.next()) {
                while (resultset.next()) {
                    String nama = resultset.getString("nama_produk");
                    int hargaProduk = resultset.getInt("harga_produk");
                    int jumlahProduk = resultset.getInt("jumlah_produk");
                    DataBarang dataBarang = new DataBarang(nama, hargaProduk, jumlahProduk);
                    arrayList.add(dataBarang);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        conn.close();
        return arrayList;
    }
}

