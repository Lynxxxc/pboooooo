package Internasional;

import KelasG.Mahasiswa;

public class MahasiswaInternasional extends Mahasiswa {

    public MahasiswaInternasional(String nama, String nim, String kelas, int umur, String jurusan) {
        super(nama, nim, kelas, umur, jurusan);
    }

    public void perkenalan() {
        System.out.println("Nama saya adalah " + nama);      // public: bisa
        System.out.println("NIM saya adalah " + nim);        // protected: bisa karena subclass
        // System.out.println("Kelas saya " + kelas);        // private: tidak bisa
        // System.out.println("Jurusan saya " + jurusan);    // default: tidak bisa beda package
    }

    public static void main(String[] args) {
        MahasiswaInternasional mhs = new MahasiswaInternasional("Lina", "456", "H", 20, "Sistem Informasi");
        mhs.perkenalan();
    }
}
