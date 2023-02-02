import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Dream {
    private Date date;
    private double duration;
    private String type;

    public Dream(Date date, double duration, String type){
        this.date = date;
        this.duration = duration;
        this.type = type;
    }

    public void isPleasant(){
        if (type.equals("mareridt")){
            System.out.println("That was a nightmare !");
        } else if (type.equals("våd") && duration < 10) {
            System.out.println("That was a good dream");
        } else if (type.equals("tør") && duration > 10) {
            System.out.println("that was a good dream");
        }
    }


    public static void main(String[] args) {
        List<Dream> dreams = new ArrayList<Dream>();
        dreams.add(new Dream(new Date(2022, 12, 12), 15, "tør"));
        dreams.add(new Dream(new Date(2022, 11, 15), 5, "våd"));
        dreams.add(new Dream(new Date(2022, 10, 30), 30, "mareridt"));

        Collections.sort(dreams, (Dream d1, Dream d2) -> d1.date.compareTo(d2.date));
    }


}
