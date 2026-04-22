package KelasG;

public class Mahasiswa {

    public String nama;
    protected String nim;
    private String kelas;
    public int umur;
    String jurusan; 

    public Mahasiswa(String nama, String nim, String kelas, int umur, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        this.umur = umur;
        this.jurusan = jurusan;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
}
