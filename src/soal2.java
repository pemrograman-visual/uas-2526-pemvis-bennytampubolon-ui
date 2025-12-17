//benny tampubolon- 12s25044
//nayla panjaitan-12s25060import java.util.*;
import java.lang.Math;

public class soal2 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, i, stokawal, terjual, sisa;
        String nama, status;

        n = Integer.parseInt(input.nextLine());
        for (i = 1; i <= n; i++) {
            nama = input.nextLine();
            stokawal = Integer.parseInt(input.nextLine());
            terjual = Integer.parseInt(input.nextLine());
            if (stokawal < terjual) {
                System.out.println("Invalid");
                terjual = Integer.parseInt(input.nextLine());
                sisa = stokawal - terjual;
                if (sisa == 0) {
                    status = "Habis, segera restock!";
                } else {
                    if (sisa < 5) {
                        status = "stok menipis";
                    } else {
                        status = "Stok aman.";
                    }
                }
            } else {
                sisa = stokawal - terjual;
                if (sisa == 0) {
                    status = "Habis, segera restock!";
                } else {
                    if (sisa < 5) {
                        status = "stok menipis";
                    } else {
                        status = "Stok aman.";
                    }
                }
            }
            System.out.println(nama + stokawal + terjual + sisa + status);
        }
    }
}
