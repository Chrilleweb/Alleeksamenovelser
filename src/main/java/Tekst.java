import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Tekst {
    private ArrayList<String> tekstLinjer;

    public Tekst(){
        this.tekstLinjer = new ArrayList<>();
    }

    public void tilføj(String tekst){
        tekstLinjer.add(tekst);
    }

    public void findAntalUnikke(){
        Set<String> unikke = new HashSet<>(tekstLinjer);
        System.out.println(unikke);
    }


    public static void main(String[] args) {
        Tekst tekst = new Tekst();
        tekst.tilføj("hej");
        tekst.tilføj("med");
        tekst.tilføj("dig");
        tekst.tilføj("dig");
        tekst.tilføj("digmed");
        tekst.tilføj("digmedd");
        tekst.findAntalUnikke();
    }
}
