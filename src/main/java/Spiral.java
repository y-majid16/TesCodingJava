import java.util.Scanner;

public class Spiral {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                String space= " ";
                int a, b, c, d, e, f, s, num;
                System.out.print("Input ukuran Spiral : ");
                s = sc.nextInt();

                int[][] pattern = new int[s][s];
                num = 1;
                a = 0; // array baris indeks
                b = 0; //array kolom indeks
                c = 0;
                d = s - 1;
                e = 0;
                f = s - 1;
                while (num <= s * s) {
                    // kiri ke kanan horizontal
                    for (b = e; b <= f; b++) {
                        num++;
                    }
                    // update baris batas bawah indeks
                    c++;

                    // atas ke bawah vertical
                    for (a = c; a <= d; a++) {
                        pattern[a][f] = num;
                        num++;
                    }

                    // update kolom batas atas indeks
                    f--;

                    // kanan ke kiri horizon
                    for (b = f; b >= e; b--) {
                        pattern[d][b] = num;
                        num++;
                    }

                    // update baris batas atas indeks
                    d--;

                    // bawah ke atas vertical
                    for (a = d; a >= c; a--) {
                        pattern[a][e] = num;
                        num++;
                    }

                    // update kolom batas bawah indeks
                    e++;
                }

                System.out.println(" ");
                for (a = 0; a < s; a++) {
                    for (b = 0; b < s; b++) {
                        System.out.print(pattern[a][b]+" ");
                    }
                    System.out.println("  ");

                }
    }
}
