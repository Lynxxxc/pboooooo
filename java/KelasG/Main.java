package KelasG;

public class Main {

    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("Alfandi", "123", "G", 19, "Informatika");

        System.out.println("Akses di package yang sama (KelasG):");
        System.out.println("Nama: " + mhs1.nama);      // public: bisa
        System.out.println("NIM: " + mhs1.nim);        // protected: bisa (masih satu package)
        // System.out.println("Kelas: " + mhs1.kelas); // private: tidak bisa
        System.out.println("Kelas (getter): " + mhs1.getKelas());

        System.out.println("Jurusan: " + mhs1.jurusan); // default: bisa (satu package)
    }
}
