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
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {
    public static void deleteData(String nama) throws SQLException {
        DataBarang dataBarang = new DataBarang(nama);
        Connection conn = Connect.connection();
        try {
            String querydel = "DELETE FROM main_data WHERE `nama_produk` = ?";
            PreparedStatement statement = conn.prepareStatement(querydel);
            statement.setString(1, dataBarang.getNamaProduk());
            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Data berhasil dihapus.");
            } else {
                System.out.println("Data tidak ditemukan.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        conn.close();
    }
}
