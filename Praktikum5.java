// NAMA    : MUH. REZA
// NIM     : 13020220070
// TANGGAL : 20/02/2024

import java.io.BufferedReader;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;

import java.io.IOException;

public class Praktikum5 {
    public static void main(String[] args) throws IOException {
        char cc;
        int bil;

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader dataIn = new BufferedReader(isr);

        System.out.print("hello\n");
        System.out.print("baca 1 karakter : ");

        cc = dataIn.readLine().charAt(0);
        System.out.print("baca 1 bilangan : ");

        bil = Integer.parseInt(dataIn.readLine());
        String kar = JOptionPane.showInputDialog("Karakter 1 : ");
        System.out.println(kar);
        System.out.print(cc + "\n" + bil + "\n");
        System.out.print("bye \n");
    }
}
