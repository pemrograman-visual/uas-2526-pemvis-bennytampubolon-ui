//benny tampubolon- 12s25044
//nayla panjaitan-12s25060import java.util.*;
import java.lang.Math;

public class soal5 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, i, gaji, semester;
        double ipk;
        String nama;

        n = Integer.parseInt(input.nextLine());
        for (i = 1; i <= n; i++) {
            nama = input.nextLine();
            ipk = Double.parseDouble(input.nextLine());
            gaji = Integer.parseInt(input.nextLine());
            semester = Integer.parseInt(input.nextLine());
            if (ipk >= 3.0 && semester >= 3 && gaji <= 3000000) {
                System.out.println(nama && "lolos syarat awal");
            } else {
                System.out.println(nama && "tidak lolos");
            }
        }
    }
}
