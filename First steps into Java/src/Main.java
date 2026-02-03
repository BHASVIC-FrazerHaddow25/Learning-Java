import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    String end;
    String firstName;
    String lastName;
    int dayOfBirth;
    int monthOfBirth;
    private ArrayList<Student> myClass = new ArrayList<>();

    private int getInteger(String prompt) {
        int ret;
        Scanner inp = new Scanner(System.in);
        System.out.println(prompt);
        ret = inp.nextInt();

        return ret;
    }
}