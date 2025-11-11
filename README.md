# Sampahin-Tugas1
Ini adalah aplikasi desktop sederhana yang dibangun menggunakan JavaFX dengan menerapkan pola desain Model-View-Controller (MVC).

Aplikasi ini berfungsi sebagai alat pencatatan data sampah harian, memungkinkan pengguna untuk mengelola inventaris sampah secara digital.

Fungsionalitas Utama:
Create (Tambah): Pengguna dapat memasukkan data sampah baru melalui form, yang mencakup nama sampah (via TextField), jenis sampah (via ComboBox), dan tanggal input (via DatePicker).

Read (Baca): Semua data yang telah dimasukkan akan ditampilkan secara real-time dalam sebuah tabel (TableView) yang terstruktur.

Update (Ubah): Pengguna dapat mengklik data yang ada di tabel, yang kemudian akan otomatis mengisi form. Pengguna bisa mengubah data tersebut dan menyimpannya kembali.

Delete (Hapus): Pengguna dapat memilih data di tabel dan menghapusnya dari daftar.

Aspek Teknis (Sesuai Tugas):
Model: Menggunakan kelas Sampah.java untuk mendefinisikan struktur data (atribut: nama, jenis, tanggal).

View: Menggunakan file FXML (DataSampahView.fxml) untuk mendesain seluruh tata letak antarmuka (UI).

Controller: Menggunakan kelas DataSampahController.java untuk menangani semua logika, event handling (klik tombol), dan manipulasi data.

Penyimpanan: Data tidak disimpan ke database. Aplikasi ini menggunakan ObservableList di dalam Controller sebagai penyimpanan in-memory (data akan hilang saat aplikasi ditutup).
