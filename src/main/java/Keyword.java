import java.lang.reflect.Array;
import java.security.Key;
import java.util.ArrayList;

public class Keyword {
    private String word;
    private String definition;
    private ArrayList<String> seeAlso = new ArrayList<>();

    public Keyword(String word, String definition){
        this.word = word;
        this.definition = definition;
    }

    public void matches(String søgeOrd){
        if (word.trim().toLowerCase().contains(søgeOrd.trim().toLowerCase())){
            System.out.println("The word matches: " + word);
            System.out.println(seeAlso);
        } else {
            System.out.println("Sorry it dosent match anything");
        }
    }

    public void setSeeAlso(String see){
        seeAlso.add(see);
    }

    public String udskriv(){
        return word + " " + definition;
    }

    public static void main(String[] args) {
        Keyword keyword = new Keyword("orale", "oralept2");
        Keyword keyword1 = new Keyword("orale", "oralept2");
        keyword.setSeeAlso("oraleeeee");
        keyword.matches("orale");
    }

}
