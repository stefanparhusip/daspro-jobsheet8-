import java.util.Scanner;

public class Percobaan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] totalPerProduk = new int[3];
        int totalSemuaHari = 0;

        for (int hari = 1; hari <= 4; hari++) {
            int totalHari = 0;
            System.out.println("Hari ke-" + hari);

            for (int produk = 0; produk < 3; produk++) {
                System.out.print("Masukkan jumlah produk " + (produk + 1) + ": ");
                int jumlah = input.nextInt();

                totalPerProduk[produk] += jumlah;
                totalHari += jumlah;
            }

            totalSemuaHari += totalHari;
            System.out.println("Total semua produk hari ke-" + hari + ": " + totalHari);
            System.out.println();
        }

        System.out.println("Total produk 1 selama 4 hari: " + totalPerProduk[0]);
        System.out.println("Total produk 2 selama 4 hari: " + totalPerProduk[1]);
        System.out.println("Total produk 3 selama 4 hari: " + totalPerProduk[2]);
        System.out.println("Total seluruh produk selama 4 hari: " + totalSemuaHari);

        input.close();
    }
}
