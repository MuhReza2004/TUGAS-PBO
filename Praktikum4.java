// NAMA    : MUH. REZA
// NIM     : 13020220070
// TANGGAL : 20/02/2024

import java.util.Scanner;

public class Praktikum4 {
    public static void main(String[] args) {

        int a;
        Scanner masukan;

        System.out.print("Contoh membaca dan Menulis, ketik nilai integer: ");
        masukan = new Scanner(System.in);
        a = masukan.nextInt();
        System.out.print("Nilai yang dibaca : " + a);

        masukan.close();
    }
}
