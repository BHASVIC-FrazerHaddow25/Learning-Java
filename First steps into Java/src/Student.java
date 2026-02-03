public class Student extends Person {
    private int score;
    public Student(String givenName, String familyName, int birthDay, int birthMonth, int birthYear) {
        super(givenName,familyName,birthDay,birthMonth,birthYear);

        score = 0;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
}
