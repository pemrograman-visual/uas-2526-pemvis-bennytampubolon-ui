//benny tampubolon- 12s25044
//nayla panjaitan-12s25060
import java.util.*;
import java.lang.Math;

public class soal3 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String nama;
        int jumlahperangkat, konsumsi, n, i, totalkamar, daya, j, totalsiswa;

        totalkamar = 0;
        n = Integer.parseInt(input.nextLine());
        for (i = 1; i <= n; i++) {
            nama = input.nextLine();
            jumlahperangkat = Integer.parseInt(input.nextLine());
            totalsiswa = 0;
            for (j = 1; j <= jumlahperangkat; j++) {
                daya = Integer.parseInt(input.nextLine());
                totalsiswa = totalsiswa + daya;
            }
            System.out.println(nama + "=" + daya + "wh");
        }
    }
}
