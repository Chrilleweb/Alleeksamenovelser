import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Random;

public class ExamQuestion {
    private int number;
    private char[] grade = {'A', 'B', 'C', 'D', 'E', 'F'};

    public char randomGrade(){
        Random random = new Random();
        int index = random.nextInt(grade.length);
        char randomGrade = grade[index];
        return randomGrade;
    }

    public void list(){
        for (int i = 1; i < 15; i++){
            System.out.println(i + " " + randomGrade());
        }
    }

    public static void main(String[] args) {
        ExamQuestion examQuestion = new ExamQuestion();
        examQuestion.list();
    }

}
