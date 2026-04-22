package Dosen;

import KelasG.Mahasiswa;

public class MainDosen {

    public static void main(String[] args) {
        Mahasiswa mhs2 = new Mahasiswa("Rifqi", "123", "G", 12, "Teknik Komputer");

        System.out.println("Akses dari package berbeda (bukan subclass):");
        System.out.println(mhs2.nama);        // public: bisa
        // System.out.println(mhs2.nim);      // protected: tidak bisa (bukan subclass)
        // System.out.println(mhs2.kelas);    // private: tidak bisa
        // System.out.println(mhs2.jurusan);  // default: tidak bisa beda package
    }
}
