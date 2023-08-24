import java.util.ArrayList;
import java.util.List;

public class CariKarakter1 {
    public static void main(String[] args) {
        String kalimat="LOrem ipsum dolor sit amet, consectetur adipiscing elit. " +
                "Donec viverra erat at eros consectetur, ut malesuada leo venenatis. Sed eget erat sit amet massa " +
                "tincidunt porttitor vel sed dolor. Nam ornare felis quis metus congue sodales. Nam iaculis convallis elementum. " +
                "Nulla pulvinar tortor sit amet commodo rhoncus. Morbi consequat tortor vitae lorem tempor, vel condimentum " +
                "sapien porttitor. Vestibulum ut dictum ante, id mattis ligula. " +
                "Aenean feugiat risus eu neque egestas, vitae mollis purus hendrerit.";

        String vokal = "AEIOUaeiou";
        String konsonan = "BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz";
        String ch="";


        List<String> array = new ArrayList<>();
        for (int i = 0; i <=kalimat.length()-1 ; i++) {
            array.add(String.valueOf(kalimat.charAt(i)));
            char c= kalimat.charAt(i);

        }
    }
}
