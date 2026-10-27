import java.util.Scanner;

public class penjualanPerhari {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalSemua = 0;

        for (int h = 1; h <= 4; h++) {
            int totalProduk = 0;
            System.out.println("Hari ke-" + h + ":");

            for (int p = 1; p <= 3; p++) {
                System.out.print("Produk " + p + " : ");
                int jumlah = sc.nextInt();
                totalProduk += jumlah;
            }

            System.out.println("Total produk di hari ke-" + h + " = " + totalProduk);
            totalSemua += totalProduk;
            System.out.println();
        }

        System.out.println("Total semua produk selama 4 hari = " + totalSemua);

        sc.close();
    }
}