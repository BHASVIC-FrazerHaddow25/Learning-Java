import java.time.LocalDate;

public class Person {
    private String givenName;
    private String familyName;

    private LocalDate dateOfBirth;
    public Person(String givenName, String familyName, int birthDay, int birthMonth, int birthYear) {
        this.givenName = givenName;
        this.familyName = familyName;

        dateOfBirth = LocalDate.of(birthYear, birthMonth, birthDay);
    }
}
