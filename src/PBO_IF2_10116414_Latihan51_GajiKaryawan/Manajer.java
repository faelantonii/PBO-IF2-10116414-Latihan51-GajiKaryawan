/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_IF2_10116414_Latihan51_GajiKaryawan;

/**
 *
 * @author sweenutt
 * Nama       : Fael Antoni Wijaya 
 * Kelas      : PBO2/IF 2 
 * Nim        : 10116414
 * Deskripsi  : Program menampilkan data gaji karyawan
 */
public class Manajer extends Karyawan{
    private int kehadiran;
    private float tunjanganGolongan;
    private float tunjanganJabatan;
    private float tunjanganKehadiran;

    public int getKehadiran() {
        return kehadiran;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }
    
    public float tunjanganKehadiran(int hadir) {
        tunjanganKehadiran = hadir * 10000;
        return tunjanganKehadiran;
    }
    
    public float tunjanganJabatan(String jabatan) {
        if(jabatan.equalsIgnoreCase("Manager")) {
            tunjanganJabatan = 2000000;
            return tunjanganJabatan;
        } else if(jabatan.equalsIgnoreCase("Kabag")) {
            tunjanganJabatan = 1000000;
            return tunjanganJabatan;
        }
        return 0;
    }
    
    public float tunjanganGolongan(int golongan) {
        if (golongan == 1) {
            tunjanganGolongan = 500000;
            return tunjanganGolongan;
        } else if (golongan == 2) {
            tunjanganGolongan = 1000000;
            return tunjanganGolongan;
        } else if (golongan == 3) {
            tunjanganGolongan = 1500000;
            return tunjanganGolongan;
        } else {
            tunjanganGolongan = 0;
            return tunjanganGolongan;
        }
    }
    
    public float gajiTotal() {
        return this.tunjanganGolongan + this.tunjanganJabatan + this.tunjanganKehadiran;
    }
}
