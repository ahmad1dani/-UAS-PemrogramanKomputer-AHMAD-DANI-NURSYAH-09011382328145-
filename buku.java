import java.util.Scanner;

public class Buku {
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private boolean dipinjam;

    // Konstruktor untuk inisialisasi atribut buku
    public Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.dipinjam = false; // Awalnya buku tidak dipinjam
    }

    // Metode untuk menampilkan informasi buku
    public void tampilkanInfo() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println("Status: " + (dipinjam ? "Dipinjam" : "Tersedia"));
        System.out.println();
    }

    // Metode untuk meminjam buku
    public void pinjamBuku() {
        if (dipinjam) {
            System.out.println("Buku ini sudah dipinjam.");
        } else {
            System.out.println("Anda berhasil meminjam buku.");
            dipinjam = true;
        }
    }

    public static void main(String[] args) {
        // Membuat objek buku
        Buku buku1 = new Buku("Harry Potter", "J.K. Rowling", 2001);
        Buku buku2 = new Buku("Java Programming", "John Doe", 2020);

        // Menampilkan informasi buku sebelum dipinjam
        System.out.println("Informasi Buku Sebelum Dipinjam:");
        buku1.tampilkanInfo();
        buku2.tampilkanInfo();

        // Meminjam buku
        buku1.pinjamBuku();
        buku2.pinjamBuku();

        // Menampilkan informasi buku setelah dipinjam
        System.out.println("Informasi Buku Setelah Dipinjam:");
        buku1.tampilkanInfo();
        buku2.tampilkanInfo();
    }
}
