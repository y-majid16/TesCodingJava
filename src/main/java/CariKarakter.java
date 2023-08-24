import java.util.ArrayList;
import java.util.List;

public class CariKarakter {
    static String kalimat="LOrem ipsum dolor sit amet, consectetur adipiscing elit. " +
            "Donec viverra erat at eros consectetur, ut malesuada leo venenatis. Sed eget erat sit amet massa " +
            "tincidunt porttitor vel sed dolor. Nam ornare felis quis metus congue sodales. Nam iaculis convallis elementum. " +
            "Nulla pulvinar tortor sit amet commodo rhoncus. Morbi consequat tortor vitae lorem tempor, vel condimentum " +
            "sapien porttitor. Vestibulum ut dictum ante, id mattis ligula. " +
            "Aenean feugiat risus eu neque egestas, vitae mollis purus hendrerit.";
    public static boolean isVokalOrKonsonan(char c){
        return "AEIOUaeiouBCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz".indexOf(c) != -1;
    }

    public static String cariKarakter(){
        String karakter="";
        for (int i=0; i < kalimat.length(); i++){
            char ch = kalimat.charAt(i);
            if (karakter.indexOf(ch)== -1 && !isVokalOrKonsonan(ch)){
                karakter+= ch;
            }
        } return karakter;

    }

    public static List<String> createArray(String kalimat){
        List<String> array = new ArrayList<>();
        for (int i = 0; i <=kalimat.length()-1 ; i++) {
            array.add(String.valueOf(kalimat.charAt(i)));
        }
        return array;
    }
    public static Integer getTotalSpace(List<String>kalimatList){
        return Math.toIntExact(kalimatList.stream().filter(a -> a.equals(" ")).count());
    }
    public static Integer getTotalComa(List<String>kalimatList){
        return Math.toIntExact(kalimatList.stream().filter(a -> a.equals(",")).count());
    }
    public static Integer getTotalDot(List<String>kalimatList){
        return Math.toIntExact(kalimatList.stream().filter(a -> a.equals(".")).count());
    }

    public static void main(String[] args) {
        System.out.println("Jenis Karakter = ("+cariKarakter()+")");
        List<String> kalimatList = createArray(kalimat);
        System.out.println("total spasi " + getTotalSpace(kalimatList));
        System.out.println("total koma " + getTotalComa(kalimatList));
        System.out.println("total titik " + getTotalDot(kalimatList));

    }

}
