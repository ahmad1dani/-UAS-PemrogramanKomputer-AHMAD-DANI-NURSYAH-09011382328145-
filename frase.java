import java.util.Scanner;

public class frase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca input dari pengguna
        System.out.print("Masukkan kata atau frase: ");
        String input = scanner.nextLine();

        // Menghapus spasi dan mengubah ke huruf kecil
        String cleanedInput = input.replaceAll("\\s", "").toLowerCase();

        // Menjalankan metode untuk mengecek palindrom
        if (isPalindrom(cleanedInput)) {
            System.out.println("'" + input + "' adalah palindrom.");
        } else {
            System.out.println("'" + input + "' bukan palindrom.");
        }

        scanner.close();
    }

    // Metode untuk mengecek apakah sebuah string adalah palindrom atau tidak
    public static boolean isPalindrom(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
