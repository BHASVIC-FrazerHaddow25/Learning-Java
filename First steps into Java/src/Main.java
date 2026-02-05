import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    private String getString(String prompt){
        String ret;
        Scanner inp =new Scanner(System.in);
        System.out.println(prompt);
        ret=inp.nextLine();

        return ret;
    }
    private int getInteger(String prompt) {
        int ret;
        Scanner inp = new Scanner(System.in);
        System.out.println(prompt);
        ret = inp.nextInt();

        return ret;
    }
    private ArrayList<Student> myClass = new ArrayList<>();
    String end;
    String firstName;
    String lastName;
    int dayOfBirth;
    int monthOfBirth;
    private void enterClassDetails() {
        String end;
        String firstName;
        String lastName;
        int dayOfBirth;
        int monthOfBirth;
        int yearOfBirth;
        int score;

        do {
            firstName = getString("Student first name: ");
            lastName = getString("Student lastname: ");
            dayOfBirth = getInteger("Student day of birth: ");
            monthOfBirth = getInteger("Student month of birth: ");
            yearOfBirth = getInteger("Student year of birth: ");


            Student s = new Student(firstName, lastName, dayOfBirth, monthOfBirth, yearOfBirth);
            score = getInteger("Student score: ");
            s.setScore(score);

            myClass.add(s);

            end = getString("Add another student: ");
        } while (!end.toLowerCase().contains("n"));
    }
    public Student findMax (){
        int maxScore=-1;
        int counter=0;
        Student max=null;
        for (counter=0; counter<myClass.size(); counter++){
            Student s = myClass.get(counter);

            if (s.getScore()>maxScore){
                max=s;
                maxScore=s.getScore();

            }
        }
        return max;
    }
    private void doStuff(){
        enterClassDetails();

        Student maxScorer= findMax();

        System.out.println("The heighst score was " + maxScorer.toString());
    }


}

