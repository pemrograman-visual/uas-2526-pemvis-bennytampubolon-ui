//benny tampubolon- 12s25044
//nayla panjaitan-12s25060
import java.util.*;
import java.lang.Math;

public class soal4 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, i, terbanyak, terdikit;
        String maxnama, minnama, status;
        double totalshift, ratarata;

        n = Integer.parseInt(input.nextLine());
        String[] nama = new String[n];
        int[] shift = new int[n];

        totalshift = 0;
        terbanyak = -1;
        terdikit = 9999999;
        for (i = 0; i <= n - 1; i++) {
            nama[i] = input.nextLine();
            shift[i] = Integer.parseInt(input.nextLine());
            if (shift[i] < 0 || shift[i] > 7) {
                System.out.println("invalid");
                shift[i] = Integer.parseInt(input.nextLine());
                totalshift = totalshift + shift[i];
                if (shift[i] > terbanyak) {
                    terbanyak = shift[i];
                    maxnama = nama[i];
                }
                if (shift[i] < terdikit) {
                    terdikit = shift[i];
                    minnama = nama[i];
                }
            } else {
                totalshift = totalshift + shift[i];
                if (shift[i] > terbanyak) {
                    terbanyak = shift[i];
                    maxnama = nama[i];
                }
                if (shift[i] < terdikit) {
                    terdikit = shift[i];
                    minnama = nama[i];
                }
            }
        }
        for (i = 0; i <= n - 1; i++) {
            System.out.println(nama[i] + "=" + shift[i]);
        }
        ratarata = totalshift / n;
        if (ratarata < 3) {
            status = "distribusi tidak merata";
        }
        if (ratarata >= 5) {
            status = "Shift terlalu padat";
        }
        System.out.println("totalshift=" + totalshift);
        System.out.println("rata rata=" + ratarata);
        System.out.println("shiftterbanyak=" + terbanyak);
        System.out.println("shiftterdikit=" + terdikit);
        System.out.println("status=" + status);
    }
}
