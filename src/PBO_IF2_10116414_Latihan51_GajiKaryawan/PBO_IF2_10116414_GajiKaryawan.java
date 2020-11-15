/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_IF2_10116414_Latihan51_GajiKaryawan;

import java.util.Scanner;

/**
 *
 * @author sweenutt
 * Nama       : Fael Antoni Wijaya 
 * Kelas      : PBO2/IF 2 
 * Nim        : 10116414
 * Deskripsi  : Program menampilkan data gaji karyawan
 */
public class PBO_IF2_10116414_GajiKaryawan {
    public static void main(String[] args) {
        
        Karyawan karyawan = new Karyawan();
        Manajer manajer = new Manajer();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("=====Program Perhitungan Gaji Karyawan=====");
        System.out.print("Masukkan NIK : ");
        String nik = scan.next();
        
        System.out.print("Masukkan Nama : ");
        String nama = scan.next();
        
        System.out.print("Masukkan Golongan (1/2/3) : ");
        int golongan = scan.nextInt();
        
        System.out.print("Masukkan Jabatan (Manager/Kabag) : ");
        String jabatan = scan.next();
        
        System.out.print("Masukkan Jumlah Kehadiran : ");
        int hadir = scan.nextInt();
        
        manajer.setNik(nik);
        manajer.setNama(nama);
        manajer.setJabatan(jabatan);
        manajer.setGolongan(golongan);
        manajer.setKehadiran(hadir);
        
        System.out.println();
        System.out.println("=====Hasil Perhitungan=====");
        System.out.println("NIK : " + manajer.getNik());
        System.out.println("NAMA : " + manajer.getNama());
        System.out.println("GOLONGAN : " + manajer.getGolongan());
        System.out.println("JABATAN : " + manajer.getJabatan());
        
        System.out.println();
        System.out.println("TUNJANGAN GOLONGAN : " + manajer.tunjanganGolongan(golongan));
        System.out.println("TUNJANGAN JABATAN : " + manajer.tunjanganJabatan(jabatan));
        System.out.println("TUNJANGAN KEHADIRAN : " + manajer.tunjanganKehadiran(hadir));
        
        System.out.println();
        System.out.println("Gaji Total : " + manajer.gajiTotal());
    }
}

