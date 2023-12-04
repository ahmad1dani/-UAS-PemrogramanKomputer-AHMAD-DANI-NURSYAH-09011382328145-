import java.util.Scanner;

public class akunpengguna {
    private String username;
    private String password;
    private boolean aktif;

    // Konstruktor untuk inisialisasi atribut akun
    public void AkunPengguna(String username, String password) {
        this.username = username;
        this.password = password;
        this.aktif = true; // Awalnya akun aktif
    }

    // Metode untuk menampilkan informasi akun
    public void tampilkanInfo() {
        System.out.println("Username:dani12 " + username);
        System.out.println("Status: " + (aktif ? "Aktif" : "Nonaktif"));
        System.out.println();
    }

    // Metode untuk mengaktifkan akun
    public void aktifkanAkun() {
        if (aktif) {
            System.out.println("Akun ini sudah aktif.");
        } else {
            System.out.println("Anda berhasil mengaktifkan akun.");
            aktif = true;
        }
    }

    // Metode untuk menonaktifkan akun
    public void nonaktifkanAkun() {
        if (!aktif) {
            System.out.println("Akun ini sudah nonaktif.");
        } else {
            System.out.println("Anda berhasil menonaktifkan akun.");
            aktif = false;
        }
    }

    public static void main(String[] args) {
        // Membuat objek akun
        akunpengguna akun1 = new akunpengguna();
        akunpengguna akun2 = new akunpengguna();

        // Menampilkan informasi akun sebelum diaktifkan/nonaktifkan
        System.out.println("Informasi Akun Sebelum Diaktifkan/Nonaktifkan:");
        akun1.tampilkanInfo();
        akun2.tampilkanInfo();

        // Mengaktifkan dan menonaktifkan akun
        akun1.aktifkanAkun();
        akun2.nonaktifkanAkun();

        // Menampilkan informasi akun setelah diaktifkan/nonaktifkan
        System.out.println("Informasi Akun Setelah Diaktifkan/Nonaktifkan:");
        akun1.tampilkanInfo();
        akun2.tampilkanInfo();
    }
}
