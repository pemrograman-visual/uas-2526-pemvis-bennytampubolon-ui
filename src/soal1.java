
//benny tampubolon- 12s25044
//nayla panjaitan-12s25060
import java.util.*;
import java.lang.Math;

public class soal1 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, i, rating, tertinggi, terendah, count;
        double ratarata, total;
        String status;
        int[] data = new int[7];

        total = 0;
        count = 0;
        tertinggi = -9999999;
        terendah = 99999;
        n = Integer.parseInt(input.nextLine());
        for (i = 0; i <= n - 1; i++) {
            rating = Integer.parseInt(input.nextLine());
            if (rating > 5 && rating < 1) {
                System.out.println("invalid");
                rating[3] = Integer.parseInt(input.nextLine());
            } else {
                data[i] = rating;
                total = total + rating;
                if (rating > tertinggi) {
                    tertinggi = rating;
                }
                if (rating < terendah) {
                    terendah = rating;
                }
                if (rating >= 4) {
                    count = count + 1;
                }
            }
        }
        ratarata = total / 6;
        if (ratarata >= 4) {
            status = "kantin dalam kondisi baik";
        } else {
            if (ratarata >= 3) {
                status = "Kondisi cukup, masih perlu peningkatan";
            } else {
                status = "Kantin perlu evaluasi manajemen!";
            }
        }
        System.out.println("daftar rating:" + data[0] + data[1] + data[2] + data[3] + data[4] + data[5]);
        System.out.println("rataarata:" + ratarata);
        System.out.println("tertinggi:" + tertinggi);
        System.out.println("terendah:" + terendah);
        System.out.println("reviewer rating>4:" + count + "orang");
        System.out.println(status);
    }
}
