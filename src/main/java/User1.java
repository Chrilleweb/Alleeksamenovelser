import javax.management.relation.Role;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.*;

public class User1 {
    private enum role{
        ADMIN,
        EDITOR,
        READER
    }
    private Integer[] ints = {1, 2, 3, 4, 5, 6, 7};
    private ArrayList<String> sortListe = new ArrayList<>();
    private Date date;

    public User1(Date date){
        this.date = date;
    }


    public int sum(){
        int sum = 0;
        for (int i=0; i<ints.length; i++){
            sum += ints[i];
            String first = sortListe.get(0);
            int length = sortListe.size();
            int intlength = ints.length;
            int max = Collections.max(Arrays.asList(ints));
            int min = Collections.min(Arrays.asList(ints));
        }
        return sum;
    }

    public int finedMax(){
        int max = ints[0];
        for (int i=0; i < ints.length; i++){
            if (max < ints[i]){
                max = ints[i];
            }
        }
        return max;
    }

    public void sortList(){
        sortListe.add("aajaj");
        sortListe.add("ggajaj");
        sortListe.add("fajaj");
        sortListe.add("xajaj");
        sortListe.add("qajaj");
        Collections.sort(sortListe);
        System.out.println(sortListe);
    }

    public void findMax(){
        int max = Collections.max(Arrays.asList(ints));
        System.out.println(max);
    }

    public int findMin(){
        int min = Collections.min(Arrays.asList(ints));
        return min;
    }

    public void getRole(){
        role myRole = role.ADMIN;
        switch (myRole){
            case ADMIN -> {
                System.out.println("Admin");
            } case EDITOR -> {
                System.out.println("Editor");
            } case READER -> {
                System.out.println("Reader");
            }
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        User1 user1 = new User1(new Date(2013, 12, 11));
        System.out.println(user1.sum());
        user1.findMax();
        System.out.println(user1.findMin());
        user1.sortList();
        PrintStream output = new PrintStream("sss.csv");
        Scanner scanner = new Scanner(System.in);
        //String name = scanner.nextLine();
        String last = "last";
        char firstLetter = last.charAt(1);
        System.out.println(firstLetter);
        System.out.println(user1.finedMax());
    }

}
