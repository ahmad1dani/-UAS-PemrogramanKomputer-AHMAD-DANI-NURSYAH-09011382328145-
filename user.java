import java.util.Scanner;

public class USER {
    public static void main(String[] args) {
        // Menentukan username dan password yang valid
        String usernameValid = "DANI145";
        String passwordValid = "pass123";

        // Membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan username: ");
        String usernameInput = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String passwordInput = scanner.nextLine();

        // Melakukan autentikasi
        if (usernameInput.equals(usernameValid) && passwordInput.equals(passwordValid)) {
            System.out.println("Autentikasi Berhasil");
        } else {
            System.out.println("Autentikasi Gagal");
        }

        scanner.close();
    }
}
