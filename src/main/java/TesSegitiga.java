public class TesSegitiga {

    public static void main(String[] args) {
        int tinggi=5;

        for(int a=1; a<=tinggi; a++) {
            for (int b=1; b<=tinggi - a; b++) {
                System.out.print(" ");
            }

            for (int c=1; c <=2 * a-1; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
