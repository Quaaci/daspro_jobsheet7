import java.util.Scanner;

/**
 * ForKelipatan27
 */
public class ForKelipatan27 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int kelipatan, jumlah = 0, counter = 0;
        double rata = 0;
        

        System.out.println("Masukan Bilangan Kelipatan (1-9): ");
        kelipatan = scan.nextInt();

        for (int i = 1; i <= 50; i++) {
            if (i % kelipatan == 0) {
                jumlah += i;
                counter++;

                
            }
            rata = (double) jumlah / counter;
        } 
                System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
                System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, jumlah);
                System.out.println("Rata - rata: " + rata);

    }
}