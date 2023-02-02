import java.util.ArrayList;
import java.util.Collections;

public class HogwartsStudent {
    private String firstName;
    private String lastName;
    private String house;

    public HogwartsStudent(String lastName){
        this.lastName = lastName;
    }

    public void setHouse(String house){
        try {
            if (house.equals("Gryffindor") || house.equals("RavenClaw")){
                System.out.println("accepted");
                this.house = house;
            }
        } catch (Exception e){
            System.out.println("Not accepted");
        }
    }



    public static void main(String[] args) {
        ArrayList<HogwartsStudent> hogwortsStudentLastName = new ArrayList<>();
        HogwartsStudent hogwartsStudent = new HogwartsStudent("Potter");
        HogwartsStudent hogwartsStudent1 = new HogwartsStudent("Wiesly");
        HogwartsStudent hogwartsStudent2 = new HogwartsStudent("Hermione");
        hogwortsStudentLastName.add(hogwartsStudent1);
        hogwortsStudentLastName.add(hogwartsStudent2);
        hogwortsStudentLastName.add(hogwartsStudent);

        //Collections.sort(hogwortsStudentLastName, ());

    }
}
