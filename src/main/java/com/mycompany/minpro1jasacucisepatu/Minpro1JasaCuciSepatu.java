

package com.mycompany.minpro1jasacucisepatu;

import java.util.ArrayList;
import java.util.Scanner;

public class Minpro1JasaCuciSepatu {

    static Scanner input = new Scanner(System.in);

    static ArrayList<Pelanggan> daftarPelanggan = new ArrayList<>();
    static ArrayList<Sepatu> daftarSepatu = new ArrayList<>();
    static ArrayList<Transaksi> daftarTransaksi = new ArrayList<>();

    public static void main(String[] args) {

        int pilihan;

        do {
            System.out.println(" SISTEM MANAJEMEN JASA CUCI SEPATU");
            System.out.println("1. Tambah Data");
            System.out.println("2. Lihat Data");
            System.out.println("3. Ubah Data");
            System.out.println("4. Hapus Data");
            System.out.println("5. Cari Data");
            System.out.println("6. Keluar");

            pilihan = inputInt("Pilih menu: ");

            switch (pilihan) {

                case 1:
                    tambahData();
                    break;

                case 2:
                    tampilkanData();
                    break;

                case 3:
                    ubahData();
                    break;

                case 4:
                    hapusData();
                    break;

                case 5:
                    cariData();
                    break;

                case 6:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Menu tidak tersedia!");
            }

        } while (pilihan != 6);
    }

    // tambah data
    static void tambahData() {

        System.out.println("===== TAMBAH DATA =====");

        String idTransaksi;

        while (true) {

            idTransaksi = inputString("ID Transaksi: ");

            if (cariTransaksi(idTransaksi) != null) {
                System.out.println("ID transaksi sudah digunakan!");
            } else {
                break;
            }
        }

        String idPelanggan = inputString("ID Pelanggan: ");
        String nama = inputString("Nama Pelanggan: ");
        String noTelepon = inputString("No. Telepon: ");
        String alamat = inputString("Alamat: ");

        Pelanggan pelanggan = new Pelanggan(
                idPelanggan,
                nama,
                noTelepon,
                alamat
        );

        daftarPelanggan.add(pelanggan);

        String idSepatu = inputString("ID Sepatu: ");
        String merek = inputString("Merek Sepatu: ");
        String jenis = inputString("Jenis Sepatu: ");
        String warna = inputString("Warna Sepatu: ");

        Sepatu sepatu = new Sepatu(
                idSepatu,
                merek,
                jenis,
                warna
        );

        daftarSepatu.add(sepatu);

        System.out.println("===== PILIH LAYANAN =====");
        System.out.println("1. Fast Clean  - Rp20.000");
        System.out.println("2. Deep Clean  - Rp35.000");
        System.out.println("3. Special Care - Rp50.000");

        int pilihanLayanan;

        while (true) {

            pilihanLayanan = inputInt("Pilih layanan: ");

            if (pilihanLayanan >= 1 && pilihanLayanan <= 3) {
                break;
            }

            System.out.println("Pilihan layanan hanya 1-3!");
        }

        String jenisLayanan;
        int harga;

        if (pilihanLayanan == 1) {

            jenisLayanan = "Fast Clean";
            harga = 20000;

        } else if (pilihanLayanan == 2) {

            jenisLayanan = "Deep Clean";
            harga = 35000;

        } else {

            jenisLayanan = "Special Care";
            harga = 50000;
        }

        Transaksi transaksi = new Transaksi(
                idTransaksi,
                pelanggan,
                sepatu,
                jenisLayanan,
                harga,
                "Menunggu"
        );

        daftarTransaksi.add(transaksi);

        System.out.println("\nData berhasil ditambahkan!");
    }

    // liat data
    static void tampilkanData() {

        System.out.println("\n===== DATA TRANSAKSI =====");

        if (daftarTransaksi.isEmpty()) {

            System.out.println("Belum ada data transaksi.");

        } else {

            for (Transaksi transaksi : daftarTransaksi) {

                transaksi.tampilkanData();

                System.out.println("--------------------------------------");
            }
        }
    }

    // ubah data
    static void ubahData() {

        System.out.println("===== UBAH DATA =====");

        String id = inputString("Masukkan ID transaksi: ");

        Transaksi transaksi = cariTransaksi(id);

        if (transaksi == null) {

            System.out.println("Data tidak ditemukan!");
            return;
        }

        System.out.println("Data ditemukan.");
        System.out.println("1. Nama pelanggan");
        System.out.println("2. No. telepon");
        System.out.println("3. Jenis layanan");
        System.out.println("4. Status");

        int pilihan = inputInt("Pilih: ");

        switch (pilihan) {

            case 1:

                String namaBaru = inputString("Nama baru: ");

                transaksi.getPelanggan().setNama(namaBaru);

                System.out.println("Nama berhasil diubah.");

                break;

            case 2:

                String noBaru = inputString("No. telepon baru: ");

                transaksi.getPelanggan().setNoTelepon(noBaru);

                System.out.println("No. telepon berhasil diubah.");

                break;

            case 3:

                System.out.println("1. Fast Clean - Rp20.000");
                System.out.println("2. Deep Clean - Rp35.000");
                System.out.println("3. Special Care - Rp50.000");

                int layanan = inputInt("Pilih layanan baru: ");

                if (layanan == 1) {

                    transaksi.setJenisLayanan("Fast Clean");
                    transaksi.setHarga(20000);

                } else if (layanan == 2) {

                    transaksi.setJenisLayanan("Deep Clean");
                    transaksi.setHarga(35000);

                } else if (layanan == 3) {

                    transaksi.setJenisLayanan("Special Care");
                    transaksi.setHarga(50000);

                } else {

                    System.out.println("Pilihan tidak tersedia!");
                    return;
                }

                System.out.println("Layanan berhasil diubah.");

                break;

            case 4:

                System.out.println("1. Menunggu");
                System.out.println("2. Dicuci");
                System.out.println("3. Selesai");
                System.out.println("4. Diambil");

                int status = inputInt("Pilih status: ");

                if (status == 1) {

                    transaksi.setStatus("Menunggu");

                } else if (status == 2) {

                    transaksi.setStatus("Dicuci");

                } else if (status == 3) {

                    transaksi.setStatus("Selesai");

                } else if (status == 4) {

                    transaksi.setStatus("Diambil");

                } else {

                    System.out.println("Status tidak tersedia!");
                    return;
                }

                System.out.println("Status berhasil diubah.");

                break;

            default:

                System.out.println("Pilihan tidak tersedia!");
        }
    }
    // hapus data
    static void hapusData() {

        System.out.println("===== HAPUS DATA =====");

        String id = inputString("Masukkan ID transaksi: ");

        Transaksi transaksi = cariTransaksi(id);

        if (transaksi == null) {

            System.out.println("Data tidak ditemukan!");

        } else {

            daftarTransaksi.remove(transaksi);

            System.out.println("Data berhasil dihapus!");
        }
    }

    // cari dataaaaaaaaaa
    
    static void cariData() {

        System.out.println("===== CARI DATA =====");

        String id = inputString("Masukkan ID transaksi: ");

        Transaksi transaksi = cariTransaksi(id);

        if (transaksi == null) {

            System.out.println("Data tidak ditemukan!");

        } else {

            System.out.println("Data ditemukan:");

            transaksi.tampilkanData();
        }
    }

    // carii transaksiiiiiiiiii
    static Transaksi cariTransaksi(String id) {

        for (Transaksi transaksi : daftarTransaksi) {

            if (transaksi.getIdTransaksi().equalsIgnoreCase(id)) {

                return transaksi;
            }
        }

        return null;
    }

    // yg ini nilai tambah validasi input
    static String inputString(String pesan) {

        while (true) {

            System.out.print(pesan);

            String data = input.nextLine().trim();

            if (!data.isEmpty()) {

                return data;
            }

            System.out.println("Input tidak boleh kosong!");
        }
    }

    // validasi input angka
    static int inputInt(String pesan) {

        while (true) {

            System.out.print(pesan);

            try {

                return Integer.parseInt(input.nextLine());

            } catch (NumberFormatException e) {

                System.out.println("Input harus berupa angka!");
            }
        }
    }
}

