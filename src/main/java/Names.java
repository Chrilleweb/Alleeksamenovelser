import javax.naming.Name;
import javax.swing.*;

public class Names {
    private String firstName;
    private String middleName;
    private String lastName;

    public Names(String fullName){
        String[] names = fullName.split(" ");
        this.firstName = names[0];
        if (names.length == 2){
            this.lastName = names[1];
        } else if (names.length == 3) {
            this.middleName = names[1];
            this.lastName = names[2];
        }
    }

    @Override
    public String toString() {
        if (middleName == null){
            return firstName + " " + lastName;
        }
        return firstName + " " + middleName + " " + lastName;
    }

    public static void main(String[] args) {
        Names names = new Names("Christin nissen");
        System.out.println(names);
    }
}




