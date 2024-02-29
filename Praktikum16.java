// NAMA    : MUH. REZA
// NIM     : 13020220070
// TANGGAL : 20/02/2024

public class Praktikum16 {
    public static void main(String[] args) {

        boolean Bool1, Bool2, TF, res;
        int i = 5, j = 2, hsl;
        float x = 5, y = 5;

        System.out.println(
                "Silahkan baca teksnya dan tambahkan perintah program di bawah ini untuk menampilkan output program");
        Bool1 = true;
        Bool2 = false;
        // Operasi boolean
        TF = Bool1 && Bool2; // Boolean AND
        System.out.println("Bool1 && Bool2 = " + TF);

        TF = Bool1 || Bool2; // Boolean OR
        System.out.println("Bool1 || Bool2 = " + TF);

        TF = !Bool1; // NOT
        System.out.println("!Bool1 = " + TF);

        TF = Bool1 ^ Bool2; // XOR
        System.out.println("Bool1 ^ Bool2 = " + TF);

        hsl = i + j; // Penjumlahan
        System.out.println("i + j = " + hsl);

        hsl = i - j; // Pengurangan
        System.out.println("i - j = " + hsl);

        hsl = i / j; // Pembagian
        System.out.println("i / j = " + hsl);

        hsl = i * j; // Perkalian
        System.out.println("i * j = " + hsl);

        hsl = i / j; // Pembagian bulat
        System.out.println("i / j (pembagian bulat) = " + hsl);

        hsl = i % j; // Sisa modulo
        System.out.println("i % j (sisa modulo) = " + hsl);

        res = (i == j); // Sama dengan
        System.out.println("i == j : " + res);

        res = (i != j); // Tidak sama dengan
        System.out.println("i != j : " + res);

        res = (i < j); // Kurang dari
        System.out.println("i < j : " + res);

        res = (i > j); // Lebih dari
        System.out.println("i > j : " + res);

        res = (i <= j); // Kurang dari atau sama dengan
        System.out.println("i <= j : " + res);

        res = (i >= j); // Lebih dari atau sama dengan
        System.out.println("i >= j : " + res);

        // Operasi relasional numerik
        res = (x != y); // Tidak sama dengan
        System.out.println("x != y : " + res);

        res = (x < y); // Kurang dari
        System.out.println("x < y : " + res);

        res = (x > y); // Lebih dari
        System.out.println("x > y : " + res);

        res = (x <= y); // Kurang dari atau sama dengan
        System.out.println("x <= y : " + res);

        res = (x >= y); // Lebih dari atau sama dengan
        System.out.println("x >= y : " + res);
    }
}
