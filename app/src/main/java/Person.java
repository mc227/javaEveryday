import java.time.LocalDate;

public abstract class Person {
    private final String first;
    private final String last;
    private final LocalDate dob;

    protected Person(String first, String last, LocalDate dob) {
        this.first = first;
        this.last = last;
        this.dob = dob;
    }

}
