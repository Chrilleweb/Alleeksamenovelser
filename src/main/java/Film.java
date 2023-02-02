import java.time.LocalDate;
import java.time.Year;
import java.util.Date;

public class Film {
    private String filmTitle;
    private int udgivelsesÅr;
    private Producer producer;

    public Film(String filmTitle, int udgivelsesÅr){
        this.filmTitle = filmTitle;
        this.udgivelsesÅr = udgivelsesÅr;
    }

    public Film(String filmTitle){
        this.filmTitle = filmTitle;
        this.udgivelsesÅr = LocalDate.now().getYear();
    }

    public void setProducer(Producer producer){
        this.producer = producer;
    }


}
