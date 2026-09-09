# 😶‍🌫️ Sistem Manajemen Jasa Cuci Sepatu

## 📌 Deskripsi Singkat

**Sistem Manajemen Jasa Cuci Sepatu** merupakan program berbasis Java yang dibuat untuk membantu mengelola proses jasa cuci sepatu secara sederhana.
Program ini dapat digunakan untuk mengelola data pelanggan, data sepatu, serta transaksi jasa cuci sepatu. Program menerapkan konsep dasar **Pemrograman Berorientasi Objek (PBO)** dan memiliki fitur CRUD (*Create, Read, Update, Delete*).

Program dibuat menggunakan **Java** dan dikembangkan menggunakan **NetBeans**.

---

## 🎯 Tujuan Program

Program ini dibuat untuk:

- Mempermudah pengelolaan data pelanggan.
- Menyimpan informasi sepatu pelanggan.
- Mencatat transaksi jasa cuci sepatu.
- Mengelola status proses pencucian.
- Menerapkan konsep dasar Pemrograman Berorientasi Objek.

---

## ✨ Fitur Program

Program memiliki beberapa menu utama:

### 1. ➕ Tambah Data
Digunakan untuk menambahkan data pelanggan, sepatu, dan transaksi jasa cuci sepatu.

### 2. 📋 Lihat Data
Digunakan untuk menampilkan seluruh data transaksi yang telah tersimpan.

### 3. ✏️ Ubah Data
Digunakan untuk mengubah data tertentu pada transaksi, seperti nama pelanggan, nomor telepon, jenis layanan, dan status transaksi.

### 4. 🗑️ Hapus Data
Digunakan untuk menghapus data transaksi berdasarkan ID transaksi.

### 5. 🔎 Cari Data
Digunakan untuk mencari data transaksi berdasarkan ID transaksi.

### 6. 🚪 Keluar
Digunakan untuk keluar dari program.

---

## 🏗️ Struktur Class

Program terdiri dari **3 class entitas** dan **1 class entry point**.

### 👤 Pelanggan

Class `Pelanggan` digunakan untuk menyimpan informasi pelanggan.

Atribut:
- `idPelanggan`
- `nama`
- `noTelepon`
- `alamat`

### 👟 Sepatu

Class `Sepatu` digunakan untuk menyimpan informasi sepatu pelanggan.

Atribut:
- `idSepatu`
- `merek`
- `jenis`
- `warna`

### 🧾 Transaksi

Class `Transaksi` digunakan untuk menyimpan informasi transaksi jasa cuci sepatu.

Atribut:
- `idTransaksi`
- `pelanggan`
- `sepatu`
- `jenisLayanan`
- `harga`
- `status`

### ▶️ Minpro1JasaCuciSepatu

Class `Minpro1JasaCuciSepatu` merupakan **entry point** program.

Class ini digunakan untuk:
- Menampilkan menu.
- Menerima input pengguna.
- Menjalankan proses CRUD.
- Mengelola `ArrayList`.
- Mengatur alur program.

---

## 🔄 Alur Program

Alur program dimulai dengan menampilkan menu utama kepada pengguna.
<img width="485" height="677" alt="image" src="https://github.com/user-attachments/assets/4f4d7944-d01b-4766-b548-e1d6c69faa77" />

## Penjelasan Alur Program
Ketika program pertama kali dijalankan, program akan menampilkan menu utama Sistem Manajemen Jasa Cuci Sepatu. Menu utama terdiri dari enam pilihan, yaitu Tambah Data, Lihat Data, Ubah Data, Hapus Data, Cari Data, dan Keluar.

<img width="317" height="166" alt="image" src="https://github.com/user-attachments/assets/4df64799-bc83-4bef-b2c9-739e6595adb3" />


Pengguna memilih menu dengan memasukkan angka sesuai dengan pilihan yang tersedia. Program menggunakan percabangan `switch` untuk menentukan proses yang akan dijalankan berdasarkan pilihan pengguna.

### Tambah Data
Jika pengguna memilih menu Tambah Data, program akan meminta pengguna memasukkan data transaksi.
Pertama, pengguna memasukkan ID transaksi. Program akan melakukan pengecekan untuk memastikan ID transaksi belum digunakan.
Selanjutnya pengguna memasukkan data pelanggan yang terdiri dari ID pelanggan, nama, nomor telepon, dan alamat. Setelah itu pengguna memasukkan data sepatu yang terdiri dari ID sepatu, merek, jenis sepatu, dan warna.
Setelah data pelanggan dan sepatu dimasukkan, pengguna memilih jenis layanan yang tersedia. Program kemudian menentukan harga berdasarkan layanan yang dipilih. Setelah seluruh data lengkap, object `Pelanggan`, `Sepatu`, dan `Transaksi` dibuat menggunakan constructor. Data tersebut kemudian disimpan ke dalam `ArrayList`.
Status awal transaksi akan diberikan sebagai "Menunggu".

<img width="267" height="381" alt="image" src="https://github.com/user-attachments/assets/7e3c1a20-bcfd-4e92-bea1-379fab94cbf8" />

## Lihat Data
Jika pengguna memilih menu Lihat Data, program akan menampilkan seluruh transaksi yang telah disimpan.
Program terlebih dahulu mengecek apakah `ArrayList` transaksi memiliki data. Jika belum terdapat data, program akan menampilkan pesan bahwa belum ada data transaksi.
Jika terdapat data, program menggunakan perulangan `for-each` untuk mengambil setiap transaksi yang tersimpan dan menampilkannya.
Informasi yang ditampilkan meliputi ID transaksi, nama pelanggan, nomor telepon, merek sepatu, jenis sepatu, warna, jenis layanan, harga, dan status transaksi.

<img width="355" height="267" alt="image" src="https://github.com/user-attachments/assets/970cdc3d-1060-4354-9673-5388baba9c06" />

## Ubah Data
Jika pengguna memilih menu Ubah Data, pengguna diminta memasukkan ID transaksi yang ingin diubah.
Program kemudian mencari transaksi tersebut. Jika ID transaksi tidak ditemukan, program akan menampilkan pesan bahwa data tidak ditemukan.
Jika data ditemukan, pengguna dapat memilih bagian data yang ingin diubah, yaitu nama pelanggan, nomor telepon, jenis layanan, atau status transaksi.
Data yang telah diubah akan diperbarui menggunakan setter dan disimpan kembali pada object transaksi.

<img width="260" height="365" alt="image" src="https://github.com/user-attachments/assets/783e7e67-e508-4233-ab75-91f3d4ee39aa" />

## Hapus Data
Jika pengguna memilih menu Hapus Data, pengguna diminta memasukkan ID transaksi.
Program akan mencari transaksi berdasarkan ID tersebut. Jika data ditemukan, transaksi akan dihapus dari `ArrayList` menggunakan method `remove()`.
Jika ID transaksi tidak ditemukan, program akan memberikan pesan bahwa data tidak ditemukan.

<img width="357" height="82" alt="image" src="https://github.com/user-attachments/assets/b06cf3a7-cdba-459c-a8a0-775e84c3c9af" />

## Cari Data
Jika pengguna memilih menu Cari Data, pengguna memasukkan ID transaksi yang ingin dicari.
Program akan melakukan pencarian menggunakan perulangan pada `ArrayList`. Setiap ID transaksi akan dibandingkan dengan ID yang dimasukkan pengguna.
Jika ID ditemukan, informasi transaksi akan ditampilkan. Jika tidak ditemukan, program akan menampilkan pesan bahwa data tidak ditemukan.

<img width="265" height="283" alt="image" src="https://github.com/user-attachments/assets/2024a5be-b8dd-4f67-9b39-e06ff9ccfb57" />

## Keluar
Jika pengguna memilih menu Keluar atau pilihan nomor 6, program akan menampilkan pesan bahwa program selesai dan kemudian menghentikan perulangan menu.
Program menggunakan perulangan `do-while`, sehingga menu akan terus ditampilkan dan program tidak berhenti selama pengguna belum memilih menu keluar.

<img width="322" height="242" alt="image" src="https://github.com/user-attachments/assets/0e411745-a05a-483e-8e3a-56ec0701cdd6" />

## Penjelasan letak penerapan nilai tambah
Pada program Sistem Manajemen Jasa Cuci Sepatu, saya juga menerapkan beberapa nilai tambah yang diberikan pada ketentuan tugas. Nilai tambah yang digunakan yaitu Access Modifier, Encapsulation, dan Input Validation.

## Access Modifier
Access Modifier digunakan untuk mengatur siapa yang bisa mengakses data yang ada di dalam sebuah class. Pada program ini, saya menggunakan private pada data yang ada di class Pelanggan, Sepatu, dan Transaksi. Contohnya seperti nama pelanggan, nomor telepon, merek sepatu, jenis sepatu, harga, dan status transaksi. Dengan menggunakan private, data tersebut tidak bisa diubah atau diambil secara langsung dari luar class.

## Encapsulation
Encapsulation digunakan supaya data yang ada di dalam class lebih teratur dan tidak bisa diakses sembarangan. Pada program ini, karena data dibuat private, saya menggunakan getter dan setter untuk mengambil atau mengubah data tersebut. Misalnya, ketika program ingin menampilkan nama pelanggan, program mengambilnya melalui getter. Sedangkan jika ingin mengubah nama atau status transaksi, program dapat menggunakan setter. Penerapan ini terdapat pada class Pelanggan, Sepatu, dan Transaksi.

## Input Validation
Input Validation digunakan untuk memastikan data yang dimasukkan pengguna sesuai dengan yang dibutuhkan oleh program. Pada program ini, validasi dilakukan ketika pengguna memasukkan data. Jika pengguna tidak mengisi data atau hanya menekan Enter, program akan meminta pengguna untuk mengisi data kembali. Selain itu, untuk bagian yang membutuhkan input angka, program akan mengecek apakah input yang dimasukkan benar-benar berupa angka. Jika bukan angka, program akan memberikan pesan kesalahan dan meminta input kembali.










