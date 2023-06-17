
# Simple Cashier App
Aplikasi kasir ini merupakan sistem sederhana yang terintegrasi dengan database. Didesain untuk membantu petugas dalam menghitung total belanja pelanggan dan memberikan informasi tentang pembayaran, termasuk total tagihan, jumlah tunai, dan kembalian. Dengan antarmuka intuitif, aplikasi ini mempermudah pencatatan produk, proses penjualan, dan pembayaran. Keunggulan aplikasi ini adalah meningkatkan efisiensi kasir, mengelola stok produk, dan memberikan informasi akurat kepada pelanggan.

![Video Name](https://youtu.be/oVXF4JxQjHY)

# Struktur Folder 
- Config: Konektor aplikasi dengan database
	- Connect.java  
- Controllers: Kelas java operasi CRUD
	 - Create.java
	 - Delete.java
	 - Read.java
	 - Update.java
- Database: Database aplikasi
	- db_produk.sql
- Model: Kelas yang menyimpan informasi sementara
	- DataBarang.java
- app.java
- app.form
# Pengenalan File Java
 - [ ] Connect.java
       
Kelas ini memiliki fungsi untuk mengkoneksikan aplikasi dengan database MySQL menggunakan JDBC (Java Database Connectivity). Kode ini mengatur parameter koneksi seperti URL database, username, dan password. Method  `connection()` akan mengembalikan objek `Connection` yang digunakan untuk berinteraksi dengan database. Jika koneksi berhasil, objek `Connection` akan dikembalikan; jika tidak, pesan "Connection: Gagal" akan ditampilkan.

 -   [ ] Create.java
         
Kelas ini berfungsi untuk memasukkan data ke dalam database menggunakan JDBC (Java Database Connectivity). Metode `insertData` menerima parameter nama, harga, dan jumlah. Kode ini melakukan pemeriksaan apakah data barang sudah ada dalam tabel produk. Jika ya, maka data akan diperbarui; jika tidak, data baru akan dimasukkan ke dalam tabel. Kode ini mengelola exception dan menutup koneksi database.

 -   [ ] Delete.java
         
 Kelas ini berfungsi untuk menghapus data dari database menggunakan JDBC (Java Database Connectivity). Metode `deleteData` menerima parameter nama untuk mencari data yang akan dihapus. Kode ini menggunakan query SQL `DELETE` untuk menghapus data dari tabel produk berdasarkan nama produk yang diberikan. Pesan "Data berhasil dihapus" atau "Data tidak ditemukan" akan ditampilkan sesuai dengan hasil operasi `DELETE`. Kode ini mengelola exception dan menutup koneksi database.
  -   [ ] Read.java
          
Kelas ini berfungsi untuk membaca data dari database menggunakan JDBC (Java Database Connectivity). Metode `getDatabase` mengembalikan ArrayList dari objek DataBarang yang berisi data dari tabel produk. Kode ini mengelola exception dan menutup koneksi database sebelum mengembalikan ArrayList.
  -   [ ] Update.java

  Kelas Update berfungsi untuk memperbarui data dalam database menggunakan JDBC (Java Database Connectivity). Terdapat dua metode `updateData`, yang pertama digunakan untuk memperbarui jumlah produk, sementara yang kedua digunakan untuk memperbarui harga dan jumlah produk. Kode ini menggunakan statement SQL `UPDATE` untuk mengubah data dalam tabel produk berdasarkan nama produk yang diberikan. Setelah operasi update selesai, pesan yang sesuai akan ditampilkan. Kode ini juga mengelola exception terkait dan menutup koneksi database setelah selesai.
   -   [ ] DataBarang.java
           
  Kelas `DataBarang` digunakan untuk merepresentasikan informasi tentang barang dalam aplikasi kasir. Kelas ini memiliki variabel instance untuk menyimpan nama produk, harga produk, dan jumlah produk. Terdapat konstruktor yang memungkinkan inisialisasi objek dengan kombinasi yang berbeda dari parameter, serta metode getter dan setter untuk mengakses dan mengubah nilai dari variabel instance. Kelas ini digunakan dalam aplikasi kasir untuk mengelola data barang dan digunakan dalam berbagai operasi seperti memasukkan data baru, memperbarui data, atau membaca data dari database.
		
  -   [ ] app.java
  
  Kelas `App` adalah kelas utama yang berfungsi sebagai inisiasi untuk aplikasi kasir dan sebagai tempat di mana program GUI Swing dibangun. Dalam kelas ini, Anda dapat membuat antarmuka pengguna dengan menggunakan komponen GUI Swing, seperti tombol, label, dan jendela, serta mengatur tampilan dan perilaku elemen GUI. Kelas `App` juga menggunakan kelas-kelas sebelumnya, seperti `Connect`, `Create`, `Read`, `Update`, dan `Delete`, untuk mengakses database, melakukan operasi CRUD (Create, Read, Update, Delete), dan mengelola data barang. Dengan mengintegrasikan logika bisnis dari kelas-kelas lainnya, kelas `App` bertanggung jawab dalam mengatur alur program, menangani interaksi pengguna, dan memastikan aplikasi kasir berjalan dengan baik melalui antarmuka grafis yang telah dibuat.
      
    
