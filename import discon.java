import java.util.Scanner;

public class dani {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah pembelian dari pelanggan
        System.out.print("Masukkan jumlah barang yang dibeli: ");
        int jumlahPembelian = scanner.nextInt();

        // Input harga barang per unit
        System.out.print("Masukkan harga barang per unit: ");
        double hargaPerUnit = scanner.nextDouble();

        // Hitung total harga tanpa diskon
        double totalHarga = jumlahPembelian * hargaPerUnit;

        // Berikan diskon berdasarkan jumlah pembelian
        double diskon = 0.0;
        if (jumlahPembelian >= 5 && jumlahPembelian <= 10) {
            diskon = 0.05; // Diskon 5%
        } else if (jumlahPembelian >= 11 && jumlahPembelian <= 20) {
            diskon = 0.1; // Diskon 10%
        } else if (jumlahPembelian > 20) {
            diskon = 0.2; // Diskon 20%
        }

        // Hitung total harga setelah diskon
        double totalHargaSetelahDiskon = totalHarga - (totalHarga * diskon);

        // Tampilkan total harga setelah diskon
        System.out.println("Total harga setelah diskon: " + totalHargaSetelahDiskon);

        scanner.close();
    }
}
