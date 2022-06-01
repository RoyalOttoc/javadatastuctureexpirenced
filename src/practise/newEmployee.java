package practise;

public class newEmployee {

    private String firstName;
    private String lastName;
    private int id;

    public newEmployee(String firstName, String lastName, int id) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    @Override
    public String toString() {
        return "new Employee [firstName=" + firstName + ", lastName=" + lastName + ", id=" + id + "]";
    }
}
