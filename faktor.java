import java.util.Scanner;

public class faktor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca input dari pengguna
        System.out.print("Masukkan bilangan bulat positif: ");
        int bilangan = scanner.nextInt();

        // Menampilkan hasil faktorisasi
        System.out.print("Faktorisasi " + bilangan + ": ");
        faktorisasi(bilangan);

        scanner.close();
    }

    // Fungsi untuk melakukan faktorisasi dan menampilkan hasilnya
    public static void faktorisasi(int n) {
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i);
                n /= i;
                if (n > 1) {
                    System.out.print(" * ");
                }
            }
        }
    }
}
