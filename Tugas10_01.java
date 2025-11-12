import java.util.Scanner;

public class Tugas10_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jmlResponden = 10;
        int jmlPertanyaan = 6;
        int[][] hasilSurvey = new int[jmlResponden][jmlPertanyaan];

        for (int i = 0; i < jmlResponden; i++) {
            System.out.println("\nResponden ke-" + (i + 1));
            for (int j = 0; j < jmlPertanyaan; j++) {
                int nilai;
                do {
                    System.out.print("Nilai pertanyaan ke-" + (j + 1) + " (1-5): ");
                    nilai = sc.nextInt();
                    if (nilai < 1 || nilai > 5) {
                        System.out.println("Masukkan angka antara 1 sampai 5.");
                    }
                } while (nilai < 1 || nilai > 5);
                hasilSurvey[i][j] = nilai;
            }
        }

        System.out.println("Rata-rata untuk setiap responden:");
        for (int i = 0; i < jmlResponden; i++) {
            double total = 0;
            for (int j = 0; j < jmlPertanyaan; j++) {
                total += hasilSurvey[i][j];
            }
            double rataResponden = total / jmlPertanyaan;
            System.out.println("Responden " + (i + 1) + ": " + rataResponden);
        }

        System.out.println("Rata-rata untuk setiap pertanyaan:");
        for (int j = 0; j < jmlPertanyaan; j++) {
            double total = 0;
            for (int i = 0; i < jmlResponden; i++) {
                total += hasilSurvey[i][j];
            }
            double rataPertanyaan = total / jmlResponden;
            System.out.println("Pertanyaan " + (j + 1) + ": " + rataPertanyaan);
        }

        double totKeseluruhan = 0;
        for (int i = 0; i < jmlResponden; i++) {
            for (int j = 0; j < jmlPertanyaan; j++) {
                totKeseluruhan += hasilSurvey[i][j];
            }
        }
        double rataKeseluruhan = totKeseluruhan / (jmlResponden * jmlPertanyaan);
        System.out.println("Rata-rata keseluruhan: " + rataKeseluruhan);
    }
}
