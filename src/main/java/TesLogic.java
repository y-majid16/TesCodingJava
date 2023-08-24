public class TesLogic {

    static String kalimat="LOrem ipsum dolor sit amet, consectetur adipiscing elit. " +
            "Donec viverra erat at eros consectetur, ut malesuada leo venenatis. Sed eget erat sit amet massa " +
            "tincidunt porttitor vel sed dolor. Nam ornare felis quis metus congue sodales. Nam iaculis convallis elementum. " +
            "Nulla pulvinar tortor sit amet commodo rhoncus. Morbi consequat tortor vitae lorem tempor, vel condimentum " +
            "sapien porttitor. Vestibulum ut dictum ante, id mattis ligula. " +
            "Aenean feugiat risus eu neque egestas, vitae mollis purus hendrerit.";

    static int totalHuruf(){
        int total = kalimat.length();
        return total;
    }
    static int totalHurufVokal(){
        int vokal=0;
        char c;
        for (int i=0;i<kalimat.length();i++){
            c=kalimat.charAt(i);
            if (c=='a'||c=='i'||c=='u'||c=='e'||c=='o' ||
                c=='A'||c=='I'||c=='U'||c=='E'||c=='O'){
                vokal++;
            }
        }
        return vokal;
    }
    static int totalKarakter(){
        int totalKarakter=0;

        int comma = 0;
        int dot = 0;
        int BlankSpace = 0;

        for (char karakter : kalimat.toCharArray()) {
            if (karakter == ',') {
                comma++;
            } else if (karakter == '.') {
                dot++;
            } else if (karakter == ' ') {
                BlankSpace++;
            }
        }
        return totalKarakter+(comma+dot+BlankSpace);
    }
    static int totalKata(){
        int totalKata=kalimat.split("\\s+").length;
        return totalKata;
    }

    public static void main(String[] args) {
        System.out.println("Total Vokal = " + totalHurufVokal());
        System.out.println("Total Konsonan = " + (totalHuruf() - totalHurufVokal()));
        System.out.println("Total Karakter(',' '.' ' ') = " + totalKarakter());
        System.out.println("Total Kata = " + totalKata());

        int a,b,c;
        int n=3;

        for (a=1; a<n;a++){
            for (b=2; b>=a;b--){
                System.out.print(" ");
            }
            for (c=1; c<a*2; c++){
                System.out.print("*");
            }
            System.out.print(" ");
        }
        for (a=3; a>0; a--){
            for (c=n;c>a; c--){
                System.out.print(" ");
            }
            for (b=1;b<a*2; b++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
