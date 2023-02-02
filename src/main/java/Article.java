import java.security.PublicKey;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Article {
    private String heading = "Head";
    private String body = "this a the body of the tekst kodning fff fff fff";
    private String author = "Christian";

    public String getLongestWord(){
        String[] word = body.split(" ");
        String rts = " ";
        for (int i = 0; i < word.length; i++){
            if (word[i].length() >= rts.length()){
                rts = word[i];
            }
        }
        return rts;
    }

    public void getWords(){
        Set<String> unikkeOrd = new HashSet<String>(Arrays.asList(body.split("\\+s")));
        System.out.println(unikkeOrd);
    }

    public static void main(String[] args) {
        Article article = new Article();
        System.out.println(article.getLongestWord());
        article.getWords();
    }
}


